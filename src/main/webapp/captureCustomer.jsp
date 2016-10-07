<!DOCTYPE html>
<html lang="en">
    <meta charset="UTF-8">
    <title>Title</title>
<head>
<script type = "text/javascript"  src = "https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
		
      <script type = "text/javascript">
         $(document).ready(function(){
         });
         
         function generate() {
        	 $('#generate').hide();
        	 $('#contact').show();
         }
         function savecontact() {
        	 $('#contact').hide();
        	 $('#person').show();
         }
         function saveperson() {
        	 $('#person').hide();
        	 $('#income').show();
         }
         function saveIncome() {
        	 $('#income').hide();
        	 $('#passport').show();
         }
         /*function savePassport() {
        	 $('#passport').hide();
        	 $('#dl').show();
         }*/
         function saveDL() {
        	 $('#passport').hide();
        	 $('#complete').show();
         }
      </script>	
      
<style>
.test label {
  font: 200 15px Arial;padding-right:10px;
}

.test input[type=text],
.test select {
  width: 80%;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  box-shadow: inset 0 1px 3px #ddd;
  border-radius: 4px;
  -webkit-box-sizing: border-box;
  -moz-box-sizing: border-box;
  box-sizing: border-box;
  padding-left: 20px;
  padding-right: 20px;
  padding-top: 12px;
  padding-bottom: 12px;
}

input[type=text].icon {
  width: 80%;
  padding: 12px 20px;
  box-sizing: border-box;
  border: 2px solid #ccc;
  border-radius: 4px;
  font-size: 16px;
  background-color: white;
  background-image: url('searchicon.png');
  background-position: 10px 13px;
  background-repeat: no-repeat;
  padding-left: 42px;
}

.test input[type=button], .test .button {
  width: 30%;
  text-align:center;
  background-color: #0074a6;
  color: white;
  padding: 12px 20px;
  margin: 14px 0 8px 0;
margin-left:280px;  display: inline-block;
  border: none;
  border-radius: 4px;
  box-shadow: inset 0 1px 3px #ddd;
  font:Arial;
}

.test input[type=button]:hover, .test .button:hover {
  background-color: #45a049;
}

.test input[type=text]:focus,
.test select:focus {
  box-shadow: inset 0 1px 1px rgba(0, 0, 0, .075), 0 0 8px rgba(102, 175, 233, .6);
}

.focus1 {
  width:100%;
  padding: 12px 20px;
  box-sizing: border-box;
  outline: none;
  border: 1px solid #555;
  margin-bottom: 4px;
}

.focus1:focus {
  background-color: lightblue;
}

.focus2 {
  width: 100%;
  padding: 12px 20px;
  box-sizing: border-box;
  border: 3px solid #ccc;
  transition: 0.5s;
}

.focus2:focus {
  border: 3px solid #555 !important;
  outline: none;
}

.label {
  color: green;
  display: inline-block;
  width: 130px;
  text-align: right;
  padding-right: 15px;
}

.button {
  background-color: #4CAF50;
  border: none;
  color: white;
  padding: 15px 32px;
  text-decoration: none;
  margin: 4px 2px; font: Arial;
}
.input1 {
  width: 100%;
  padding: 12px 20px;
  box-sizing: border-box;
  margin: 8px 0;
}
.inputborder {
  width: 100%;
  padding: 12px 20px;
  box-sizing: border-box;
  border: 2px solid red;
  border-radius: 4px;
}
.inputborder2 {
  width: 100%;
  padding: 12px 20px;
  box-sizing: border-box;
  border: none;
  border-bottom: 2px solid red;
}
.inputcolor {
  width:100%;
  padding: 12px 20px;
  box-sizing: border-box;
  border:none;
  background-color:#3CBC8D;
  color:white;
}
.success {
border: 1px solid;
margin: 10px 0px;
padding:15px 10px 15px 50px;
background-repeat: no-repeat;
background-position: 10px center;
color: #4F8A10;
background-color: #DFF2BF;

}

