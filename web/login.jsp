<%-- 
    Document   : login
    Created on : Jul 4, 2021, 9:24:25 PM
    Author     : azimd
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
        <style>
            h1 {text-align: center;}
            table.center {
                margin-left: auto;
                margin-right: auto;
            }
        </style>
    </head>
    <body>
        <h1><b>Login using MVC-DAO</b></h1>
        <form action="LoginServlet" method="post">
        <table border="0" class="center">
            <thead>
                <tr>
                    <th></th>
                    <th></th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>Username:</td>
                    <td><input type="text" name="username" width="20"/></td>
                </tr>
                <tr>
                    <td>Password:</td>
                    <td><input type="password" name="password" width="20"/></td>
                </tr>
                <tr>
                    <td>
                        <span style="color:red"><%=(request.getAttribute("errMessage") == null) ? ""
                        : request.getAttribute("errMessage")%></span>
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Login"/>
                        <input type="reset" value="Reset"/></td>
                </tr>
            </tbody>
        </table>
        </form>
    </body>
</html>
