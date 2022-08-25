package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entities.Pokeman;
@Repository
public interface PokemanRepository extends JpaRepository<Pokeman,Long> {

}
