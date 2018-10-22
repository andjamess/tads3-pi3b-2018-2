<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="css/bootstrap.min.css"  media="screen" >

    <title>Cadastro De Imovel</title>
    <style type="text/css">
      
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

color:#ff9900; /* a cor laranja para as letras */
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
        <div class="dropdown-menu bg-dark navbar-primary" aria-labelledby="navbarDropdown">
          <a class="dropdown-item" href="cadastroFuncionario.html" style="color: blue;">  Relatorios de vendas  </a>
          <a class="dropdown-item"  href="WEB-INF/relatorioImoveis.jsp"  style="color: blue;"> Listagem de Imoveis </a>
     
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
<jsp:useBean id="imovel" >
    <div class="container-fluid " style="color:orange; background-color:black;" >
 <h1 align="center" style="color:orange; background-color:black;">Cadastrado!</h1>

<div class="alert alert-success" role="alert" div style="color:orange; background-color:black;" class="container">
  <h4 class="alert-heading">Muito bem!</h4>
  <p>Sucoesso! Bem vindo! Voce ja pode se logar no sistema !</p>
  <hr>
  <p class="mb-0"><h1 align="center" style="color:orange; background-color:black;">Boas Vendas !!</h1></p>
</div>

 <br> <br> <br> <br> <br> <br> <br> <br> <br> <br> <br> <br> <br> <br> <br> <br> <br>
<br> <br> <br> <br> <br> <br> <br> <br> <br>
<hr>
<div class="container-fluid">
<link href="index.html" style="color:orange; background-color:black;" >Cadastrar outra conta</link>


</div>

</div>



        </script>
        <script src='http://code.jquery.com/jquery-2.1.3.min.js'></script>
   <script src="js\bootstrap.min.js"></script>
  </body>
</html>





    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS 
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"></script> 