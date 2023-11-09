<!-- Q2. Write a JSP program to perform Arithmetic operations such as Addition and Subtraction. -->
<!-- Design a HTML to accept two numbers in text box and radio buttons to display operations. On -->
<!-- submit display result as per the selected operation on next page using JSP. -->
<!-- not run  -->

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>
    <title>Arithmetic Calculator Result</title>
</head>

<body>
    <% 
        // Get user inputs from the form
        String num1Str = request.getParameter("num1");
        String num2Str = request.getParameter("num2");
        String operation = request.getParameter("operation");
        
        // Convert the input values to numbers
        double num1 = Double.parseDouble(num1Str);
        double num2 = Double.parseDouble(num2Str);
        
        // Initialize the result
        double result = 0;
        
        // Perform the selected operation
        if (operation.equals("add")) {
            result = num1 + num2;
        } else if (operation.equals("sub")) {
            result = num1 - num2;
        }
    %>

    <h2>Result:</h2>
    <p>
        <% 
            out.print(num1 + " " + operation + " " + num2 + " = " + result);
        %>
    </p>
</body>

</html>