<!-- Q2. Write a JSP program to perform Arithmetic operations such as Multiplication and Divison. -->
<!-- Design a HTML to accept two numbers in text box and radio buttons to display operations. On -->
<!-- submit display result as per the selected operation on next page using JSP. 
not output show-->

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>
    <title>Arithmetic Calculator Result</title>
</head>

<body>
    <h1>Arithmetic Calculator Result</h1>
    <%
        double num1 = Double.parseDouble(request.getParameter("num1"));
        double num2 = Double.parseDouble(request.getParameter("num2"));
        String operation = request.getParameter("operation");
        double result = 0;

        if ("multiply".equals(operation)) {
            result = num1 * num2;
        } else if ("divide".equals(operation) && num2 != 0) {
            result = num1 / num2;
        }
    %>
    <p>Result: <%= result %></p>
</body>

</html>