<%-- 
    Document   : index
    Created on : Jan 25, 2017, 12:13:43 AM
    Author     : yukio
--%>

<%@page import="bean.StudentBean"%>
<%@page import="java.util.List"%>
<%@page import="model.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Students List</title>
        <jsp:useBean id="studentBean" class="bean.StudentBean" scope="session"/>
    </head>
    <body>
        <h1>Students: <%= studentBean %></h1>
        <% 
            List<Student> students = studentBean.getStudents();
            for (Student student : students) {
        %>
        { name: "<%= student.getName() %>", age: <%= student.getAge() %> }
        <br/>
        <% } %>
        
    </body>
</html>
