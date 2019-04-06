package com.digiprizma.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.digiprizma.entities.AppUser;

/**
 * 
 * @author SKAN
 *
 */
@RepositoryRestResource
public interface AppUserRepository extends JpaRepository<AppUser, Long> {

	/**
	 * Find User By Name
	 * 
	 * @param username
	 * @return
	 */
	AppUser findByUsername(String username);
}
