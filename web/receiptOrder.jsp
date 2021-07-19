<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
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
            .divPadding{
                padding: 50px;
            }
            .divBackgroundGrey{
                background-color: #0a0a0a  ;
                width: 40%;
                margin-left: 40px;
                border-radius: 20px;
                padding: 20px;
            }
            h3{
                margin-top: 0px;
                
            }
            td{
                background-color:  #000000 ;
                padding:10px;
                border-radius: 25px;
                padding-left: 20px;
            }
            
            .background8{
                height: 970px;
                width: 100%;
                background-size: cover;
                background-repeat: no-repeat;
                position: absolute;
                opacity: 0.5;
            }
        </style>
        <title>Receipt Order Generated</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        
        <link rel="stylesheet" href="style.css">
        
    </head>
    <body>
        <div>
            <img class="background8" src="Image/background receipt.jpg">
            <div class="span">           
                <div>
                    <img src="Image/logo white.png" class="icon">
                    <img src="Image/x colab.png" class="icon2">
                    <img src="Image/caliph buskers logo.png" class="icon">
                </div>
                <div class="divRight">
                <ul>               
                    <li class="navigation"><a href="aboutArtist.html">About Artist</a></li>
                    <li class="navigation"><a href="aboutUs.html">About Us</a></li>
                    <li class="navigation"><a href="contactUs.jsp">Contact Us</a></li>
                    <li class="navigation"><a class="book" href="bookingOrder.jsp">Book here</a></li>
                </ul>  
                </div>
            </div>
            <div class="divPadding">
                <h1>Ticket Booking Details</h1>
            </div>
            <div style="display:flex; align-content: center">
                <div class="divBackgroundGrey">
                <h2>Customer Details<br></h2>
                <table>
                <tbody>
                    <tr>
                        <td><b>Full Name</b><br></td>
                        <td>Muhammad Afiq Bin Zulkiffle<br></td>
                    </tr>
                    <tr>
                        <td><b>Gender</b><br></td>
                        <td>Male<br></td>
                    </tr>
                    <tr>    
                        <td><b>Age</b><br></td>
                        <td>21<br></td>
                    </tr>
                    <tr>
                        <td><b>Phone Number</b><br></td>
                        <td>0173714641<br></td>
                    </tr>
                </tbody> 
                </table> 
                </div>

                <div class="divBackgroundGrey" >
                    <h2>Your Ticket</h2>



                    <table>
                        <tbody>
                            <tr>    
                                <td><b>Number Of Ticket</b><br></td>
                                <td><b></b>3<br></td>
                            </tr>
                            <tr>
                                <td><b>Merchandise Details</b><br></td>
                                <td><b></b>Combo A<br></td>
                            </tr>
                            <tr>
                                <td><b>Ticket Price</b><br></td>
                                <td><b></b>RM90 (x3 Ticket Area A)<br></td>
                            </tr>
                            <tr>    
                                <td><b>Total Price</b><br></td>
                                <td><b></b>RM270<br></td>
                            </tr>


                        </tbody> 
                    </table>
                    <p></p>
                    <a class="input2" href="ticketview.jsp" target="_blank">Print Your Ticket</a><br>
                    <p class="note">*Click your ticket link and please print or make a screenshot of the ticket.</p>

                </div>

            </div>


            <div class="divPadding">
                <h1>Thank You !!<br></h1>
                <h4>Enjoy the concert while make a donation is best way to have a good deed. Congratulations !<br></h4>
                <p class="note">*You may save or print the full receipt</p>
                <br><br>
                <a class="input2" href="homepage.html" >Finish Payment</a>        
            </div>    
        </div>
        
    </body>
</html>
