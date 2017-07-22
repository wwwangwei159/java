<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>

<head>
	
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Admin管理</title>
    <%@ include file="/framework/commonjsadmin2.jsp"  %>
	<script type="text/javascript">
	    $(document).ready(function() {
	        $('#dataTables-example').DataTable({
	            responsive: true
	        });
	    });
	    
	    function deleteById(id){
	    	var json = common.ajax("${webRoot}/mess/delete.do","messId="+id);
	    	if(json.success){
	    		alert("删除成功!");
	    		window.location.href="${webRoot}/mess/index.do";
	    	}
	    	
	    }
	    
	</script>
  
</head>


<body>    
	<div>
		<%@ include file="/framework/mainmenu.jsp"  %>
	 
     <div id="wrapper">
		
		<div id="page-wrapper">
            <div class="row">
                <div class="col-lg-12">
                    <h4 class="page-header">查看留言</h4>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            DataTables Advanced Tables
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <table width="100%" class="table table-striped table-bordered table-hover" id="dataTables-example">
                                <thead>
                                    <tr>
                                        <th>留言</th>
                                        <th>姓名</th>
                                        <th>电话</th>
                                        <th>时间</th>
                                        <th>Email</th>
                                        <th></th>
                                    </tr>
                                </thead>
                                <tbody>
                                 <c:forEach var="mess"  items="${list}">
                                	<tr class="odd gradeX">
                                    <td>${mess.message}</td>
                                    <td class="center">${mess.reserveName}</td>
                                    <td class="center">${mess.phone}</td>
                                    <td>${mess.leaveDatetime}</td>
                                    <td>${mess.email}</td>
                                    <td class="center"><button type="button"  onclick="deleteById('${mess.messId}')" class="btn btn-warning">删除</button></td>
                               		 </tr>
                               	</c:forEach>
                                </tbody>
                            </table>
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
        </div>
        <!-- /#page-wrapper -->

    </div>
    <!-- /#wrapper -->
  </div>  
</body>

</html>