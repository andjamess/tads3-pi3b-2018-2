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
        
        
 <form method="post" action="ServeletDeleteImovel" name="formuser1" id="formuser1">
<!-- <h1 align="center" style="color:orange; background-color:black;">Atualizar Imovel</h1>
     
  
<span  class="border border-dark" alt=form-inline  class="rounded" > <h4 style="color: orange;">Endereços</h4> <br>
 
    
   

    

     

       
             
               <div class="form-group form-row   col-md-9">
           <label>CEP</label>
       
                 <input type="tel" class="form-control" id="cep" name="cep" value="${m.cep}" maxlength="8"> 
               
               </div>
                   
                      
  
  
    
         
  <div class="form-group form-row   col-md-9">
    <label>Endereço</label>
    <input type="text" class="form-control" id="endereco" name="endereco">
  </div>

  <div class="form-group form-row  col-md-9">
    <label >Complemento</label>
    <input type="text" class="form-control" id="complemento" placeholder="Apartamento, Studio, ou Casa" name="complemento">
  </div>

  <div class=" form-group form-row   col-md-5">
      <label>Cidade</label>
      <input type="text" class="form-control" id="cidade" name="cidade">
    </div>

  <div class="form-grou form-row   col-md-5">
      <label>Estado</label>
      <input type="text" class="form-control" id="estado" name="estado">
    </div>
<br>
 

</span>  
   <hr style="color: orange;">

 <span  class="border border-dark"  alt="form-group" class="rounded" > <h4 style="color: orange">Caracteristicas</h4> <br>


  <div class="form-grou form-row   col-md-3">
      <label>Valor do aluguel</label>
      <input type="number" class="form-control" id="valor" name="valor">
    </div>
<br>
 







 <div  class="form-group col-md-5 " >
      <label>Numero de Comodos:</label>
      <select class="form-control" name="comodos" id="comodos">
        <option selected>0</option>
        <option>1</option>
         <option>2</option>
          <option>3</option>
           <option>4 ou mais</option>
      </select>
   </div>

       <div class="form-group col-md-5" >
      <label>Numero de Dormitorios:</label>
      <select class="form-control" name="dormitorios" id="dormitorios">
        <option selected>0</option>
        <option>1</option>
         <option>2</option>
          <option>3</option>
           <option>4 ou mais</option>
      </select>

  </div>


   <div class="form-group col-md-5 ">
      <label>Numero de Suites:</label>
      <select class="form-control" name="suites" id="suites">
        <option selected>0</option>
        <option>1</option>
         <option>2</option>
          <option>3</option>
           <option>4 ou mais</option>
      </select>

  </div>


</span >


  <div class="form-group">
    <label>Anexe a imagem do Imovel (Opcional)</label>
    <input type="file" class="form-control-file" id="arquivo" name=imagemImovel>
  </div>


 <br>  <br> 
   <br>    
<div class="fixed-bottom" align="right" >


            
</div>-->


 <table name="deleteImoveis" class="table table-bordered  table-dark table-hover " id="alteraImoveis"   >

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

                            <td  style="color:#ff9900;"> <input type="tel" name="id" id="id" value="<c:out  value='${m.id}'/>"</td>

                            <td style="color:#ff9900;"> <input type="tel" name="cep" id="cep" value="<c:out value='${m.cep}'/>"</td>

                            <td style="color:#ff9900;"> <input type="text" id="endereco" name="endereco" value="<c:out value='${m.endereco}'/>"</td>

                            <td style="color:#ff9900;"> <input type="text" id="complemento" name="complemento" value="<c:out value='${m.complemento}'/>"</td>

                            <td style="color:#ff9900;"> <input type="text" id="valor" name="valor" value="<c:out value='${m.valor}'/>"</td>



                        </tr>
                    </c:forEach>

                </tbody>


            </table>



  <button  class="btn btn-primary btn-lg col-md-3" type="submit" >Deletar</button><br>
   <button  class="btn btn-dark btn-lg col-md-3" type="reset" value="Apagar Campos" >Apagar Campos</button><br>
         
</form>
         

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