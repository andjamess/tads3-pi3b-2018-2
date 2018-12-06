<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="Classes.Imovel" %>
<!doctype html>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

	 <title>Imobiliaria</title>

    <link href="css/bootstrap.min.css" rel="stylesheet">

    <link href="css/custom.css" rel="stylesheet">

    <link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>

</head>
<body>

	<nav id="siteNav" class="navbar navbar-default navbar-fixed-top" role="navigation">
	<div class="container"> 
	
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navbar">
			<span class="sr-only">Toggle navigation</span>
			<span class="icon-bar"></span>
			<span class="icon-bar"></span>
			<span class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="index.html">
			<span class="glyphicon glyphicon-home"></span> 
				Imobiliaria
			</a>
		</div>
	
	<div class="collapse navbar-collapse" id="navbarNav">
		<ul class="nav navbar-nav navbar-right">
			<li class="active">
				<a href="index.html">Home</a>
			</li>
			
			<li class="dropdown">
				<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Cadastro<span class="caret"></span></a>
				<ul class="dropdown-menu">
					<li><a  href="cadastroFuncionario.html" >  Cadastro Funcionario  </a></li>
					<li><a  href="fomularioCadastroImovel.html" >  Cadastro Imovel </a></li>
					<li><a  href="fomularioCadastroCliente.html" >  Cadastro Cliente </a></li>
				</ul>
			</li>
                        <li class="dropdown">
				<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Consultas<span class="caret"></span></a>
				<ul class="dropdown-menu">
					<li><a href="serveletImovel">Listagem de Imoveis </a></li>
					<li><a href="serveletCliente">Listagem de Cliente </a></li>
					<li><a href="serveletFuncionario">Listagem de Funcionario </a></li>
				</ul>
			</li>
                        <li>
				<a href="relatorioVendas.html">  Relatorios de vendas  </a>
			</li>
		</ul>
	</div>
	</div>
	</nav>
	
<section>  

    <br><br><br><br>
            <table style="background-color: #FFFFFF" name="consultaImoveis" class="table table-bordered  table-dark table-hover " id="tabela"  bgcolor="#00FF00" >
                <thead style="background-color: #FFFFFF">

                    <tr>
                        <th style="color:#000000;"scope="col">#</th>
                        <th style="color:#000000; "scope="col">ID</th>
                        <th  style="color:#000000; "scope="col">CEP</th>
                        <th style="color:#000000;" scope="col">ENDERECO</th>
                        <th style="color:#000000;" scope="col">COMPLEMENTO</th>
                        <th  style="color:#000000;" scope="col">VALOR ALUGUEL</th>
                    </tr>
                </thead>


                <tbody style="background-color: #FFFFFF" >

                    <tr>
                        <th style="color:#000000;" scope="row"></th>


                    </tr>
                    <c:forEach items="${imovel}" var="m">

                        <tr>

                            <th scope="row">2</th>

                            <td  style="color:#000000;"><c:out value="${m.id}"/></td>

                            <td name="cep" id="cep" style="color:#000000;"><c:out value="${m.cep}"/></td>

                            <td style="color:#000000;"><c:out value="${m.endereco}"/></td>

                            <td style="color:#000000;"><c:out value="${m.complemento}"/></td>

                            <td style="color:#000000;"><c:out value="${m.valor}"/></td>



                        </tr>
                    </c:forEach>

                </tbody>


            </table>




            <a href="Pesquisar.html" method="post"> <button method="post" class="btn btn-primary btn-lg col-md-3" type="button"  >Update</button><br></a>
            <a href="Deletar.html" method="post"> <button  method="post" class="btn btn-dark btn-lg col-md-3" type="submit" >Deletar</button><br></a>



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
</section>

	<footer class="page-footer">
        	
        <div class="small-print">
        	<div class="container">
        		<p>Copyright &copy; PI3 - Javando</p>
        	</div>
        </div>
        
    </footer>

    <script src="js/jquery-1.11.3.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/jquery.easing.min.js"></script>
    <script src="js/custom.js"></script>



  </body>
</html>