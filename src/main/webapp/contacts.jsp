<%-- 
    Document   : contacts
    Created on : 28 mai 2024, 12:11:01
    Author     : adama.konate1
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <title>Contacts</title>
    <link href="style.css" rel="stylesheet" />
</head>
<body class="body2">    
    <div class="contenaire">
        <form action="contacts" method="post">
        <input type="hidden" name="action" value="add">
        <input type="text" id="prenom" name="prenom" placeholder="votre prenom" required>
        <input type="text" id="nom" name="nom" placeholder="votre nom" required>
        <input type="email" id="email" name="email" placeholder="votre email" required>
        <input type="text" id="telephone" name="telephone" placeholder="votre numero" required>
        <input type="text" id="competenceFavorite" name="competenceFavorite" placeholder="Votre competance" required>
        <button type="submit" class="boutton2">Ajouter Contact</button>
    </form>
    </div>
    
    <table>
        <thead>
            <tr>
                <th class="entableau" >ID</th>
                <th class="entableau">Prénom</th>
                <th class="entableau">Nom</th>
                <th class="entableau">Email</th>
                <th class="entableau">Téléphone</th>
               <!-- <th>Date de Naissance</th>-->
               <!-- <th class="entableau">Adresse</th>-->
                <th class="entableau">Compétence Favorite</th>
                <th class="entableau">Actions</th>
            </tr>
        </thead>
        
            <c:forEach var="contact" items="${contacts}">
                <tr>
                    <td>${contact.id}</td>
                    <td>${contact.prenom}</td>
                    <td>${contact.nom}</td>
                    <td>${contact.email}</td>
                    <td>${contact.telephone}</td>
                    <td>${contact.competenceFavorite}</td>
                    <td>
                        <form action="contacts" method="post" style="display:inline;">
                            <input type="hidden" name="action" value="delete">
                            <input type="hidden" name="id" value="${contact.id}">
                            <button type="submit" class="suppression">Supprimer</button>
                        </form>
                    </td>
                </tr>
            </c:forEach>
        
    </table>
    
    <a href="index.jsp">Retour à l'accueil</a>
</body>
</html>

