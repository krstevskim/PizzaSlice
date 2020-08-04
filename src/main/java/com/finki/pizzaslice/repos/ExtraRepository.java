package com.finki.pizzaslice.repos;

import com.finki.pizzaslice.models.Extra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExtraRepository extends JpaRepository<Extra,Long> {


}
