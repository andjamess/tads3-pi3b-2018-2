<%-- 
    Document   : consultaFuncionarios
    Created on : 02/12/2018, 17:45:54
    Author     : Dayse
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consulta Funcionarios</title>
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

            <h1 align="center" style="color:orange; background-color:black;">Listagem de Funcionarios</h1>
            <table name="consultaImoveis" class="table table-bordered  table-dark table-hover " id="tabela"   >

                <thead>







                    <tr>

                        <th style="color:#ff9900; "scope="col">ID</th>
                        <th  style="color:#ff9900; "scope="col">NOME</th>
                        <th style="color:#ff9900;" scope="col">RG</th>
                        <th style="color:#ff9900;" scope="col">CPF</th>
                        <th  style="color:#ff9900;" scope="col">FILIAL</th>
                        <th  style="color:#ff9900;" scope="col">CARGO</th>
                        <th  style="color:#ff9900;" scope="col">DATA DE CADASTRO</th>
                    </tr>
                </thead>


                <tbody>

                    <tr>
                        <th style="color:#ff9900;" scope="row"></th>


                    </tr>
                    <c:forEach items="${funcionarios}" var="f">

                        <tr>

                            <th scope="row">2</th>

                            <td  style="color:#ff9900;"><c:out value="${f.id}"/></td>


                            <td name="cep" id="cep" style="color:#ff9900;"><c:out value="${f.nome}"/></td>

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
