<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>

<script type="text/javascript">

    $(document).ready(function(){
    
    	
    	
    	
    })
    
    function search()
    {
    	var pname = $("#pname").val()
    	$.get("product",{pname:pname},function(f){
    		//alert(f)
    		$("#data").html(f)
    	})
    }


</script>
</head>
<body>
    <input type="text" name="pname" id="pname" onkeyup="search()">
    <div id="data"></div>
</body>
</html>