<!--bookingOrder.jsp-->
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
            
        </style>
        <title>Booking of Charity Concert</title>
        <link rel="stylesheet" href="style.css">
    </head>
    
    <body>
        <form method = "post" action = "receiptOrder.html">
        <div class="span">           
            <div>           
            
                <img src="Image/logo white.png" class="icon">
                <img src="Image/x colab.png" class="icon2">
                <img src="Image/caliph buskers logo.png" class="icon">

            </div>
            <div class="divRight">
                <ul>               
                    <li class="navigation"><a href="homepage.html">Home</a></li>
                    <li class="navigation"><a href="aboutArtist.html">About Artist</a></li>
                    <li class="navigation"><a href="aboutUs.html">About Us</a></li>
                    <li class="navigation"><a href="contactUs.jsp">Contact Us</a></li>
                </ul>  
            </div>
        </div>
        
        <div class="background1">
            <div class="containerleft">
            
                <h1><b>Book Your Ticket Here.</b></h1>
            
                <p>  </p>
            
                <input class="input1" type = "text" name = "fullName" size="49" placeholder="Full Name" >&nbsp;
                <select size="1" name="gender">
                    <option value="NoGender">Select Gender</option>
                    <option value="Male">Male</option>
                    <option value="Female">Female
                    </option>
                </select>&nbsp;
                <input class="input1" type ="text" name ="age" size="31" placeholder="Age">&nbsp;
                <input class="input1" type ="text" name ="pNumber" size="49" placeholder="Phone Number">&nbsp;  
                <input class="input1" type ="text" name ="email" size="49" placeholder="Email">&nbsp; 
                
                <p class="noteGrey">
                Scroll Down
                </p>
                <img class="arrow"
                 src="Image/arrow down.png"
                    width="25" height="20"
                    alt="Arrow Down">
            
            </div>
        </div>
        
        
        
        <div class="background2">
            <div class="containerleft">
                <table cellspacing="10" cellpadding="10" >
                    <tbody>
                    <tr>
                        <td style="background-color: #204060"><b>Area</b><br></td>
                        <td style="background-color: #204060"><b>Availability</b><br></td>
                        <td style="background-color: #204060"><b>No. of Seat</b><br></td>
                    </tr>
                    <tr>
                        <td style="background-color: #ffcc00"><b>Yellow</b><br></td>
                        <td><b>Available</b><br></td>
                        <td><input class="input1" type = "text" name = "yellowTicket" size="10" placeholder="0/150" ></td>
                    </tr>
                    <tr>    
                        <td style="background-color: #ff6600"><b>Orange</b><br></td>
                        <td><b>Fully Booked</b><br></td>
                        <td><input class="input1" type = "text" name = "orangeTicket" size="10" placeholder="150/150" ></td>
                    </tr>
                    <tr>
                        <td style="background-color: #00802b"><b>Green</b><br></td>
                        <td><b>Available</b><br></td>
                        <td><input class="input1" type = "text" name = "greenTicket" size="10" placeholder="0/150" ></td>
                    </tr>
                    <tr>
                        <td style="background-color: #000066"><b>Blue</b><br></td>
                        <td><b>Available</b><br></td>
                        <td><input class="input1" type = "text" name = "blueTicket" size="20" placeholder="0/150" ></td>
                    </tr>
                    </tbody> 
                </table>
                <p style="padding: 20px; "></p>

                <select size="1" name="merchandise">
                    <option value="NoMerchandise">Select Merchandise Combo</option>
                    <option value="ComboN">None</option>
                    <option value="ComboA">Combo A</option>
                    <option value="ComboB">Combo B</option>
                    <option value="ComboC">Combo C</option>
                </select>&nbsp;
                
                    <input class="input1" type ="text" name ="extdonation" size="8" placeholder="Extra Donation (RM)">&nbsp;
                   
                <div>
                    <input class="input2" type="submit" value="Checkout">
                    <input class="input3" type="reset" value="Reset">
                </div>
        </div>
        <div 
            class="background3">
        </div>  
        </form>
        
             
    </body>
</html>
