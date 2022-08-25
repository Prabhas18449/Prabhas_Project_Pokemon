<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="updateData" method="post">
<pre>
       <h2>updated data</h2>
       PokemonID<input type="text" name="pokemonID" value="${pokeman.pokemonID}"/>
       PokeMonFounder<input type="text" name="pokeMonFounder" value="${pokeman.pokeMonFounder}"/>
       Breed<input type="text" name="breed" value="${pokeman.breed}"/>
       Description<input type="text" name="description"value="${pokeman.description}"/>
       <select name="pokeMonVersion" value="${pokeman.pokeMonVersion}">
       <option value="PokeMon Blue">PokeMon Blue</option>
       <option value="PokeMon Red">PokeMon Red</option>
       <option value="PokeMon yellow">PokeMon Yellow</option>
       <option value="pokeMon Green">PokeMon Green</option>
       </select>
      <input type="submit" value="update"/>
      </form>
      </pre>
      ${msg }
</body>
</html>