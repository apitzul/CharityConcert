<%-- 
    Document   : staffLogin
    Created on : Jul 4, 2021, 9:36:32 PM
    Author     : azimd
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.controller.LoginServlet" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Staff Login Page</title>
        <link rel="stylesheet" href="style.css">
    </head>
    
    <body>
        <div id="mySidenav" class="sidenav"> 
            <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
            <a href="homepage.html">Home</a>
            <a href="aboutUs.html">About</a>
            <a href="aboutArtist.html">Artist</a>
            <a href="contactUs.html">Contact</a>
            <a class="book" href="bookingOrder.jsp">Book</a>
         </div>
        
        <div id="main">
        <form name="form" action="LoginServlet" method="POST">
            <div class="span">                  
                <img src="Icon/menu.png" class="menuicon" onclick="openNav()">
                <div>             
                    <img src="Image/logo white.png" class="icon">
                    <img src="Image/caliph buskers logo.png" class="icon">
                </div>    
            </div>
        
            <div class="background1">
                <div class="divLeft">

                    <h1><b>Please Log In.</b></h1>

                    <p>  </p>    

                    <input class="input1" type ="text" name = "username" size="49" placeholder="Enter Username" >&nbsp;
                    <input class="input1" type ="text" name ="password" size="31" placeholder="Enter Password">&nbsp;

                    <p>  </p>

                    <input class="input2" type="submit" value="Submit">
                    <p style="color:red"><%=(request.getAttribute("errMessage") == null) ? ""
         : request.getAttribute("errMessage")%></p>
                </div>            
            </div>
        </form>
        </div>
        <script>
            /* Set the width of the side navigation to 250px and the left margin of the page content to 250px and add a black background color to body */
                function openNav() {
                  document.getElementById("mySidenav").style.width = "250px";
                  document.getElementById("main").style.marginLeft = "250px";
                  document.body.style.backgroundColor = "rgba(0,0,0,0.-4)";
                }

                /* Set the width of the side navigation to 0 and the left margin of the page content to 0, and the background color of body to white */
                function closeNav() {
                  document.getElementById("mySidenav").style.width = "0";
                  document.getElementById("main").style.marginLeft = "0";
                  document.body.style.backgroundColor = "black";
                } 
        </script>       
    </body>
</html>
