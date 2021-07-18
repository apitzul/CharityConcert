<!--bookingOrder.html-->
<%@page import="com.controller.BookingServlet" %>
<html>
    <head>
        <style>            
            ul{
                list-style-type: none;  
                margin-right: 40px;
            }         
            li{
                display: inline;
            }            
            hr{
                width: 100%;           
            }
            p{
                font-size: 14px; 
                line-height: 1.6;
            }
            
            h1{
                font-size: 34px;
            }
            
            td{
                background-color:  #000000 ;
                padding:10px;
                border-radius: 25px;
                padding-left: 20px;
            }
            
            input[type=text] {
                width: 300px;
                box-sizing: border-box;
                border: 2px solid #ccc;
                border-radius: 4px;
                font-size: 16px;
                padding: 12px 20px 12px 20px;
                -webkit-transition: width 0.4s ease-in-out;
                transition: width 0.4s ease-in-out;
            }
            input[type=text]:focus {
                width: 50%;
            }
        </style>
        <title>Booking of Charity Concert</title>
        <link rel="stylesheet" href="style.css">
    </head>
    
    <body>
        <div id="mySidenav" class="sidenav">
            <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
            <a href="homepage.html">Home</a>
            <a href="aboutUs.html">About</a>
            <a href="aboutArtist.html">Artist</a>
            <a href="contactUs.jsp">Contact</a>
            <a href="staffLogin.jsp">Admin</a>
        </div>
        
        <div id="main">
        <form name="form" action="BookingServlet" method="POST">
        <div class="span">           
                <img src="Icon/menu.png" class="menuicon" onclick="openNav()">
                <div>             
                    <img src="Image/logo white.png" class="icon">
                    <img src="Image/caliph buskers logo.png" class="icon">
                </div>    
        </div>
        
        <div class="background1">
            <div class="containerleft">
                <h1>Refunds</h1>
                <br>
                <input type="text" name="booking_Id" placeholder="Search Your Booking ID.">
                <p></p>
                <br>
                <input class="input2" type="submit" value="Refund">
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
             
    </body>
</html>
