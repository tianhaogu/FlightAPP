package com.bharath.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bharath.flightreservation.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	// Follow by naming convention, "Email" is a field of User, so no need to write a query.
	User findByEmail(String email);

}
