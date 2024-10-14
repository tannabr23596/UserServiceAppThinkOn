/**
 * 
 */
package com.api.users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author User
 *
 */
@Repository
public interface UsersRepository extends JpaRepository<Users, Long>{

}
