package com.driver;

import com.driver.model.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightService {
    @Autowired
    private FlightRepository flightRepository;

    public void addFlight(Flight flight) {
        flightRepository.saveFlight(flight);
    }

    public Flight getFlight(int flightId) {
        return flightRepository.getFlight(flightId);
    }
}