input[type=text]#myInp {
    width: 130px;
    box-sizing: border-box;
    border: 2px solid #ccc;
    border-radius: 4px;
    font-size: 16px;
    background-color: white;
    background-image: url('searchicon.png');
    background-position: 10px 12px; 
    background-repeat: no-repeat;
    padding: 12px 20px 12px 40px;
    -webkit-transition: width .4s ease-in-out;
    transition: width .4s ease-in-out;
}
input[type=text]#myInp:focus {width: 100%;}
</style>
</head>
<body>
<form action="#" class="test">
<div id="generate" style="border-radius:5px;border-style:solid;background-color:#ffffff;padding:40px;width:500px;border-color:blue;">
<a target="_blank" href="javascript:generate();" class="button">Register</a>
</div>
<div id="contact" style="display:none; border-radius:5px;border-style:solid;background-color:#ffffff;padding:40px;width:500px;border-color:blue;">
 <table>
 	<tr><td><label for="number" >Your contact number: </label></td>
 	<td><input type="text" id="number" value="07483833777"/> </td></tr>
 	<tr><td><label for="mail" >Your mail ID: </label></td>
 	<td><input type="text" id="mail" value="joe.m@gmail.com"/>  </td>
    </tr>
 </table>
<a target="_blank" href="javascript:savecontact();" class="button">Next</a>
</div>
<div id="person" style="display:none;border-radius:5px;border-style:solid;background-color:#ffffff;padding:40px;width:500px;border-color:blue;">
<div class="success">Contact Details saved Successfully<br/><br/></div>
<table>
<tr><td><label for="number" >First Name</label></td><td> <input type="text" id="fName" value="Joe"/></td> </tr>
<tr><td><label for="number" >Last Name</label></td><td><input type="text" id="lname" value="Matt"/></td> </tr>
<tr><td><label for="number" >Date Of Birth</label></td><td><input type="text" id="dob" value="30-May-1992"/> </td> </tr>
<tr><td><label for="number" >House Number</label></td><td><input type="text" id="house"/></td>  </tr>
<tr><td><label for="number" >Post Code</label></td><td><input type="text" id="postcode"/></td> </tr>
<tr><td><label for="number" >Living Since? </label></td><td><input type="text" id="years"/></td></tr>
</table>
<a target="_blank" href="javascript:saveperson();" class="button">Next</a>
</div>
<div id="income" style="display:none;border-radius:5px;border-style:solid;background-color:#ffffff;padding:40px;width:500px;border-color:blue;">
<div class="success">Personal Details saved Successfully<br/><br/></div>

<table>
<tr><td><label for="number" >Employer :</label> </td><td><input type="text" id="employer" value="ABC Corp"/></td></tr>
<tr><td><label for="number" >Salary :</label></td><td> <input type="text" id="salary"/> </td></tr>
</table>
<a target="_blank" href="javascript:saveIncome();" class="button">Next</a>
</div>
<div id="passport" style="display:none;border-radius:5px;border-style:solid;background-color:#ffffff;padding:40px;width:500px;border-color:blue;">
<div class="success">Employment Details saved Successfully<br/><br/></div>

<table>
<tr><td><label for="number" >Upload your Passport: </label></td></tr>
<tr><td><input type="file" ></td></tr>

<tr><td> &nbsp; </td></tr>
<tr><td><label for="number" >Upload your Driving Licence : </label><br/><br/>
<input type="file" ></td></tr>
</table>
<a target="_blank" href="javascript:saveDL();" class="button">Next</a>
</div>
<div id="complete" style="display:none;border-radius:5px;border-style:solid;background-color:#ffffff;padding:40px;width:500px;border-color:blue;">
<div class="success">Thanks for registering your interest. Your Phone would be shipped to you shortly.</div>
</div>

</form>
</body>
</html>