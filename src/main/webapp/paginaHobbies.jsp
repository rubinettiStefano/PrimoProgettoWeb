<%--
  Created by IntelliJ IDEA.
  User: rubin
  Date: 25/11/2024
  Time: 14:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hobbies</title>
</head>
<body>
    <h1>Inserisci il tuo Hobby</h1>
    <!-- nome descrizione costoAnnuo -->
    <form action="gestorehobby" >
        <input type="text" name="nome" placeholder="Nome Hobby" /><br/><br/>
        <input type="text" name="descrizione" placeholder="Descrizione Hobby" /><br/><br/>
        <input type="number" name="costoAnnuo" placeholder="Costo Anno Hobby" /><br/><br/>
        <input type="submit" value="Inserisci Hobby" />
    </form>
</body>
</html>
