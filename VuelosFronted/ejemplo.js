document.addEventListener("DOMContentLoaded", function() {
    fetchTrips();
  });
  
  function fetchTrips() {
    fetch('/api/trips')
      .then(response => response.json())
      .then(data => {
        window.trips = data;
        displayTrips(data);
      });
  }
  
  function displayTrips(data) {
    const tripTableBody = document.getElementById('tripTable').getElementsByTagName('tbody')[0];
    tripTableBody.innerHTML = '';
    data.forEach(trip => {
      const row = document.createElement('tr');
      const originCell = document.createElement('td');
      originCell.textContent = trip.origin;
      const destinationCell = document.createElement('td');
      destinationCell.textContent = trip.destination;
      row.appendChild(originCell);
      row.appendChild(destinationCell);
      tripTableBody.appendChild(row);
    });
  }
  
  function filterTrips() {
    const origin = document.getElementById('originFilter').value;
    const destination = document.getElementById('destinationFilter').value;
    
    let url = '/api/trips';
    let query = [];
  
    if (origin) {
      query.push(`origin=${encodeURIComponent(origin)}`);
    }
    if (destination) {
      query.push(`destination=${encodeURIComponent(destination)}`);
    }
  
    if (query.length > 0) {
      url += `?${query.join('&')}`;
    }
  
    fetch(url)
      .then(response => response.json())
      .then(data => displayTrips(data));
  }
  