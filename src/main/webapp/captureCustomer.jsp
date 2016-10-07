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
         function savePassport() {
        	 $('#passport').hide();
        	 $('#dl').show();
         }
         function saveDL() {
        	 $('#dl').hide();
        	 $('#complete').show();
         }
      </script>	
      
<style>
.btn {
    display: inline-block;
    padding: 6px 12px;
    margin-bottom: 0;
    font-size: 14px;
    font-weight: 400;
    line-height: 1.42857143;
    text-align: center;
    white-space: nowrap;
    vertical-align: middle;
    -ms-touch-action: manipulation;
    touch-action: manipulation;
    cursor: pointer;
    -webkit-user-select: none;
    -moz-user-select: none;
    -ms-user-select: none;
    user-select: none;
    background-image: none;
    border: 1px solid transparent;
    border-radius: 4px;
}
</style>
</head>
<body>
<div id="generate">
<button type="button" class="btn btn-success" onclick="javascript:generate();">Register</button><br/>
</div>
<div id="contact" style="display:none">
Your contact number: <input type="text" id="number" value="07483833777"/>  <br/>
Your mail ID: <input type="text" id="mail" value="joe.m@gmail.com"/>  <br/>
<button type="button" class="btn btn-success" onclick="javascript:savecontact();">Next</button>
</div>
<div id="person" style="display:none">
Contact Details saved Successfully<br/><br/>
First Name <input type="text" id="fName" value="Joe"/><br/> 
Last Name<input type="text" id="lname" value="Matt"/><br/> 
Date Of Birth<input type="text" id="dob" value="30-May-1992"/> <br/> 
House Number<input type="text" id="house"/><br/>  
Post Code<input type="text" id="postcode"/><br/>  
Living Since? <input type="text" id="years"/><br/> 
<button type="button" class="btn btn-success" onclick="javascript:saveperson();">Next</button>
</div>
<div id="income" style="display:none">
Personal Details saved Successfully<br/><br/>
Employer : <input type="text" id="employer" value="ABC Corp"/><br/>
Salary : <input type="text" id="salary"/> <br/>
<button type="button" class="btn btn-success" onclick="javascript:saveIncome();">Next</button>
</div>
<div id="passport" style="display:none">
Employment Details saved Successfully<br/><br/>
Upload your passport: <br/><br/>
<input type="file" > <br/> <br/>
<button type="button" class="btn btn-success" onclick="javascript:savePassport();">Next</button>
</div>
<div id="dl" style="display:none">
Upload your DL : <br/><br/>
<input type="file" ><br/><br/>
<button type="button" class="btn btn-success" onclick="javascript:saveDL();">Next</button>
</div>
<div id="complete" style="display:none">
Thanks for registering your interest. Your Phone would be shipped to you shortly.
</div>
</body>
</html>