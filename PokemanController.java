package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entities.Pokeman;
import com.example.demo.services.PokeManService;

@Controller
public class PokemanController {

	@Autowired
	private PokeManService pokemanService;
	@RequestMapping("/view")
	public String viewCreatePokemanPage()                                              
	{
		return "create_Poke";
	}
	@RequestMapping("/saveRecord")
	public String saveNewPokeman(@ModelAttribute("pokeman") Pokeman pokeman, ModelMap model)
	{
		pokemanService.savePokeman(pokeman);
		model.addAttribute("pokeman", pokeman);
		return "pokeman_info";
	}
	@RequestMapping("/listall")
	public String listAllPokeman(ModelMap model)
	{
		List<Pokeman> pokemans = pokemanService.findAllPokeman();
		model.addAttribute("pokemans",pokemans);
		return "pokeman_result";
	}
	@RequestMapping("/delete")
	public String removePokeman(@RequestParam("pokemonID") long pokemonID, ModelMap model)
	{
		pokemanService.deletePokemanById(pokemonID);
		List<Pokeman> pokemans = pokemanService.findAllPokeman();
		model.addAttribute("pokemans",pokemans);
		return "pokeman_result";
	}
	@RequestMapping("/update")
	public String EditPokemanData(@RequestParam("pokemonID") long pokemonID, ModelMap model)
	{
		Pokeman pokeman = pokemanService.getPokemanEditedDataById(pokemonID);
		model.addAttribute("pokeman",pokeman);
		return "update_pokeman";
	}
	@RequestMapping("/updateData")
	public String updatePokeman(@ModelAttribute("loc") Pokeman pokeman, ModelMap model)
	{
       pokemanService.savePokeman(pokeman);
       model.addAttribute("msg","pokeman is updated");
       return "update_pokeman";
	}
}
