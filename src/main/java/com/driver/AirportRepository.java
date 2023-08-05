package com.driver;

import com.driver.model.Airport;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class AirportRepository {
    private final Map<String, Airport> airportMap = new HashMap<>();

    public void saveAirport(Airport airport) {
        airportMap.put(airport.getAirportName(), airport);
    }

    public Airport getAirport(String airportName) {
        return airportMap.get(airportName);
    }
}

