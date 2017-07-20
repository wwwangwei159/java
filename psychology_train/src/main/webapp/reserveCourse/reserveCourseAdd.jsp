<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
	
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>预约</title>
    <%@ include file="/framework/commonjsadmin2.jsp" %>
  
</head>

<body>    
      <div class="container">
        <div class="row">
            <div class="col-md-6 col-md-offset-3">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h3 class="panel-title">请预约</h3>
                    </div>
                    <div class="panel-body">
                        <form id="form" name="form" action="${webRoot}/reserve/insert.do" method="post" >
                        		<input class="form-control" type="hidden" placeholder="状态" name="status" value="Active"  autofocus>
                            <fieldset>
                            	<div class="form-group">
                                    <input class="form-control" placeholder="电话" name="phone"  autofocus>
                                </div>
                                <div class="form-group">
                                    <input class="form-control" placeholder="称呼" name="reserveName"  autofocus>
                                </div>
                                <div class="form-group">
                                    <input class="form-control" placeholder="E-mail" name="email" type="email" autofocus>
                                </div>
                                <div class="col-md-offset-4">
	                                <button class="btn btn-primary btn-lg btn-success " type="submit">提交</button> 
	                                <button class="btn btn-primary btn-lg btn-info" type="button">返回</button>
                                </div>
                            </fieldset>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>

