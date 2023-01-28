package dev.beagracia.msaddress.repository;

import dev.beagracia.msaddress.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
