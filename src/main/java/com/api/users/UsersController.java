/**
 * 
 */
package com.api.users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

/**
 * @author User
 *
 */
@RestController
@RequestMapping("/users")
public class UsersController {

	
	 @Autowired
	    private UsersService userService;

	    // Create a new user
	    @Operation(summary = "Create a new user")
	    @ApiResponse(responseCode = "200", description = "User created successfully")
	    @PostMapping
	    public ResponseEntity<Users> createUser(@RequestBody Users user) {
	        Users createdUser = userService.createUser(user);
	        return ResponseEntity.ok(createdUser);
	    }

	    // Get a list of all users
	    @Operation(summary = "Get all users")
	    @ApiResponse(responseCode = "200", description = "List of users retrieved successfully")
	    @GetMapping
	    public List<Users> getAllUsers() {
	        return userService.getAllUsers();
	    }

	    
	    // Get a single user by ID
	    @Operation(summary = "Get a user by ID")
	    @ApiResponses({
	        @ApiResponse(responseCode = "200", description = "User found"),
	        @ApiResponse(responseCode = "404", description = "User not found")
	    })
	    @GetMapping("/{id}")
	    public ResponseEntity<Users> getUserById(@PathVariable Long id) {
	        return userService.getUserById(id)
	                .map(ResponseEntity::ok)
	                .orElse(ResponseEntity.notFound().build());
	    }

	    // Update a user by ID
	    @Operation(summary = "Update a user by ID")
	    @ApiResponses({
	        @ApiResponse(responseCode = "200", description = "User updated successfully"),
	        @ApiResponse(responseCode = "404", description = "User not found")
	    })
	    @PutMapping("/{id}")
	    public ResponseEntity<Users> updateUser(@PathVariable Long id, @RequestBody Users user) {
	        return ResponseEntity.ok(userService.updateUser(id, user));
	    }

	    // Delete a user by ID
	    @Operation(summary = "Delete a user by ID")
	    @ApiResponses({
	        @ApiResponse(responseCode = "204", description = "User deleted successfully"),
	        @ApiResponse(responseCode = "404", description = "User not found")
	    })
	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
	        userService.deleteUser(id);
	        return ResponseEntity.noContent().build();
	    }
}
