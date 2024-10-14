/**
 * 
 */
package com.api.users;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author User
 *
 */
@Service
public class UsersService {

	 @Autowired
	    private UsersRepository userRepository;

	    // Create a new user
	    public Users createUser(Users user) {
	        Users u1 = userRepository.save(user);
	        System.out.println(u1.getId());
	        System.out.println("hello");
	        return u1;
	        
	    }

	    // Get all users
	    public List<Users> getAllUsers() {
	        return userRepository.findAll();
	    }

	    // Get a user by ID
	    public Optional<Users> getUserById(Long id) {
	        return userRepository.findById(id);
	    }

	    // Update an existing user
	    public Users updateUser(Long id, Users updatedUser) {
	    	updatedUser.setId(id); // Ensure the updatedUser has the correct ID
	        return userRepository.findById(id)
	                .map(user -> userRepository.save(updatedUser))
	                .orElseThrow(() -> new RuntimeException("User not found"));
	    }

	    // Delete a user by ID
	    public void deleteUser(Long id) {
	        userRepository.deleteById(id);
	    }
}
