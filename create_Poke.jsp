<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<pre>
<form action ="saveRecord" method="post">
       <h2>PokeMon</h2>
       PokeMonFounder<input type="text" name="pokeMonFounder"/>
       Breed<input type="text" name="breed"/>
       Description<input type="text" name="description"/>
       <select name="pokeMonVersion">
       <option value="PokeMon Blue">PokeMon Blue</option>
       <option value="PokeMon Red">PokeMon Red</option>
       <option value="PokeMon yellow">PokeMon Yellow</option>
       <option value="pokeMon Green">PokeMon Green</option>
       </select>
      <input type="submit" value="save"/>
</form>
</pre>

</body>
</html>