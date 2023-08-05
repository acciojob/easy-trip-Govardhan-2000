package com.driver;

import com.driver.model.Airport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AirportService {
    @Autowired
    private AirportRepository airportRepository;

    public void addAirport(Airport airport) {
        airportRepository.saveAirport(airport);
    }

    public Airport getAirport(String airportName) {
        return airportRepository.getAirport(airportName);
    }
}
