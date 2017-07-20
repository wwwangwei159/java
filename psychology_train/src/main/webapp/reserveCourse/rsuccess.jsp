<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>预约</title>
    <%@ include file="/framework/commonjsadmin2.jsp" %>
    <script type="text/javascript">
      function goReserve(){
    	  location.href="${webRoot}/reserve/index.do";
      }
    
    </script>
</head>

<body>    
      <div class="container">
        <div class="row">
            <div class="col-md-5 col-md-offset-3">
                <div class="login-panel panel panel-default">
                    <div class="panel-heading">
                        <h3 class="panel-title">提交预约成功！</h3>
                    </div>
                    <div class="panel-body">
                            <fieldset>
                                <div class="col-md-offset-4">
	                                <button class="btn btn-primary btn-lg btn-success " type="button"  onclick="goReserve();">继续预约</button> 
	                                <button class="btn btn-primary btn-lg btn-info" type="button">返回主页</button>
                                </div>
                            </fieldset>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>

