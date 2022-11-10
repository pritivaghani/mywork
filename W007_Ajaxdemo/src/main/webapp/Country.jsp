<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>

<script type="text/javascript">

   $(document).ready(function(){
	
	   $.get("country",{},function(f){
		   $("#country").html(f);
		   
	   })
	   
	 })
   
   function getstate(cid)
   {
	   $.get("state",{cid:cid},function(f){
		   $("#state").html(f);
	   })
   }
   
   function getcity(sid)
   {
	   $.get("city",{sid:sid},function(f){
		   $("#city").html(f);
	   })
   }
</script>

</head>
<body>
       <select id="country" onchange="getstate(value)">
       <option>---select country---</option>
      </select>
      
      <select id="state" onchange="getcity(value)">
       <option>---select state---</option>
      </select>
      
      <select id="city">
       <option>---select city---</option>
      </select>
      

</body>
</html>