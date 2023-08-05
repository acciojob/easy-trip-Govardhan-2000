package com.driver;

import com.driver.model.Airport;
import com.driver.model.Flight;
import com.driver.model.Passenger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ControlerClass {
    @Autowired
    private ServiceClass serviceClass;

    @PostMapping("/addAirport")
    public void addAirport(@RequestBody Airport airport) {
        serviceClass.addAirport(airport);
    }

    @GetMapping("/getAirport/{airportName}")
    public Airport getAirport(@PathVariable String airportName) {
        return serviceClass.getAirport(airportName);
    }

    @PostMapping("/addFlight")
    public void addFlight(@RequestBody Flight flight) {
        serviceClass.addFlight(flight);
    }

    @GetMapping("/getFlight/{flightId}")
    public Flight getFlight(@PathVariable int flightId) {
        return serviceClass.getFlight(flightId);
    }

    @PostMapping("/addPassenger")
    public void addPassenger(@RequestBody Passenger passenger) {
        serviceClass.addPassenger(passenger);
    }

    @GetMapping("/getPassenger/{passengerId}")
    public Passenger getPassenger(@PathVariable int passengerId) {
        return serviceClass.getPassenger(passengerId);
    }
}
