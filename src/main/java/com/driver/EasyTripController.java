package com.driver;

import com.driver.model.Airport;
import com.driver.model.Flight;
import com.driver.model.Passenger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EasyTripController {
    @Autowired
    private AirportService airportService;

    @Autowired
    private FlightService flightService;

    @Autowired
    private PassengerService passengerService;

    @PostMapping("/addAirport")
    public void addAirport(@RequestBody Airport airport) {
        airportService.addAirport(airport);
    }

    @GetMapping("/getAirport/{airportName}")
    public Airport getAirport(@PathVariable String airportName) {
        return airportService.getAirport(airportName);
    }

    @PostMapping("/addFlight")
    public void addFlight(@RequestBody Flight flight) {
        flightService.addFlight(flight);
    }

    @GetMapping("/getFlight/{flightId}")
    public Flight getFlight(@PathVariable int flightId) {
        return flightService.getFlight(flightId);
    }

    @PostMapping("/addPassenger")
    public void addPassenger(@RequestBody Passenger passenger) {
        passengerService.addPassenger(passenger);
    }

    @GetMapping("/getPassenger/{passengerId}")
    public Passenger getPassenger(@PathVariable int passengerId) {
        return passengerService.getPassenger(passengerId);
    }
}
