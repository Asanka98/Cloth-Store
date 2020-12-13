package com.shop.app.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.shop.app.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	
	//@Query(value = "SELECT address FROM customer WHERE idCustomer = :customerId", nativeQuery = true)
	//String getAddressById(@Param("customerId")int customerId);

}
