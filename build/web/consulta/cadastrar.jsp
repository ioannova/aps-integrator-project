<%-- 
    Document   : cadastrar
    Created on : 28/10/2018, 04:25:43
    Author     : nelsonfonseca
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agendamento de Consulta Online</title>
    </head>
    <body>
        <h1>Agendar Consulta</h1>
        <form name="formCadastro" method="post" action="salvar.jsp">
            <label> Nome </label>
            <input type="text" name="nome" value=""/>
            <br />
            <label> CPF </label>
            <input type="text" name="cpf" value=""/>
            <br />
            <label> Data </label>
            <input type="text" name="datac" value=""/>
            <br />
            <input type="submit" name="salvar" value="salvar" />
        </form>
    </body>
</html>
