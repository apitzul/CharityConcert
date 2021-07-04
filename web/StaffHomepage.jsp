
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
            
            .background4{
                height: 790px;
                width: 100%;
                position: absolute;
                background-size: cover;
                background-repeat: no-repeat;
                opacity: 1;
            }
        </style>
        
        <link rel="stylesheet" href="style.css">
        <title>Admin Page</title>
    </head>
    <body>
        <div id="mySidenav" class="sidenav">
            <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
            <a href="aboutUs.html">About</a>
            <a href="aboutArtist.html">Artist</a>
            <a href="contactUs.html">Contact</a>
            <a href="staffLogin.html">Admin</a>
            <a class="book" href="bookingOrder.html">Book</a>
        </div>
        
        <div id="main">
            <img class="background4" src="Image/axiata arena.png">
            <div class="span">           
                <img src="Icon/menu.png" class="menuicon" onclick="openNav()">
                <div>             
                    <img src="Image/logo white.png" class="icon">
                    <img src="Image/caliph buskers logo.png" class="icon">
                </div>    
            </div>
            
            <div>
                <h1>Welcome to Administration Page</h1>
                <p>Let's enjoy the one and only "The Special Band" from Malaysia while doing charity to the local community. <br>
                   You also stand a chance to listen to the latest album from the Caliph Buskers artist group. <br>
                   This concert will be one of the best moments of your life and you will not regret it. <br>
                   Don't forget to book your seat and meet us at <b>Axiata Arena, Kuala Lumpur</b> on <b>20 June 2021</b> from 9pm. <br>
                </p>
                </article>      
                <div><a class="book" href="bookingOrder.jsp">Make your booking here! </a></div>    
                <div><a class="book" href="bookingOrder.jsp">Make your booking here! </a></div>
            </div>     
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
  
     