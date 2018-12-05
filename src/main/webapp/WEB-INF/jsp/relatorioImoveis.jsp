<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="Classes.Imovel" %>
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

<!doctype html>
<html lang="en">
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="css/bootstrap.min.css"  media="screen" >

        <title>Listagem De Imovel</title>




    </head>
    <body>









        <header>

            <nav class="navbar navbar-expand-lg navbar-primary bg-dark ">
                <a class="navbar-brand" href="index.html"><img src="casa.jpg" width="35" height="35"></a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Alterna navegaÃ§Ã£o">
                    <span class="navbar-toggler-icon"></span>
                </button> 
                <div class="collapse navbar-collapse" id="navbarNav">
                    <ul class="navbar-nav">
                        <li class="nav-item active">
                            <a class="nav-link" href="index.html">Home<span class="sr-only">(PÃ¡gina atual)</span></a>
                        </li>

                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                Servicos
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
                                <a class="dropdown-item" href="relatorioImoveis.html"  style="color: blue;"> Listagem de Imoveis </a>

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

            <h1 align="center" style="color:orange; background-color:black;">Listagem de Imoveis</h1>
            <table name="consultaImoveis" class="table table-bordered  table-dark table-hover " id="tabela"   >

                <thead>







                    <tr>
                        <th style="color:#ff9900;"scope="col">#</th>
                        <th style="color:#ff9900; "scope="col">ID</th>
                        <th  style="color:#ff9900; "scope="col">CEP</th>
                        <th style="color:#ff9900;" scope="col">ENDERECO</th>
                        <th style="color:#ff9900;" scope="col">COMPLEMENTO</th>
                        <th  style="color:#ff9900;" scope="col">VALOR ALUGUEL</th>
                    </tr>
                </thead>


                <tbody>

                    <tr>
                        <th style="color:#ff9900;" scope="row"></th>


                    </tr>
                    <c:forEach items="${imovel}" var="m">

                        <tr>

                            <th scope="row">2</th>

                            <td  style="color:#ff9900;"><c:out value="${m.id}"/></td>

                            <td name="cep" id="cep" style="color:#ff9900;"><c:out value="${m.cep}"/></td>

                            <td style="color:#ff9900;"><c:out value="${m.endereco}"/></td>

                            <td style="color:#ff9900;"><c:out value="${m.complemento}"/></td>

                            <td style="color:#ff9900;"><c:out value="${m.valor}"/></td>



                        </tr>
                    </c:forEach>

                </tbody>


            </table>




            <a href="Pesquisar.html" method="post">    <button method="post" class="btn btn-primary btn-lg col-md-3" type="button"  >Update</button><br></a> 
          



    </script>
    <script src='http://code.jquery.com/jquery-2.1.3.min.js'></script>
    <script src="js\bootstrap.min.js"></script>
    <script>

                        function selecionaLinhaParaInput() {


                            var rIndex, table = document.getElementById("tabela");

                            for (var i = 1; 0 < table.rows.length; i++)
                            {

                                table.rows[i].onclick = function ()
                                {

                                    rIndex = this.rowIndex;

                                    //Aqui pega os valores da linha da tabela 

                                    document.getElementByName("cep").value = this.cells[1].innerHTML;
                                    document.getElementByName("endereco").value = this.cells[2].innerHTML;
                                    document.getElementByName("complemento").value = this.cells[3].innerHTML;
                                    document.getElementByName("valor").value = this.cells[4].innerHTML;




                                };

                            }
                        }

                        selecionaLinhaParaInput();





    </script>

</body>
</html>





<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS 
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"></script>