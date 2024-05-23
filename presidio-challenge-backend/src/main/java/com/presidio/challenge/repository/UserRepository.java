package com.presidio.challenge.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.presidio.challenge.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long>{
		
	public Optional<UserEntity> findByEmailAndPassword(String email,String password);
}
