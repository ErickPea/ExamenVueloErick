document.addEventListener('DOMContentLoaded', () => {
    loadAirports();
});

async function loadAirports() {
    const response = await fetch('1v/api/airports');
    const airports = await response.json();

    const originSelect = document.getElementById('origin');
    const destinationSelect = document.getElementById('destination');

    airports.forEach(airport => {
        const option = document.createElement('option');
        option.value = airport.IATACode;
        option.text = airport.Name;
        originSelect.add(option);

        const option2 = document.createElement('option');
        option2.value = airport.IATACode;
        option2.text = airport.Name;
        destinationSelect.add(option2);
    });
}

async function searchFlights() {
    const origin = document.getElementById('origin').value;
    const destination = document.getElementById('destination').value;
    const cabin = document.getElementById('cabin').value;
    const departureDate = document.getElementById('departure-date').value;
    const returnDate = document.getElementById('return-date').value;
    const tripType = document.querySelector('input[name="tripType"]:checked').value;

    const response = await fetch(`1v/api/flights?origin=${origin}&destination=${destination}&cabin=${cabin}&departureDate=${departureDate}&returnDate=${returnDate}&tripType=${tripType}`);
    const flights = await response.json();

    displayFlights(flights);
}

function displayFlights(data) {
    const { departureFlights, returnFlights } = data;
    const departureTableBody = document.getElementById('departure-flights-table').getElementsByTagName('tbody')[0];
    const returnTableBody = document.getElementById('return-flights-table').getElementsByTagName('tbody')[0];

    // Limpiar tablas
    departureTableBody.innerHTML = '';
    returnTableBody.innerHTML = '';

    departureFlights.forEach(flight => {
        const row = document.createElement('tr');

        row.innerHTML = `
            <td>${flight.origin}</td>
            <td>${flight.destination}</td>
            <td>${flight.date}</td>
            <td>${flight.time}</td>
            <td>${flight.flightNumber}</td>
            <td>${flight.price}</td>
        `;

        departureTableBody.appendChild(row);
    });

    returnFlights.forEach(flight => {
        const row = document.createElement('tr');

        row.innerHTML = `
            <td>${flight.origin}</td>
            <td>${flight.destination}</td>
            <td>${flight.date}</td>
            <td>${flight.time}</td>
            <td>${flight.flightNumber}</td>
            <td>${flight.price}</td>
        `;

        returnTableBody.appendChild(row);
    });
}
