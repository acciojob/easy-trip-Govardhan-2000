package com.driver;

import com.driver.model.Flight;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class FlightRepository {
    private final Map<Integer, Flight> flightMap = new HashMap<>();

    public void saveFlight(Flight flight) {
        flightMap.put(flight.getFlightId(), flight);
    }

    public Flight getFlight(int flightId) {
        return flightMap.get(flightId);
    }
}
