package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Pokeman;
import com.example.demo.repositories.PokemanRepository;
@Service
public class PokeManServiceClass implements PokeManService {

	@Autowired
	private PokemanRepository pokemanRepo;
	@Override
	public void savePokeman(Pokeman pokeman) {
       try {
		pokemanRepo.save(pokeman);
       }
       catch(Exception e)
       {
    	   e.printStackTrace();
       }
	}
	@Override
	public List<Pokeman> findAllPokeman() {
     
		List<Pokeman> pokemans=pokemanRepo.findAll();
		return pokemans;
	}
	@Override
	public void deletePokemanById(long pokemanID) {
		pokemanRepo.deleteById(pokemanID);
	}
	@Override
	public Pokeman getPokemanEditedDataById(long pokemanID) {
       
		Optional<Pokeman>findById=pokemanRepo.findById(pokemanID);
	    Pokeman pokeman=findById.get();
	    return pokeman;
	}

}
