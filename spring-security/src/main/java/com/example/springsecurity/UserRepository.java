package com.example.springsecurity;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

@Component
public interface UserRepository extends JpaRepository<User, Integer>{
  
	@Query("SELECT usr FROM User usr WHERE userName=(:userName)")
	Optional<User> findByUserName(@Param("userName") String userName);
}
