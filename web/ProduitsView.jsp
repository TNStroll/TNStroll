<%-- 
    Document   : ProduitsView
    Created on : Nov 18, 2016, 4:32:20 AM
    Author     : Walid
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="post" action="controleur.php">
            <input type="text" name="motCle">
            <input type="submit" value="ok">
        </form>
    <tr>
            
            <th>ID</th>
            <th>fgh</th>
            <th>fg</th>
            <c:forEach items="${modele.produits}" var="p">
           
                
                    <td>
                        ${p.idProduit}
                    </td>
                    <td>
                        ${p.nomProduit}
                    </td>
                    <td>
                        ${p.prixProduit}
                    </td>
            </tr>        
            </c:forEach>
                
        
    </body>
</html>
