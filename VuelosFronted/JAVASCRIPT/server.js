const express = require('express');
const mysql = require('mysql');
const cors = require('cors');

const app = express();
app.use(cors());
app.use(express.json());

const db = mysql.createConnection({
  host: 'localhost',
  user: 'root', 
  password: '', 
  database: 'session3'
});

db.connect(err => {
  if (err) {
    throw err;
  }
  console.log('Conectado a la base de datos MySQL');
});

app.get('1v/api/airports', (req, res) => {
  const sql = 'SELECT IATACode, Name FROM Airports';
  db.query(sql, (err, results) => {
    if (err) throw err;
    res.json(results);
  });
});

app.get('v1/api/Routes', (req, res) => {
  const { origin, destination, cabin, departureDate, returnDate, tripType } = req.query;
  let sql = 'SELECT * FROM Flights WHERE origin = ? AND destination = ? AND departureDate = ? AND cabin = ?';
  const values = [origin, destination, departureDate, cabin];

  if (tripType === 'roundtrip') {
    sql += ' AND returnDate = ?';
    values.push(returnDate);
  }

  db.query(sql, values, (err, results) => {
    if (err) throw err;
    const flights = {
      departureFlights: results,
      returnFlights: tripType === 'roundtrip' ? results : []
    };
    res.json(flights);
  });
});

const PORT = 3306;
app.listen(PORT, () => {
  console.log(`Servidor corriendo en el puerto ${PORT}`);
});
