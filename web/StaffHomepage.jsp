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
        <title>View Form Page</title>
    </head>
    <body>
        <div id="mySidenav" class="sidenav">
            <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
            <a href="aboutUs.html">About</a>
            <a href="aboutArtist.html">Artist</a>
            <a href="contactUs.jsp">Contact</a>
            <a href="staffLogin.jsp">Admin</a>
            <a class="book" href="bookingOrder.jsp">Book</a>
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
                <c:set var="bookId" value="${param.bookId}"/>
                <c:set var="donorId" value="${param.donorId}"/>
                <c:set var="merchandiseId" value="${param.merchandiseId}"/>
                <c:set var="totalPrice" value="${param.totalPrice}"/>
                <c:set var="addPrice" value="${param.addPrice}"/>
                <c:set var="finalPrice" value="${param.finalPrice}"/>
                <c:set var="bookDate" value="${param.bookDate}"/>
                <c:set var="donorFname" value="${param.donorFname}"/>
                <c:set var="donorGender" value="${param.donorGender}"/>
                <c:set var="donorAge" value="${param.donorAge}"/>
                <c:set var="donorEmail" value="${param.donorEmail}"/>
                <c:set var="donorPhone" value="${param.donorPhone}"/>
                <c:set var="merchandiseType" value="${param.merchandiseType}"/>
                <c:set var="merchandisePrice" value="${param.merchandisePrice}"/>

                <p>
                <h1 class="divLeft" >Area</h1>
                <sql:query var="result" dataSource="${myDatasource}">
                SELECT * FROM AREA
                </sql:query>

                <table border="3">
                <tr>
                    <c:forEach var="columnName" items="${result.columnNames}">
                    <th><c:out value="${columnName}"/></th>
                    </c:forEach>
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
            <a href="staffLogin.jsp">Return</a>
            </p>
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
  
     