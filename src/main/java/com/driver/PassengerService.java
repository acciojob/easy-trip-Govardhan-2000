package com.driver;

import com.driver.model.Passenger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PassengerService {
    @Autowired
    private PassengerRepository passengerRepository;

    public void addPassenger(Passenger passenger) {
        passengerRepository.savePassenger(passenger);
    }

    public Passenger getPassenger(int passengerId) {
        return passengerRepository.getPassenger(passengerId);
    }
}
