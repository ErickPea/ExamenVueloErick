create database Session3;
use Session3;
/*ROLE*/

INSERT INTO Role (id, title) VALUES (1, 'Admin');
INSERT INTO Role (id, title) VALUES (2, 'User');

INSERT INTO Role (id, title) VALUES (1, 'Administrator');
INSERT INTO Role (id, Title) VALUES (2, 'Pilot');
INSERT INTO Role (id, Title) VALUES (3, 'Flight Attendant');
INSERT INTO Role (id, Title) VALUES (4, 'Ground Staff');
INSERT INTO Role (id, Title) VALUES (5, 'Customer Service');
/*COUNTRY*/
INSERT INTO Country (id, Name) VALUES (1, 'United States');
INSERT INTO Country (id, Name) VALUES (2, 'Canada');
INSERT INTO Country (id, Name) VALUES (3, 'Mexico');
INSERT INTO Country (id, Name) VALUES (4, 'United Kingdom');
INSERT INTO Country (id, Name) VALUES (5, 'Germany');
/*CABIN_TYPE*/
INSERT INTO Cabin_Type (id, name) VALUES (1, 'Economy');
INSERT INTO Cabin_Type (id, name) VALUES (2, 'Business');
INSERT INTO Cabin_Type (id, name) VALUES (3, 'First Class');
INSERT INTO Cabin_Type (id, name) VALUES (4, 'Premium Economy');
INSERT INTO Cabin_Type (id, name) VALUES (5, 'Basic Economy');
/*OFFICE*/
INSERT INTO Office (id, country_id, Title, Phone, Contact) VALUES (1, 1, 'Office 1', '123-456-7890', 'Contact 1');
INSERT INTO Office (id, country_id, Title, Phone, Contact) VALUES (2, 2, 'Office 2', '234-567-8901', 'Contact 2');
INSERT INTO Office (id, country_id, Title, Phone, Contact) VALUES (3, 3, 'Office 3', '345-678-9012', 'Contact 3');
INSERT INTO Office (id, country_id, Title, Phone, Contact) VALUES (4, 4, 'Office 4', '456-789-0123', 'Contact 4');
INSERT INTO Office (id, country_id, Title, Phone, Contact) VALUES (5, 5, 'Office 5', '567-890-1234', 'Contact 5');

/*USERS*/
INSERT INTO Users (id, first_name, last_name, email, password, birthdate, role_id, office_id) VALUES (1, 'Alice', 'Anderson', 'alice.anderson@example.com', 'password1', '1990-01-01', 1, 1);
INSERT INTO Users (id, first_name, last_name, email, password, birthdate, role_id, office_id) VALUES (2, 'Bob', 'Brown', 'bob.brown@example.com', 'password2', '1985-02-02', 2, 2);
INSERT INTO Users (id, first_name, last_name, email, password, birthdate, role_id, office_id) VALUES (3, 'Charlie', 'Clark', 'charlie.clark@example.com', 'password3', '1995-03-03', 3, 3);
INSERT INTO Users (id, first_name, last_name, email, password, birthdate, role_id, office_id) VALUES (4, 'Diana', 'Davis', 'diana.davis@example.com', 'password4', '2000-04-04', 4, 4);
INSERT INTO Users (id, first_name, last_name, email, password, birthdate, role_id, office_id) VALUES (5, 'Eve', 'Evans', 'eve.evans@example.com', 'password5', '1980-05-05', 5, 5);

/*AIRPORTS*/

INSERT INTO Airports (id, country_id, IATACode, name) VALUES (1, 1, 'JFK', 'John F. Kennedy International Airport');
INSERT INTO Airports (id, country_id, IATACode, name) VALUES (2, 2, 'LAX', 'Los Angeles International Airport');
INSERT INTO Airports (id, country_id, IATACode, name) VALUES (3, 3, 'ORD', 'O\'Hare International Airport');
INSERT INTO Airports (id, country_id, IATACode, name) VALUES (4, 4, 'ATL', 'Hartsfield-Jackson Atlanta International Airport');
INSERT INTO Airports (id, country_id, IATACode, name) VALUES (5, 5, 'DFW', 'Dallas/Fort Worth International Airport');
/*ROUTES*/

INSERT INTO Routes (id, Arrival_Aiport_id, Departure_Aiport_id, Distance, Flight_Time) VALUES (1, 1, 2, '2500 miles', '5 hours');
INSERT INTO Routes (id, Arrival_Aiport_id, Departure_Aiport_id, Distance, Flight_Time) VALUES (2, 2, 3, '1500 miles', '3 hours');
INSERT INTO Routes (id, Arrival_Aiport_id, Departure_Aiport_id, Distance, Flight_Time) VALUES (3, 3, 4, '1800 miles', '4 hours');
INSERT INTO Routes (id, Arrival_Aiport_id, Departure_Aiport_id, Distance, Flight_Time) VALUES (4, 4, 5, '2000 miles', '4.5 hours');
INSERT INTO Routes (id, Arrival_Aiport_id, Departure_Aiport_id, Distance, Flight_Time) VALUES (5, 5, 1, '2200 miles', '5 hours');
/*AIRCRAFT*/
INSERT INTO Aircraft (id, name, make_model, total_seats, economy_seats, business_seats) 
VALUES (1, 'Aircraft 1', 'Model 1', 200, 150, 50);

INSERT INTO Aircraft (id, name, make_model, total_seats, economy_seats, business_seats) 
VALUES (2, 'Aircraft 2', 'Model 2', 220, 170, 50);

INSERT INTO Aircraft (id, name, make_model, total_seats, economy_seats, business_seats) 
VALUES (3, 'Aircraft 3', 'Model 3', 180, 130, 50);
INSERT INTO Aircraft (id, name, make_model, total_seats, economy_seats, business_seats) 
VALUES (4, 'Aircraft 4', 'Model 4', 250, 200, 50);

INSERT INTO Schedules (id, date, time, aircraft_id, routes_id, economy_price, confirmed, flightnumber) VALUES (1, '2024-06-16', '10:00:00', 1, 1, '200', 'Y', 'AA100');
INSERT INTO Schedules (id, date, time, aircraft_id, routes_id, economy_price, confirmed, flightnumber) VALUES (2, '2024-06-17', '15:00:00', 2, 2, '250', 'Y', 'BA200');



INSERT INTO Tickets (id, users_id, schedule_id, cabin_type_id, first_name, last_name, email, phoned, passport_number, passport_country_id, passport_photo, booking_reference, confirmed) VALUES (1, 1, 1, 1, 'Alice', 'Brown', 'alice@example.com', '555-1234', 'A12345678', 1, 'path/to/photo1.jpg', 'REF123', 'Y');
INSERT INTO Tickets (id, users_id, schedule_id, cabin_type_id, first_name, last_name, email, phoned, passport_number, passport_country_id, passport_photo, booking_reference, confirmed) VALUES (2, 2, 2, 2, 'Bob', 'Smith', 'bob@example.com', '555-5678', 'B98765432', 2, 'path/to/photo2.jpg', 'REF456', 'Y');


