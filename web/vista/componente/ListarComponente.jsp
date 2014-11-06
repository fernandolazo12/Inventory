<%-- 
    Document   : ListarComponente
    Created on : 06-oct-2014, 16:10:23
    Author     : Dka
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="pe.edu.upeu.inventario.modelo.Componente" %>

<jsp:useBean id="list1" scope="session" class="java.util.ArrayList"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="../../WEB-INF/jspf/jscss1.jspf" %>
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="../../WEB-INF/jspf/top.jspf" %>
        
        <div class="table-responsive">
            <br>
            <a href="<%= request.getContextPath()%>/comp?op=2" class="btn btn-mini btn-success" role="button">Nuevo</a>
            <hr>
            <table class="table table-bordered" style="width: 800px;">
                <tr>
                    <th>Id</th>
                  
                    <th>componente</th>
                    <th>Estado</th>
                    <th>idCategoria</th>
                    <th></th>
                </tr>
                <% for(int i=0; i<list1.size();i++){
                     Componente componente = new Componente();
                    componente = (Componente)list1.get(i);
                    %>
                <tr>
                    <td><%= componente.getIdcomp()%></td>
                    <td><%= componente.getNombre()%></td>
                    <td><%= componente.getEstado()%></td>
                    <td><%= componente.getIdcat()%></td>
                    <td>
                        <a href="comp?op=3&id=<%= componente.getIdcomp()%>" class="btn btn-mini btn-success" role="button">Editar</a>
                        <a href="comp?op=6&id=<%= componente.getIdcomp()%>" class="btn btn-mini btn-success" role="button">Eliminar</a>
                    </td>
                </tr>
                <%}%>
            </table>
        </div>
        <%@include file="../../WEB-INF/jspf/bottom.jspf" %>
    </body>
</html>
