package com.esad.ticketing.service.implementation;

import com.esad.ticketing.dto.PassengerDto;
import com.esad.ticketing.entity.Account;
import com.esad.ticketing.entity.Passenger;
import com.esad.ticketing.repository.AccountRepository;

import com.esad.ticketing.repository.PassengerRepository;
import com.esad.ticketing.service.interfaces.PassengerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PassengerServiceImpl implements PassengerService {

    @Autowired
    private PassengerRepository passengerRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public ResponseEntity<Passenger> signUpPassenger(PassengerDto passengerDto) {
        return new ResponseEntity<>(passengerRepository.save(modelMapper.map(passengerDto, Passenger.class)),HttpStatus.CREATED);
    }
}