
/**异步弹出框或者异步刷新页面*/
function switchToPage(url,divID,flag){
	if(flag){//如果是弹出框需要show，不是不需要
		$("#"+divID).modal('show');
	}
	$.ajax({
        async: true,
        url: url,
        type: "POST",
		contentType:"application/x-www-form-urlencoded; charset=utf-8", 
        success: function(data){
        	if(flag){
        		$("#"+divID).empty().html(data).fadeIn();
    		}else{
    			$("#"+divID).empty().html(data);
    		}
		}
    });
}
//引用common.js的方法
function Common() {}
with(Common) {
    //异步调用方法写入;
    prototype.ajax = function(ajaxurl, param,errorFunc) {
    	var isFunc = $.isFunction(errorFunc);
    	if(!isFunc){
    		errorFunc = function (){
    			bootbox.alert("操作失败","关闭");
    		}
    	}
        var responseText = $.ajax({
			            async: false,
			            url: ajaxurl,
			            //提交给哪个执行 
			            data: param,
			            type: "POST",
            			contentType:"application/x-www-form-urlencoded; charset=utf-8", 
			            error:errorFunc
			        });
		var text = responseText.responseText;
        if (text != '') {
            return eval('(' + text + ')');
        }
        return eval('');
    }
}

var common = new Common();

var target ;
var options = {
	success: function(data){
		$(target).empty().html(data).hide().fadeIn();			
		updateBreadCrumbs();		//Update the BreadCrumbs	
		notification("",false);		//关闭
	},
	error:  function(xhr, type, s){
		notification("",false);		//关闭
		bootbox.alert("页面加载错误："+url,"关闭");
	}
}

$(document).ready(function(){
	/**
	 * 页面加载完成后，给页面中的a标签绑定点击事件，该事件将进行form表单提交
	 * a标签格式：<a href="xxx.do" data-toggle="form" data-target="#xxx">xxx</a>
	 */
	$('body').on('click.a.data-api', 'a[data-toggle="form"],button[data-toggle="form"]', function ( e ) {
		var _form = $($(this).attr("data-target")) ;
		_form.submit();
		return false;
	});
	/**
	 * 页面加载完成后，给页面中的a标签绑定点击事件，该事件将向div中异步加载信息
	 * a标签格式：<a href="xxx.do" data-toggle="ajax" data-target="#xxx" data-param="xxx">xxx</a>
	 * href:异步加载的超链接,
	 * data-param：向后台提交的参数,
	 * data-toggle：页面加载的类型：ajax表示异步加载,
	 * data-target:页面需要加载到哪个容器中。
	 * 其中：href和data-toggle="ajax"、 data-target="#xxx"是必须的。data-param="xxx"如没有，可以不写。
	 */
	$('body').on('click.a.data-api', 'a[data-toggle="ajax"]', function ( e ) {
		var panel = $(this).attr("data-target");
		var url = $(this).attr("href");
		var param = $(this).attr("data-param");
		loadUrl(panel,url,param);
		return false;
	});
	/**
	 * 为a标签绑定点击后弹出对话框的事件
	 * 通过事件冒泡方式，当点击data-toggle="model"的a标签时，将在data-target="#xxx"的容器中显示href="xxx"的内容。
	 * a标签中各项属性:
	 * href 将要显示内容的链接
	 * data-param 需要传递的参数
	 * data-target 内容显示的容器，需要是bootstrap的modal框
	 */
	$('body').on('click.a.data-api', 'a[data-toggle="modal"]', function ( e ) {
		var panel = $(this).attr("data-target");
		var url = $(this).attr("href");
		var param = $(this).attr("data-param");
		$(panel).modal('show');
		
		loadUrl(panel,url,param);
		return false;
	});
	/**
	 * 表单异步提交后，返回的页面显示在指定的容器中。
	 * 当点击提交data-toggle = "ajax" 的form表单时，会将放回的信息显示在target="#xxx"的容器中
	 * form中各项属性：
	 * data-toggle，必须，当且仅当值为"aja"时，触发此方法。
	 * target,必须，内容为#+容器Id
	 */
	$('body').on('submit.form.data-api', 'form[data-toggle="ajax"]', function ( e ) {
		var panel = $(this).attr("target");
		$.ajax({
			async: false,
            url: this.action,
            type: "POST",
            data:$(this).formSerialize(),
			contentType:"application/x-www-form-urlencoded; charset=utf-8", 
            success: function(data){
				$(panel).empty().html(data).hide().fadeIn();
			}
        });
        return false;
	});
	/**
	 * 当点击样式中含有"cancel"的控件时，触发返回事件
	 */
	$('body').on('click.a.data-api', '.cancel', function ( e ) {
		history.go(-1)
		return false;
	});
	/**
	 * 当点击样式中包含有"btn-delete"的控件时，触发删除事件
	 */
	$('body').on('click.a.data-api', '.btn-delete', function ( e ) {
		var url = this.href;
		bootbox.confirm("确定要删除?","取消","确定", function(result) {
			if(result) {
				location.href = url;
			}
		});
		return false;
	});
	function loadUrl(panel,url,param){
		if(param && param.length>0){
			param=param+"&postType=ajax";
		}else{
			param="postType=ajax";
		}
		$.ajax({
            async: false,
            url: url,
            data:param,
            //提交给哪个执行 
            type: "POST",
			contentType:"application/x-www-form-urlencoded; charset=utf-8", 
            success: function(data){
				$(panel).empty().html(data).hide().fadeIn();
			}
        });
	}
});