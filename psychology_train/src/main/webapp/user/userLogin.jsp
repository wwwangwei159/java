<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>

<head>
	
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>SB Admin 2 - Bootstrap Admin Theme</title>
    <%@ include file="/framework/commonjsadmin2.jsp" %>
	<script type="text/javascript">
	$(function(){
		//alert("登录页面");
		
	});
	</script>
  
</head>


<body>

    <div class="container">
        <div class="row">
            <div class="col-md-4 col-md-offset-4">
                <div class="login-panel panel panel-default">
                    <div class="panel-heading">
                        <h3 class="panel-title">Please Sign In</h3>
                    </div>
                    <div class="panel-body">
                        <form method="post" action="${webRoot}/user/login.do" role="form">
                            <fieldset>
                                <div class="form-group">
                                    <input class="form-control" placeholder="phone or mobile" name="phone" type="text" autofocus>
                                </div>
                                <div class="form-group">
                                    <input class="form-control" placeholder="Password" name="pwd" type="password" value="">
                                </div>
                                <div class="checkbox">
                                    <label>
                                        <input name="remember" type="checkbox" value="Remember Me">Remember Me
                                    </label>
                                </div>
                                <!-- Change this to a button or input when using this as a form -->
                                <c:if test="${login!=null&&login=='fail'}">
								 <h3 class="panel-title"><font color="red" >登陆失败,情重新输入账号或密码!</font></h3>
								</c:if>
                                <button class="btn btn-lg btn-success btn-block" type="submit">Login</button>
                            </fieldset>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>

   

</body>

</html>