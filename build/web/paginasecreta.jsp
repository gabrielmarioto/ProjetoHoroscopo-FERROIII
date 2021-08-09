
<%@page import="javax.swing.JLabel"%>
<%@page import="javax.swing.ImageIcon"%>
<%@page import="com.sun.mail.handlers.image_jpeg"%>
<%@page import="java.io.RandomAccessFile"%>
<%@page import="classes.Signo"%>
<%@page import="servlets.ControleLogin"%>

<!-- evita o acesso direto sem login -->
<!-- coloque o código abaixo em todos os módulos JSP do seu projeto -->

<% if (!ControleLogin.testaAcesso(request, response))
    {
        response.sendRedirect("."); // volta ao login
    }%>
<%!
    public String pegaSigno(String data)
    {
        Signo s = new Signo();
        String signo = "";
        signo = s.getSigno(data);
        return signo;
    }
%>
<%!
    boolean click = false;
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Horoscopo Diario</title>
    </head>
    <body style="background: #C0C0C0; color: white; text-align: center">
        <%
            String usuario = session.getAttribute("usuario").toString();
            if (usuario == null || usuario.isEmpty())
            {
                response.sendRedirect("index.html");
            }
        %>
        <h1><strong>Por favor, informe sua data de nascimento!</strong></h1>
        <div >
            <form action="paginasecreta.jsp">
                <p><label>Data Nascimento: </label><br>
                    <input type="date" name="data"/></p>

                <p><input type="submit" value="Selecionar"></p>                
            </form>
        </div>
        <h3><a href="Deslogar.jsp">Clique aqui para deslogar</a></h3>

        <%
            String data = request.getParameter("data");
            if (data != null && !data.isEmpty())
            {
                String signo = pegaSigno(data);

                RandomAccessFile arq = new RandomAccessFile(request.getServletContext().getRealPath("\\") + "horoscopo.txt", "r");
                String info[] = null;
                int i = 0;
                String temp[];

                info = arq.readLine().split("#");
                while (i < arq.length() && !info[0].contains(signo))
                {
                    info = arq.readLine().split("#");
                    i++;
                }

                if (!ControleLogin.testaAcesso(request, response))
                {
                    response.sendRedirect("index.html"); // volta ao login
                }
                String imagem = request.getServletContext().getRealPath("\\Util") + "\\" + signo + ".png";
        %>
        <p>
            <%= "Seu Signo: " + signo%>
        </p> 
        <div>
            <% if (signo == "Aries")
                {
            %>
            <img  src = "Util/Aries.png" width = "143" height = "197" alt = "Aries" / >
                  <% } else if (signo == "Aquario")
                  {
                  %>
                    <img  src = "Util/Aquario.png" width = "143" height = "197" alt = "Aquario" / >                    
                  <% } else if (signo == "Cancer")
                  {
                  %>
                    <img  src = "Util/Cancer.png" width = "143" height = "197" alt = "Cancer" / >                    
                  <% } else if (signo == "Capricornio")
                  {
                  %>
                    <img  src = "Util/Capricornio.png" width = "143" height = "197" alt = "Capricornio" / >                    
                  <% } else if (signo == "Escorpiao")
                  {
                  %>
                    <img  src = "Util/Escorpiao.png" width = "143" height = "197" alt = "Escorpiao" / >                    
                  <% }else if (signo == "Gemeos")
                  {
                  %>
                    <img  src = "Util/Gemeos.png" width = "143" height = "197" alt = "Gemeos" / >                    
                  <% }else if (signo == "Leao")
                  {
                  %>
                    <img  src = "Util/Leao.png" width = "143" height = "197" alt = "Leao" / >                    
                  <% } else if (signo == "Libra")
                  {
                  %>
                    <img  src = "Util/Libra.png" width = "143" height = "197" alt = "Libra" / >                    
                  <% }else if (signo == "Peixes")
                  {
                  %>
                    <img  src = "Util/Peixes.png" width = "143" height = "197" alt = "Peixes" / >                    
                  <% }else if (signo == "Sagitario")
                  {
                  %>
                    <img  src = "Util/Sagitario.png" width = "143" height = "197" alt = "Sagitario" / >                    
                  <% }else if (signo == "Touro")
                  {
                  %>
                    <img  src = "Util/Touro.png" width = "143" height = "197" alt = "Touro" / >                    
                  <% } else if (signo == "Virgem")
                  {
                  %>
                    <img  src = "Util/Virgem.png" width = "143" height = "197" alt = "Virgem" / >                    
                  <% } 
                  %>
                  
                  
        </div>
        <p>
            <%= "Sua previsão: " + info[1]%>
        </p> 

        <% }%>
    </body>
</html>
