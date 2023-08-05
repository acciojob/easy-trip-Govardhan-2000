package com.driver;

import com.driver.model.Passenger;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class PassengerRepository {
    private final Map<Integer, Passenger> passengerMap = new HashMap<>();

    public void savePassenger(Passenger passenger) {
        passengerMap.put(passenger.getPassengerId(), passenger);
    }

    public Passenger getPassenger(int passengerId) {
        return passengerMap.get(passengerId);
    }
}
