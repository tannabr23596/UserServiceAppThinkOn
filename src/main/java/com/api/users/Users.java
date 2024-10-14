/**
 * 
 */
package com.api.users;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

/**
 * @author User
 *
 */
@Entity
@Table(name = "userspeople")
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(unique = true, nullable = false)
	@NotBlank(message = "Username is mandatory")
	private String username;
	 

	@Column(nullable = false)
    @NotBlank(message = "First name is mandatory")
    @Pattern(regexp = "^[A-Za-z]+$", message = "First name must contain only letters")
	private String firstName;
    
	@Column(nullable = false)
    @NotBlank(message = "Last name is mandatory")
    @Pattern(regexp = "^[A-Za-z]+$", message = "Last name must contain only letters")
	private String lastName;
    
	 @Column(nullable = false)
	 @Email(message = "Email should be valid")
	 @NotBlank(message = "Email is mandatory")
	private String email;
    
	 @Column(nullable = false)
	 @NotBlank(message = "Phone number is mandatory")
	 @Pattern(regexp = "^[0-9]{10}$", message = "Phone number must be 10 digits")
	private String phone;
	
	public Users() {
	    // Default constructor
	}

	public Users(Long id, String username, String firstName, String lastName, String email, String phone) {
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
	}

	/**
	 * 
	 * 
	 * 
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	 @Override
	    public String toString() {
	        return "Users{" +
	                "id=" + id +
	                ", username='" + username + '\'' +
	                ", firstName='" + firstName + '\'' +
	                ", lastName='" + lastName + '\'' +
	                ", email='" + email + '\'' +
	                ", phone='" + phone + '\'' +
	                '}';
	    }

}
