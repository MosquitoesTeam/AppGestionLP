<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Inscription</title>
	</head>
	<body>
		<h1>Insertion</h1>
		CIN: <input type="text" name="cin" />
		Nom: <input type="text" name="nom" />
		Prenom: <input type="text" name="prenom" />
		Email: <input type="text" name="email" />
		Tel: <input type="text" name="tel" />
		Diplome: <select name="diplome">
					 <option value="dut">DUT</option>
					 <option value="deug">DEUG</option>
					 <option value="bts">BTS</option>
					 <option value="dst">DST</option>
				 </select>
		Specialite: <input type="text" name="specialite" />
		Moyenne : <input type="number" name="moyenne" />
	</body>
</html>