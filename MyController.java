package com.example.demo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Pokeman;
import com.example.demo.repositories.PokemanRepository;

//CLASS OF WEBSERVICES--------------------------------------------------------
@RestController    //DEIFINE THE WEBSERVICES----------------------------------
@RequestMapping("/pokemon/api")    //BIND THE FORM DATA WITH HANDLER METHOD

public class MyController {
    @Autowired
    private PokemanRepository locationRepo;         //OBJECT OF Repository layer
    
    //Getting the data from database through webservices
    @GetMapping                                   //geting the data form database through webservices
	    public List<Pokeman>getData()
    {
    	List<Pokeman>pokemons=locationRepo.findAll();
    	return pokemons;
    }
    @PostMapping                         //saving the data in database through webservices
    public void savePokemon(@RequestBody Pokeman pokemon)
    {
    	locationRepo.save(pokemon);
    }
    @PutMapping                        //Updating the data through webservices
    public void updatePokemon(@RequestBody Pokeman pokemon)
    {
    	locationRepo.save(pokemon);
    }
    
    @DeleteMapping("/delete/{pokemonID}")    //deleting the data form database through webservices
    
 public void deleteLocation(@PathVariable("pokemonID") long pokemonID)
  {
	  locationRepo.deleteById(pokemonID);
  }

    
    
}
