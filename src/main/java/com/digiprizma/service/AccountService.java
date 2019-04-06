package com.digiprizma.service;

import com.digiprizma.entities.AppRole;
import com.digiprizma.entities.AppUser;

/**
 * 
 * @author SKAN
 *
 */
public interface AccountService {

	/**
	 * Sign in Method
	 * 
	 * @param username
	 * @param password
	 * @param confirmedPassword
	 * @return
	 */
	AppUser saveUser(String username, String password, String confirmedPassword);
	
	/**
	 * Save Role
	 * 
	 * @param role
	 * @return
	 */
	AppRole save(AppRole role);
	
	/**
	 * 
	 * @param userName
	 * @return
	 */
	AppUser loadUserByUsername(String userName);
	
	/**
	 * 
	 * @param username
	 * @param roleName
	 */
	void addRoleToUser(String username, String roleName);
}
