<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<sql:setDataSource var="myDatasource"
 driver="org.apache.derby.jdbc.ClientDriver"
 url="jdbc:derby://localhost:1527//CharityConcert" user="app"
 password="app"/>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>  
    <head>
        <style>            
            table, th, td {
                border: 1px solid white;
                border-collapse: collapse;
                padding: 10px;
            }
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
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Home</title>
    </head>
    <body>
        <div id="mySidenav" class="sidenav">
            <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
            <a href="areaMerchTable.jsp">Area Table</a>
            <a href="areaMerchTable.jsp">Merchandise Table</a>
            <a href="bookingTable.jsp">Booking Table</a>
            <a href="donorTable.jsp">Donor Table</a>
            <a class="input3" style="text-align: left;" href="staffLogin.jsp">Log Out</a>
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
                <c:set var="areaId" value="${param.areaId}"/>
                <c:set var="areaName" value="${param.areaName}"/>
                <c:set var="areaCapacity" value="${param.areaCapacity}"/>
                <c:set var="areaStatus" value="${param.areaStatus}"/>
                <c:set var="areaPrice" value="${param.areaPrice}"/>
                <c:set var="merchandiseId" value="${param.merchandiseId}"/>
                <c:set var="merchandiseType" value="${param.merchandiseType}"/>
                <c:set var="merchandisePrice" value="${param.merchandisePrice}"/>

                <div style="margin-left: 100px" class="divLeft w3-panel">
                <h1>Admin Home</h1>
                <br>
                <sql:query var="result" dataSource="${myDatasource}">
                SELECT * FROM AREA
                </sql:query>
                <div class="w3-quarter">
                    <div class="w3-container w3-blue w3-padding-16">
                        <div class="w3-left"><i class="fa fa-ticket w3-xxxlarge"></i></div>
                        <div class="w3-clear"></div>
                        <h3>Number of Seats Booked</h3>
                        <h5 class="w3-right">Units</h5>
                        <h1 class="w3-right">52</h1>
                        <div class="w3-clear"></div>
                    </div>
                </div>
                <div class="w3-quarter">
                    <div class="w3-container w3-teal w3-padding-16">
                        <div class="w3-left"><i class="fa fa-money w3-xxxlarge"></i></div>
                        <div class="w3-clear"></div>
                        <h3>Total Donation</h3>
                        <h1 class="w3-right">66</h1>
                        <h5 class="w3-right">RM</h5>
                        <div class="w3-clear"></div>
                    </div>
                </div>
                <div class="w3-quarter">
                    <div class="w3-container w3-yellow w3-padding-16">
                        <div class="w3-left"><i class="fa fa-shopping-bag w3-xxxlarge"></i></div>
                        <div class="w3-clear"></div>
                        <h3>Total Merchandise Sold</h3>
                        <h1 class="w3-right">99</h1>
                        <h5 class="w3-right">RM</h5>
                        <div class="w3-clear"></div>
                    </div>
                </div>
                </div>
            </div>
                <br>       
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
  
     