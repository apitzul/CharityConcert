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
            .span{
                display: flex;
            }
            .icon{
                width: 85px;
                height: 85px;
                padding: 15px;
                
            }
        
            .picture1{
                width: 450px;
                height: 450px;
                padding: 15px;
                
            }
            
            .picture2{
                width: 150px;
                height: 100px;
                padding: 15px;
                margin-left: -20px;
            } 
            
            .icon2{
                width: 30px;
                height: 30px;
                margin-left: 5px;
                
            }
            
            p{
                font-size: 14px; 
                line-height: 1.6;
            }
            
            h1{
                font-size: 34px;
                
            }
            
            .divLeft{
                padding: 70px;
            }
            
            .divLeft2{
                margin-left: 70px;
                
            }
            
            .navigation{
                margin-right: 10px;

                
            }
            
            .book{
                background-color: green;
            }
            
            .background7{
                height: 790px;
                width: 100%;
                background-size: cover;
                background-repeat: no-repeat;
                position: absolute;
                opacity: 0.7;
            }
            
        </style>
        
        <link rel="stylesheet" href="style.css">
        <title>Contact Us.</title>
    </head>
    <body>
        <div>
            <img class="background7" src="Image/background contact us.jpeg">
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
                        <li class="navigation"><a class="book" href="bookingOrder.jsp">Book here</a></li>
                    </ul>  
                </div>
            </div>

            <div>
                <div class="containerleft">

                    <h1><b>Let's get in touch.<br>
                        Send me a message.</b></h1>

                <form method = "post" action = "/CharityConcert/bookingOrder">
                    <p>  </p>

                        <input class="input1" type = "text" name = "fullName" size="49" placeholder="Full Name" >&nbsp;
                        <input class="input1" type ="text" name ="email" size="31" placeholder="Email">&nbsp;
                        <input class="input1" type ="text" name ="subject" size="49" placeholder="Subject">&nbsp;  
                        <textarea class="input1" name ="message" placeholder="Message" style="height: 100px"></textarea>&nbsp;
                        <p> </p>
                        <input class="input2" type="submit" value="Submit">
                        <input class="input3" type="reset" value="Reset">
                </form>
                </div>           
            </div>
        </div>
       
    </body>
</html>