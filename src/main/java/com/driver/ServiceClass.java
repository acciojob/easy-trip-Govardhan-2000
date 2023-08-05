package com.driver;

import com.driver.model.Airport;
import com.driver.model.Flight;
import com.driver.model.Passenger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceClass {
    @Autowired
    private AirportRepository airportRepository;

    @Autowired
    private FlightRepository flightRepository;

    @Autowired
    private PassengerRepository passengerRepository;

    // Airport methods
    public void addAirport(Airport airport) {
        airportRepository.saveAirport(airport);
    }

    public Airport getAirport(String airportName) {
        return airportRepository.getAirport(airportName);
    }

    // Flight methods
    public void addFlight(Flight flight) {
        flightRepository.saveFlight(flight);
    }

    public Flight getFlight(int flightId) {
        return flightRepository.getFlight(flightId);
    }

    // Passenger methods
    public void addPassenger(Passenger passenger) {
        passengerRepository.savePassenger(passenger);
    }

    public Passenger getPassenger(int passengerId) {
        return passengerRepository.getPassenger(passengerId);
    }
}
