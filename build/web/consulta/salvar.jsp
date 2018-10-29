<%-- 
    Document   : salvar
    Created on : 28/10/2018, 04:39:46
    Author     : nelsonfonseca
--%>

<%@page import="persistencia.ConsultaBD"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="dominio.Consulta"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastrar Consulta</title>
    </head>
    <body>
        <%
        String nome = request.getParameter("nome");
        String cpf = request.getParameter("cpf");
        String datac = request.getParameter("datac");

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date data = formato.parse(datac);

        Consulta consulta = new Consulta();
        consulta.setNome(nome);
        consulta.setCpf(cpf);
        consulta.setDatac(data);
        ConsultaBD.inserir(consulta);
        %>
        Consulta cadastrado com sucesso.
    </body>
</html>
