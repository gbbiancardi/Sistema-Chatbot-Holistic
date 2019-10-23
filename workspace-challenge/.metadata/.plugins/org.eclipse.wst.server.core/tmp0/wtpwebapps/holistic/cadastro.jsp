<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<link rel="stylesheet" href="css/main.style.css" type="text/css" />
<link rel="stylesheet" href="css/cadastro.css">
<meta charset="utf-8" />
<link rel="stylesheet" href="css/main.style.css" type="text/css" />
<link rel="shortcut icon" href="img/favicon.png" type="image/x-png"/>
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>Holistic - Registre-se</title>
</head>
<body>

	<div class="menu">
			<ul>

				<a href="index.jsp"><li>Home</li></a>
			</ul>
	</div>


<div class="container">
	<form action="cadastrar" method="post">

    	<h2>Para ter acesso a nosso portal, por favor cadastre-se</h2>
    <hr>
		<label for="tipo">Tipo</label>
		<select name="tipo">
		  <option value="aluno" name="tipo">Aluno</option>
		  <option value="professor"  name="tipo">Professor</option>
		  <option value="administrador"  name="tipo">Administrador</option>
		 </select>
				<br><br>
    <label for="codigo"><b>Codigo</b></label>
    <input type="text" placeholder="Insira seu codigo" name="codigo" required>

    <label for="senha"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="senha" required>

		<label for="nome"><b>Nome</b></label>
    <input type="text" placeholder="Insira seu nome" name="nome" required>
		<br><br>
		<label for="dataNascimento"><b>Data de nascimento</b></label>
    <input type="text" placeholder="Ex: 00/00/0000" name="dataNascimento" id="dtNasc" required>
		<br><br>
		<label for="genero">Sexo</label>
		<br>

		<input type="radio" name="genero" value="m" checked>Masculino<br>
  	<input type="radio" name="genero" value="f" checked>Feminino<br>
		<br><br>

		<label for="email"><b>E-mail</b></label>
    <input type="text" placeholder="Insira seu e-mail" name="email" required>

		<label for="cpf"><b>CPF</b></label>
    <input type="text" placeholder="Insira seu CPF" name="cpf" id="CPF" required>
    <hr>


    <button type="submit" class="registerbtn">Register</button>
  </div>

  <div class="container signin">
    <p>Já possui uma conta ? <a href="index.jsp">Sign in</a>.</p>
		</form>



  </div>
	<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery.mask/1.14.16/jquery.mask.min.js"></script>

	<script type="text/javascript">
		$(document).ready(function(){
		$("#dtNasc").mask("00/00/0000");
		$("#CPF").mask("000.000.000-00");
		});
	</script>
</body>
</html>
