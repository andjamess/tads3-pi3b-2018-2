
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="Classes.Funcionarios" %>
<html>      
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consulta Funcionarios</title>
            <link rel="stylesheet" href="css/bootstrap.min.css"  media="screen" >
        <style>
    form {


        background:#4f4f4f; 
        /* cor escura para o fundo do formulário */

        font:12px arial, verdana, helvetica, sans-serif; 
        /* o tamanho e o tipo da fonte no formulário */

        border-top:8px solid #cfcfcf;
        /* borda superior de 8px solida na cor cinza clara 
        no formulário */

        border-left:8px solid #cfcfcf;
        /* a borda esquerda do formulário */

        border-right:8px solid #696969; 
        /* a borda direita do formulário */

        border-bottom:8px solid #696969; 


        border-collapse:collapse; 
        /* retira as bordas duplas nas células da tabela */

        color:#ff9900;



        /* a cor laranja para as letras */
    }

    
    </style>
    </head>
    <body>

<header>
      
<nav class="navbar navbar-expand-lg navbar-primary bg-dark ">
  <a class="navbar-brand" href="index.html"><img src="casa.jpg" width="35" height="35"></a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Alterna navegação">
    <span class="navbar-toggler-icon"></span>
  </button> 
  <div class="collapse navbar-collapse" id="navbarNav">
    <ul class="navbar-nav">
      <li class="nav-item active">
        <a class="nav-link" href="index.html">Home<span class="sr-only">(Página atual)</span></a>
      </li>

  <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Serviços
        </a>
        <div class="dropdown-menu bg-dark navbar-primary" aria-labelledby="navbarDropdown">
          <a class="dropdown-item" href="cadastroFuncionario.html" style="color: blue;">  Cadastro Funcionario  </a>
          <a class="dropdown-item" href="fomularioCadastroImovel.html"  style="color: blue;">  Cadastro Imovel </a>
        
        </div>
      </li>

 <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Relatorios
        </a>
        <div class="dropdown-menu bg-dark navbar-orange" aria-labelledby="navbarDropdown">
          <a class="dropdown-item" href="relatorioVendas.html" style="color: blue;">  Relatorios de vendas  </a>
          <a class="dropdown-item" href="serveletImovel" style="color: blue;">Listagem de Imoveis </a>
         <a class="dropdown-item" href="serveletConsultaFuncionarios" style="color: blue;">Listagem de Funcionarios </a>
        </div>
      </li>

      <li class="nav-item">
        <a class="nav-link" href="#">Acessos</a>
      </li>

      <li class="nav-item">
        <a class="nav-link disabled" href="#">Desativado</a>
      </li>
    </ul>
  </div>
</nav>



    </header>




        <div style="color:orange; background-color:black;" class="container-fluid">

            <h1 align="center" style="color:orange; background-color:black;">Listagem de Funcionarios</h1>
            <table name="consultaImoveis" class="table table-bordered  table-dark table-hover" id="tabela">
                <thead>
                    <tr>

                        <th style="color:#ff9900; "scope="col">ID</th>
                        <th  style="color:#ff9900; "scope="col">NOME</th>
                        <th style="color:#ff9900;" scope="col">RG</th>
                        <th style="color:#ff9900;" scope="col">CPF</th>
                        <th  style="color:#ff9900;" scope="col">FILIAL</th>
                        <th  style="color:#ff9900;" scope="col">CARGO</th>
                        
                    </tr>
                </thead>


                <tbody>

      
                    <c:forEach items="${funcionarios}" var="f">

                        <tr>

                 

                            <td  style="color:#ff9900;"><c:out value="${f.id}"/></td>   
                            <td style="color:#ff9900;"><c:out value="${f.nome}"/></td>

                            <td style="color:#ff9900;"><c:out value="${f.rg}"/></td>

                            <td style="color:#ff9900;"><c:out value="${f.cpf}"/></td>

                            <td style="color:#ff9900;"><c:out value="${f.filial}"/></td>
                            <td style="color:#ff9900;"><c:out value="${f.cargo}"/></td>
                              
                       
                        </tr>
                    </c:forEach>

                </tbody>


            </table>




            <a href="Pesquisar.html" method="post">    <button method="post" class="btn btn-primary btn-lg col-md-3" type="button"  >Update</button><br></a> 
          



    </script>
    <script src='http://code.jquery.com/jquery-2.1.3.min.js'></script>
    <script src="js\bootstrap.min.js"></script>
  
    </body>
</html>
