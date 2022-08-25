package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Pokeman;

public interface PokeManService {

	public void savePokeman(Pokeman pokeman);

	public List<Pokeman> findAllPokeman();

	public void deletePokemanById(long pokemanID);

	public Pokeman  getPokemanEditedDataById(long pokemanID);


}
