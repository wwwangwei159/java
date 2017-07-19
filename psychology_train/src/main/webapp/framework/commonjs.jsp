<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<link rel="shortcut icon" href="${webRoot}/resource/images/favicon.ico">
<!-- end: Favicon -->
<!-- start: base CSS -->
<link href="${webRoot}/resource/plugin/assets_v3_0_0/css/bootstrap.min.css" rel="stylesheet"/>
<link href="${webRoot}/resource/plugin/assets_v3_0_0/css/font-awesome.min.css" rel="stylesheet" />
<!-- end: base CSS -->
<!--[if IE 7]>
    <link rel="stylesheet" href="${webRoot}/resource/plugin/assets_v3_0_0/css/font-awesome-ie7.min.css"/>
<![endif]-->
<!--fonts-->
<link rel="stylesheet" href="${webRoot}/resource/plugin/assets_v3_0_0/css/ace-fonts.css"/>

<!--[if lte IE 8]>
    <link rel="stylesheet" href="${webRoot}/resource/plugin/assets_v3_0_0/css/ace-ie.min.css"/>
<![endif]-->

<link rel="stylesheet" href="${webRoot}/resource/plugin/assets_v3_0_0/css/fullcalendar.css" />

<!--page specific plugin styles-->
<link rel="stylesheet" href="${webRoot}/resource/plugin/assets_v3_0_0/css/jquery-ui-1.10.3.custom.min.css"/>
<link rel="stylesheet" href="${webRoot}/resource/plugin/assets_v3_0_0/css/datepicker.css"/>
<link rel="stylesheet" href="${webRoot}/resource/plugin/assets_v3_0_0/css/bootstrap-timepicker.css"/>
<link rel="stylesheet" href="${webRoot}/resource/plugin/assets_v3_0_0/css/daterangepicker.css"/>
<link rel="stylesheet" href="${webRoot}/resource/plugin/assets_v3_0_0/css/colorpicker.css"/>
<link rel="stylesheet" href="${webRoot}/resource/plugin/assets_v3_0_0/css/chosen.css"/>
<!--ace styles-->
<link rel="stylesheet" href="${webRoot}/resource/plugin/assets_v3_0_0/css/uncompressed/ace.css"/>
<link rel="stylesheet" href="${webRoot}/resource/plugin/assets_v3_0_0/css/ace-rtl.min.css" />
<link rel="stylesheet" href="${webRoot}/resource/plugin/assets_v3_0_0/css/ace-skins.min.css"/>
<!--custom styles-->
<link rel="stylesheet" href="${webRoot}/resource/style/custom.css">
<!--ace settings handler-->
<script src="${webRoot}/resource/plugin/assets_v3_0_0/js/ace-extra.min.js"></script>
<!--basic scripts-->
<!--[if !IE]>-->
    <script type="text/javascript">
        window.jQuery || document.write("<script src='${webRoot}/resource/plugin/assets_v3_0_0/js/jquery-2.0.3.min.js'>" + "<" + "/script>");
    </script>
<!--<![endif]-->
<!--[if IE]>
    <script type="text/javascript">
        window.jQuery || document.write("<script src='${webRoot}/resource/plugin/assets_v3_0_0/js/jquery-1.10.2.min.js'>" + "<" + "/script>");
    </script>
<![endif]-->
<script type="text/javascript">
    if ("ontouchend" in document) document.write("<script src='${webRoot}/resource/plugin/assets_v3_0_0/js/jquery.mobile.custom.min.js'>" + "<" + "/script>");
</script>
<script src="${webRoot}/resource/plugin/assets_v3_0_0/js/bootstrap.min.js"></script>
<!--[if lte IE 8]>
    <script src="${webRoot}/resource/plugin/assets_v3_0_0/js/excanvas.min.js"></script>
<![endif]-->
<script src="${webRoot}/resource/plugin/assets_v3_0_0/js/jquery-ui-1.10.3.custom.min.js"></script>
<script src="${webRoot}/resource/plugin/assets_v3_0_0/js/jquery.ui.touch-punch.min.js"></script>
<script src="${webRoot}/resource/plugin/assets_v3_0_0/js/jquery.slimscroll.min.js"></script>
<script src="${webRoot}/resource/plugin/assets_v3_0_0/js/jquery.easy-pie-chart.min.js"></script>
<script src="${webRoot}/resource/plugin/assets_v3_0_0/js/jquery.sparkline.min.js"></script>
<script src="${webRoot}/resource/plugin/assets_v3_0_0/js/flot/jquery.flot.min.js"></script>
<script src="${webRoot}/resource/plugin/assets_v3_0_0/js/flot/jquery.flot.pie.min.js"></script>
<script src="${webRoot}/resource/plugin/assets_v3_0_0/js/flot/jquery.flot.resize.min.js"></script>
<!--ace scripts-->
<script src="${webRoot}/resource/plugin/assets_v3_0_0/js/ace-elements.min.js"></script>
<script src="${webRoot}/resource/plugin/assets_v3_0_0/js/uncompressed/ace.js"></script>
<!--page specific plugin scripts-->
<script src="${webRoot}/resource/plugin/assets_v3_0_0/js/chosen.jquery.min.js"></script>
<script src="${webRoot}/resource/plugin/assets_v3_0_0/js/fuelux/fuelux.spinner.min.js"></script>
<script src="${webRoot}/resource/plugin/assets_v3_0_0/js/date-time/bootstrap-datepicker.min.js"></script>
<script src="${webRoot}/resource/plugin/assets_v3_0_0/js/date-time/bootstrap-timepicker.min.js"></script>
<script src="${webRoot}/resource/plugin/assets_v3_0_0/js/date-time/moment.min.js"></script>
<script src="${webRoot}/resource/plugin/assets_v3_0_0/js/date-time/daterangepicker.min.js"></script>
<script src="${webRoot}/resource/plugin/assets_v3_0_0/js/bootstrap-colorpicker.min.js"></script>
<script src="${webRoot}/resource/plugin/assets_v3_0_0/js/jquery.knob.min.js"></script>
<script src="${webRoot}/resource/plugin/assets_v3_0_0/js/jquery.autosize-min.js"></script>
<script src="${webRoot}/resource/plugin/assets_v3_0_0/js/jquery.inputlimiter.1.3.1.min.js"></script>
<script src="${webRoot}/resource/plugin/assets_v3_0_0/js/jquery.maskedinput.min.js"></script>
<script src="${webRoot}/resource/plugin/assets_v3_0_0/js/bootstrap-tag.min.js"></script>


<script src="${webRoot}/resource/js/jquery.form.js"></script>
<script src="${webRoot}/resource/plugin/assets_v3_0_0/js/jquery.dataTables.min.js"></script>
<script src="${webRoot}/resource/plugin/assets_v3_0_0/js/jquery.dataTables.bootstrap.js"></script>
<script src="${webRoot}/resource/plugin/assets_v3_0_0/js/bootbox.min.js"></script>
<!--Validform scripts-->
<script src="${webRoot}/resource/js/Validform_v5.3.2.js"></script>
<!--self scripts-->
<script src="${webRoot}/resource/js/main.js"></script>
<!-- UEdtior -->
<script type="text/javascript" src="${webRoot}/resource/plugin/ueditor/ueditor.config.js"></script>
<script type="text/javascript" src="${webRoot}/resource/plugin/ueditor/ueditor.all.js"></script>
<!-- custom.js -->
<script type="text/javascript" src="${webRoot}/resource/js/custom.js"></script>
<script type="text/javascript" src ="${webRoot}/resource/js/customTable.js"></script>
