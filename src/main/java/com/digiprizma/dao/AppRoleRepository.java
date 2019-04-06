package com.digiprizma.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.digiprizma.entities.AppRole;

/**
 * 
 * @author SKAN
 *
 */
@RepositoryRestResource
public interface AppRoleRepository extends JpaRepository<AppRole, Long> {

	/**
	 * Find Role By Name
	 * 
	 * @param roleName
	 * @return
	 */
	AppRole findByRoleName(String roleName);
}
