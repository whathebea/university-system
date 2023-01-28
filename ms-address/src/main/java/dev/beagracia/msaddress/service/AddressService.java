package dev.beagracia.msaddress.service;

import dev.beagracia.msaddress.entity.Address;
import dev.beagracia.msaddress.repository.AddressRepository;
import dev.beagracia.msaddress.request.CreateAddressRequest;
import dev.beagracia.msaddress.response.AddressResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    AddressRepository addressRepository;

    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    public AddressService() {
    }

    public ResponseEntity<AddressResponse> createAddress(CreateAddressRequest createAddressRequest) {
        Address address = new Address();
        address.setStreet(createAddressRequest.getStreet());
        address.setCity(createAddressRequest.getCity());
        addressRepository.save(address);
        return ResponseEntity.ok(new AddressResponse(address));
    }

    public ResponseEntity<AddressResponse> getAddressById(Long id) {
        return addressRepository.findById(id).map(address -> {
            return ResponseEntity.ok(new AddressResponse(address));
        }).orElseThrow(() -> new RuntimeException("Address not found"));
    }
}
