<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="" method="post">
<h1>--Pedido--</h1>
<label>Fecha del pedido:</label>
<input type="text"class="form-control" name="Fecha" placeholder="02/02/2020" />
<br>
<label>Nombre del Cliente:</label>
<input type="text"class="form-control" name="nombreC" placeholder="Jose" />
<br>
<label>Total del Pedido:</label>
<input type="text"class="form-control" name="totalP" placeholder="5.20" />
<br>
<label>Observacion del Pedido:</label>
<input type="text"class="form-control" name="observacion" placeholder="Comentario" />
<br>
<h1>--Comida--</h1>
<br>
<label>Nombre de la comida:</label>
<input type="text"class="form-control" name="nombreComida" placeholder="Guatita" />
<br>
<label>Precio Unitario:</label>
<input type="text"class="form-control" name="precioUnitario" placeholder="1.80" />
<br>
<h1>--Tarjeta de Credito--</h1>
<br>
<label>Numero de Tarjeta :</label>
<input type="text"class="form-control" name="numeroTarjeta" placeholder="0987412365" />
<br>
<label>Nombre propietario :</label>
<input type="text"class="form-control" name="nombreTarjeta" placeholder="Jose Peralta" />
<br>
<label>Fecha de caducidad :</label>
<input type="text"class="form-control" name="FechaCaducidad" placeholder="07/02/2024" />
<label>cvv :</label>
<input type="text"class="form-control" name="cvv" placeholder="713" />
<br>
<button type="submit" >Realizar Pedido.</button>
</form>
</body>
</html>