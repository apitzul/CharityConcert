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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Area & Merchandise Table</title>
    </head>
    <body>
        <div id="mySidenav" class="sidenav">
            <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
            <a href="StaffHomepage.jsp">Admin Home</a>
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
                <h1>Area</h1>
                <sql:query var="result" dataSource="${myDatasource}">
                SELECT * FROM AREA
                </sql:query>
                <br>
                <table style="background-color: #818BC8; width:80%" class="w3-table w3-striped w3-text-black">
                <tr>
                    <th>Area Id</th>
                    <th>Area Name</th>
                    <th>Area Capacity</th>
                    <th>Area Status</th>
                    <th>Area Price (RM)</th>
                </tr>
                <c:forEach var="row" items="${result.rows}">
                <tr>
                    <td><c:out value="${row.AREA_ID}"/></td>
                    <td><c:out value="${row.AREA_NAME}"/></td>
                    <td><c:out value="${row.AREA_CAPACITY}"/></td>
                    <td><c:out value="${row.AREA_STATUS}"/></td>
                    <td><c:out value="${row.AREA_PRICE}"/></td>
                </tr>
                </c:forEach>
                </table>
                </div>
            </div>
                <br>    
            <div>
                <div style="margin-left: 100px" class="w3-panel">
                <h1>Merchandise</h1>
                <sql:query var="result" dataSource="${myDatasource}">
                SELECT * FROM MERCHANDISE
                </sql:query>
                <br>
                <table style="background-color: #B22222; width:80%" class="w3-table w3-striped w3-text-black">
                <tr>
                    <th>Merchandise Id</th>
                    <th>Merchandise Type</th>
                    <th>Merchandise Price (RM)</th>
                </tr>
                <c:forEach var="row" items="${result.rows}">
                <tr>
                    <td><c:out value="${row.MERCHANDISE_ID}"/></td>
                    <td><c:out value="${row.MERCHANDISE_TYPE}"/></td>
                    <td><c:out value="${row.MERCHANDISE_PRICE}"/></td>
                </tr>
                </c:forEach>
                </table>
                <br>
                </div>
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
  
     