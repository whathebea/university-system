package dev.beagracia.msaddress.controller;

import dev.beagracia.msaddress.repository.AddressRepository;
import dev.beagracia.msaddress.request.CreateAddressRequest;
import dev.beagracia.msaddress.response.AddressResponse;
import dev.beagracia.msaddress.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/v1/address")
public class AddressController {

    @Autowired
    AddressService addressService;

    @PostMapping("/create")
    public ResponseEntity<AddressResponse> createAddress(@RequestBody CreateAddressRequest createAddressRequest)  {
        return addressService.createAddress(createAddressRequest);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<AddressResponse> getAddressById(@PathVariable Long id) {
        return addressService.getAddressById(id);
    }

}
