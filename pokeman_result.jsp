<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body><table>
           <tr>
                 <th>pokemonID</th>
                 <th>pokeMonFounder</th>
                 <th>breed</th>
                 <th>description</th>
                 <th>pokeMonVersion</th>
           </tr>
           <c:forEach items="${pokemans}" var="pokeman">
           <tr>
              <td>${pokeman.pokemonID}</td>
              <td>${pokeman.pokeMonFounder}</td>
              <td>${pokeman.breed}</td>
              <td>${pokeman.description}</td>
              <td>${pokeman.pokeMonVersion}</td>
         
           <td><a href="delete?pokemonID=${pokeman.pokemonID}">Remove</a></td>
           <td><a href="update?pokemonID=${pokeman.pokemonID}">update</a></td>
           
             </tr>
           </c:forEach>
          </table>
       
</body>
</html>