<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="NewFile.css">
	<title>New File</title>
</head>
<body>

   <div class = "container">
   <% int width = Integer.parseInt(request.getParameter("width")); %>
     <% int height = Integer.parseInt(request.getParameter("height")); %>
       <table>
          <% for(int i = 0; i < 5; i++) { %>
        <tr>
            <% for(int black = 0; black < width; black++) { %>
            <td class='red'></td>
            <td class='black'></td>
            <% } %>
        </tr>
        <tr>
          <% for(int black = 0; black < height ; black++) { %>
            <td class='black'></td>
            <td class='red'></td>
            <% } %>
        </tr>
        <% } %>
    </table>
    </div>
    
    
</body>
</html>