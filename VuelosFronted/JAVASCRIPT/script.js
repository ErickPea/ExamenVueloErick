 document.addEventListener('DOMContentLoaded', () => {
            loadAirports();
        });

        async function loadAirports() {
            try {
                const response = await fetch('http://localhost:8000/1v/api/Airports');
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
            } catch (error) {
                console.error('Error al cargar aeropuertos:', error);
            }
        }

        async function searchFlights() {
            const origin = document.getElementById('origin').value;
            const destination = document.getElementById('destination').value;
            const cabin = document.getElementById('cabin').value;
            const departureDate = document.getElementById('departure-date').value;
            const returnDate = document.getElementById('return-date').value;
            const tripType = document.querySelector('input[name="tripType"]:checked').value;

            if (!departureDate) {
                alert('La fecha de salida es obligatoria.');
                return;
            }

            if (tripType === 'roundtrip' && new Date(returnDate) <= new Date(departureDate)) {
                alert('La fecha de regreso debe ser posterior a la fecha de salida.');
                return;
            }

            try {
                const response = await fetch(`http://localhost:8000/1v/api/Routes?origin=${origin}&destination=${destination}&cabin=${cabin}&departureDate=${departureDate}&returnDate=${returnDate}&tripType=${tripType}`);
                const flights = await response.json();
                displayFlights(flights);
            } catch (error) {
                console.error('Error al buscar vuelos:', error);
            }
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
                    <td><button onclick="reserveFlight(${flight.id})">Reservar</button></td>
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
                    <td><button onclick="reserveFlight(${flight.id})">Reservar</button></td>
                `;
                returnTableBody.appendChild(row);
            });
        }

        function reserveFlight(flightId) {
            const passengers = prompt('Ingrese el número de pasajeros:');
            if (passengers) {
                fetch('http://localhost:8000/1v/api/reserve', {
                    method: 'POST',
                    headers: {
                        'Content-Type': 'application/json'
                    },
                    body: JSON.stringify({ flightId, passengers })
                })
                .then(response => response.json())
                .then(data => {
                    alert(`Reserva realizada con éxito. ID de la reserva: ${data.reservationId}`);
                })
                .catch(error => {
                    console.error('Error al reservar el vuelo:', error);
                });
            }

            
            document.getElementById('reservar-vuelo').addEventListener('click', function() {
              window.location.href = '../view/confirmacionreserva.html';
          });
          
          document.getElementById('salir').addEventListener('click', function() {
              const confirmReservation = document.getElementById('confirm-reservation');
              confirmReservation.classList.remove('visible');
          });
        }