package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pokemon")
public class Pokeman {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long  pokemonID;
	
	@Column(name="pokeMonFounder",nullable=false, length=45)
	private String pokeMonFounder;
	
	@Column(name="breed",nullable=false, length=45)
	private String breed;
	
	@Column(name="description", nullable=false, length=200)
	private String description;
    @Column(name="pokeMonVersion", nullable=false)
    private String pokeMonVersion;
	public long getPokemonID() {
		return pokemonID;
	}
	public void setPokemonID(long pokemonID) {
		this.pokemonID = pokemonID;
	}
	public String getPokeMonFounder() {
		return pokeMonFounder;
	}
	public void setPokeMonFounder(String pokeMonFounder) {
		this.pokeMonFounder = pokeMonFounder;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPokeMonVersion() {
		return pokeMonVersion;
	}
	public void setPokeMonVersion(String pokeMonVersion) {
		this.pokeMonVersion = pokeMonVersion;
	}
	
	
	
    
	
}
