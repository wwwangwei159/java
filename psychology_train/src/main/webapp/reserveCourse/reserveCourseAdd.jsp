<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
	
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>预约</title>
    <%@ include file="/framework/commonjsadmin2.jsp" %>
    <script>jQuery.noConflict()</script>
    <!--时间控件样式-->  
   <link rel="stylesheet" type="text/css" href="${webRoot}/mdatetimer/zepto.mdatetimer.css">
   <!--时间控件-->  
   <script src="${webRoot}/mdatetimer/zepto.js"></script>
   <script src="${webRoot}/mdatetimer/zepto.mdatetimer.js"></script>

  
  
</head>

<body>    
      <div class="container">
      <%@ include file="/framework/mainmenu.jsp" %>
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
                                <div class="form-group">
                                    <select multiple class="form-control" name="userId">
                                                <option value="" >请选择您要预约的老师</option>
                                                <option>1</option>
                                                <option>2</option>
							
                                    </select>
                                </div>
                                <div class="form-group">
                                    <input id="picktimeReserve" class="form-control" name="pointDatetime" placeholder="预约时间" type="text" readonly/>
                                    
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
    <script>
$(function(){

	var config = {
		mode : 2, //时间选择器模式：1：年月日，2：年月日时分（24小时），3：年月日时分（12小时），4：年月日时分秒。默认：1
		format : 2, //时间格式化方式：1：2015年06月10日 17时30分46秒，2：2015-05-10  17:30:46。默认：2
		years : [2017,2018,2019,2020,2021,2022,2023], //年份数组
		nowbtn : false, //是否显示现在按钮
		onOk : function(){
			//alert('OK');
		},  //点击确定时添加额外的执行函数 默认null
		onCancel : function(){
			//alert('A');
		}, //点击取消时添加额外的执行函数 默认null
	}

	$('#picktimeReserve').mdatetimer(config);
});

</script>
</body>
</html>

