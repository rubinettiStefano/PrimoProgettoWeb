<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Raccolta degli schifi</title>
</head>
<body>
    <h1>Scegli il tuo schifo</h1>
    <!--
        il tag a (a sta per anchor) è un LINK
        un link non è altro che un elemento della pagina che manda una REQUEST
        una volta cliccato
        con l'attributo href si imposta l'url a cui fare la request
     -->
    <a href="http://localhost:8080/PrimoProgettoWeb_war_exploded/pandora?daInsultare=zoom">Zoom</a>
    <a href="pandora?daInsultare=scrum">Scrum</a>
    <a href="pandora?daInsultare=onedrive">One Drive</a>
    <a href="pandora?daInsultare=macOs">Mac Os</a><br/><br/>
    <a href="mostrahobbies">Form Hobbies</a>

</body>
</html>