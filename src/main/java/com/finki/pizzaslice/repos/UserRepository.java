package com.finki.pizzaslice.repos;

import com.finki.pizzaslice.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
