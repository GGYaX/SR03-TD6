<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Converter</title>
</head>
<body>
<jsp:useBean id="converterBean" class="Converter.EuroDollarConverterBean"
scope="page" />
<jsp:setProperty name="converterBean" property="taux" value="1.38" />
<jsp:setProperty name="converterBean" property="dollars" value="138" />
Conversion de <jsp:getProperty name="converterBean" property="dollars"/> USD en
<jsp:getProperty name="converterBean" property="euros"/> EUR.
</body>
</html>