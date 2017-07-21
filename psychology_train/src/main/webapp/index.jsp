<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>心理测评</title>
    <!-- load stylesheets -->
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Open+Sans:300,400">  
    <!-- Google web font "Open Sans" -->
    <link rel="stylesheet" href="/psychology_train/demo2/font-awesome-4.5.0/css/font-awesome.min.css">                
    <!-- Font Awesome -->
    <link rel="stylesheet" href="/psychology_train/demo2/css/bootstrap.min.css">                                      
    <!-- Bootstrap style -->
    <link rel="stylesheet" href="/psychology_train/demo2/css/hero-slider-style.css">                              
    <!-- Hero slider style (https://codyhouse.co/gem/hero-slider/) -->
    <link rel="stylesheet" href="/psychology_train/demo2/css/magnific-popup.css">                       
    <!-- Magnific popup style (http://dimsemenov.com/plugins/magnific-popup/) -->
    <link rel="stylesheet" href="/psychology_train/demo2/css/templatemo-style.css">                                   
    <!-- Templatemo style -->
 
</head>

    <body>
        
        <!-- Content -->
        <div class="cd-hero">

            <!-- Navigation -->        
            <div class="cd-slider-nav">
                <nav class="navbar">
                    <div class="tm-navbar-bg">
                        
                        <a class="navbar-brand text-uppercase" href="#"><i class="fa fa-flash tm-brand-icon"></i>Upper</a>

                        <button class="navbar-toggler hidden-lg-up" type="button" data-toggle="collapse" data-target="#tmNavbar">
                            &#9776;
                        </button>
                        <div class="collapse navbar-toggleable-md text-xs-center text-uppercase tm-navbar" id="tmNavbar">
                            <ul class="nav navbar-nav">
                                <li class="nav-item active selected">
                                    <a class="nav-link" href="#0" data-no="1">Home <span class="sr-only">(current)</span></a>
                                </li>                                
                                <li class="nav-item">
                                    <a class="nav-link" href="#0" data-no="2">图片欣赏</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="#0" data-no="3">问卷测评</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="#0" data-no="4" onclick="loadCourse();" >预约课程</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="#0" data-no="5">留言</a>
                                </li>
                                 <li class="nav-item">
                                    <a class="nav-link" onclick="window.location.href='/psychology_train/user/tologin.do'" href="#"  data-no="6">login in</a>
                                </li>
                            </ul>
                        </div>                        
                    </div>

                </nav>
            </div> 

            <ul class="cd-hero-slider">

                <!-- Page 1 Home -->
                <li class="selected">
                    <div class="cd-full-width">
                        <div class="container-fluid js-tm-page-content tm-page-pad" data-page-no="1">
                            <div class="row">
                                    <div class="tm-3-col-container">                                        
                                            <div class="col-xs-12 col-sm-6 col-md-4 col-lg-4 tm-3-col-textbox">
                                                <div class="text-xs-left tm-textbox tm-textbox-padding tm-bg-white-translucent tm-3-col-textbox-inner">
                                                    <i class="fa fa-4x fa-pagelines tm-home-fa"></i>
                                                    <h2 class="tm-text-title">Hello Guest</h2>                                           
                                                    <p class="tm-text">Upper HTML Template contains different background images for pages. Please check <a href="/tm-494-motion" target="_parent">Motion Template</a> if you want to see video backgrounds. Feel free to download and use web templates from templatemo.</p>
                                                </div>
                                            </div>
                                            <div class="col-xs-12 col-sm-6 col-md-4 col-lg-4 tm-3-col-textbox">
                                                <div class="text-xs-left tm-textbox tm-textbox-padding tm-bg-white-translucent tm-3-col-textbox-inner">
                                                    <i class="fa fa-4x fa-bicycle tm-home-fa"></i>
                                                    <h2 class="tm-text-title">Welcome!</h2>
                                                    <p class="tm-text">There are 3 different gallaries in this template. You can customize them in any suitable way you prefer. You can also modify the content columns as you wish. Images are from Unsplash website. Good Luck!</p>
                                                </div>          
                                            </div>
                                            <div class="col-xs-12 col-sm-6 col-md-4 col-lg-4 tm-3-col-textbox">
                                                <div class="text-xs-left tm-textbox tm-textbox-padding tm-bg-white-translucent tm-3-col-textbox-inner">
                                                    <i class="fa fa-4x fa-plane tm-home-fa"></i>
                                                    <h2 class="tm-text-title">Stay relaxed</h2>
                                                    <p class="tm-text">You can easily change icons in HTML codes by <a href="http://fontawesome.io/icons/" target="_parent">Font Awesome</a>. Praesent tempus dapibus. Curabitur sodales, est auctor congue vulputate, nisl tellus finibus nunc, vitae consectetur enim.</p>
                                                </div>          
                                            </div>                                        
                                    </div>
                            </div>
                        </div>
                    </div>
                </li>
                
                <!-- Page 2 Gallery One -->
                <li>                    
                    <div class="cd-full-width">
                        <div class="container-fluid js-tm-page-content" data-page-no="2" data-page-type="gallery">
                            <div class="tm-img-gallery-container">
                                <div class="tm-img-gallery gallery-one">
                                <!-- Gallery One pop up connected with JS code below -->                                    
                                    <div class="tm-img-gallery-info-container">                                    
                                        <h2 class="tm-text-title tm-gallery-title tm-white"><span class="tm-white">First Image Gallery</span></h2>
                                        <p class="tm-text">Curabitur quis tellus sed orci rhoncus fermentum. Praesent sollicitudin scelerisque nunc et vehicula. Sed ex magna, elementum ut volutpat ut, vehicula quis metus.
                                        </p>
                                    </div>
                                    <div class="grid-item">
                                        <figure class="effect-ruby">
                                            <img src="/psychology_train/demo2/img/tm-img-01-tn.jpg" alt="Image" class="img-fluid tm-img">
                                            <figcaption>
                                                <h2 class="tm-figure-title">Image <span>One</span></h2>
                                                <p class="tm-figure-description">Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
                                                <a href="/psychology_train/demo2/img/tm-img-01.jpg">View more</a>
                                            </figcaption>           
                                        </figure>
                                    </div>
                                    <div class="grid-item">
                                        <figure class="effect-ruby">
                                            <img src="/psychology_train/demo2/img/tm-img-02-tn.jpg" alt="Image" class="img-fluid tm-img">
                                            <figcaption>
                                                <h2 class="tm-figure-title">Image <span>Two</span></h2>
                                                <p class="tm-figure-description">Maecenas purus sem, lobortis id odio in sapien.</p>
                                                <a href="/psychology_train/demo2/img/tm-img-02.jpg">View more</a>
                                            </figcaption>
                                        </figure>
                                    </div>
                                    <div class="grid-item">
                                        <figure class="effect-ruby">
                                            <img src="/psychology_train/demo2/img/tm-img-03-tn.jpg" alt="Image" class="img-fluid tm-img">
                                            <figcaption>
                                                <h2 class="tm-figure-title">Image <span>Three</span></h2>
                                                <p class="tm-figure-description">Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
                                                <a href="/psychology_train/demo2/img/tm-img-03.jpg">View more</a>
                                            </figcaption>           
                                        </figure>
                                    </div>
                                    <div class="grid-item">
                                        <figure class="effect-ruby">
                                            <img src="/psychology_train/demo2/img/tm-img-04-tn.jpg" alt="Image" class="img-fluid tm-img">
                                            <figcaption>
                                                <h2 class="tm-figure-title">Image <span>Four</span></h2>
                                                <p class="tm-figure-description">Maecenas purus sem, lobortis id odio in sapien.</p>
                                                <a href="/psychology_train/demo2/img/tm-img-04.jpg">View more</a>
                                            </figcaption>           
                                        </figure>
                                    </div>                                                                          
                                </div>                                 
                            </div>
                        </div>                                                    
                    </div>                    
                </li>

                <!-- Page 3 Gallery Two -->
                <li>                    
                    <div class="cd-full-width">
                        <div class="container-fluid js-tm-page-content" data-page-no="3" data-page-type="gallery">
                            <div class="tm-img-gallery-container tm-img-gallery-container-2">
                                <div class="tm-img-gallery gallery-two">
                                <!-- Gallery Two pop up connected with JS code below -->
                                    
                                    <div class="tm-img-gallery-info-container">                                    
                                        <h2 class="tm-text-title tm-gallery-title"><span class="tm-white">Second Gallery</span></h2>
                                        <p class="tm-text"><span class="tm-white">Aenean nulla lorem, laoreet eu nibh et, lacinia ullamcorper dui. Nullam ut tincidunt odio. Morbi accumsan diam vel enim cursus, in dapibus eros tristique.</span>
                                        </p>
                                    </div>
                                    <div class="grid-item">
                                        <figure class="effect-ruby">
                                            <img src="/psychology_train/demo2/img/tm-img-05-tn.jpg" alt="Image" class="img-fluid tm-img">
                                            <figcaption>
                                                <h2 class="tm-figure-title">Picture <span>One</span></h2>
                                                <p class="tm-figure-description">Suspendisse id placerat risus. Mauris quis luctus risus.</p>
                                                <a href="/psychology_train/demo2/img/tm-img-05.jpg">View more</a>
                                            </figcaption>           
                                        </figure>
                                    </div>
                                    <div class="grid-item">
                                        <figure class="effect-ruby">
                                            <img src="/psychology_train/demo2/img/tm-img-06-tn.jpg" alt="Image" class="img-fluid tm-img">
                                            <figcaption>
                                                <h2 class="tm-figure-title">Picture <span>Two</span></h2>
                                                <p class="tm-figure-description">Maecenas purus sem, lobortis id odio in sapien.</p>
                                                <a href="/psychology_train/demo2/img/tm-img-06.jpg">View more</a>
                                            </figcaption>           
                                        </figure>
                                    </div>
                                    <div class="grid-item">
                                        <figure class="effect-ruby">
                                            <img src="/psychology_train/demo2/img/tm-img-07-tn.jpg" alt="Image" class="img-fluid tm-img">
                                            <figcaption>
                                                <h2 class="tm-figure-title">Picture <span>Three</span></h2>
                                                <p class="tm-figure-description">Suspendisse id placerat risus. Mauris quis luctus risus.</p>
                                                <a href="/psychology_train/demo2/img/tm-img-07.jpg">View more</a>
                                            </figcaption>           
                                        </figure>
                                    </div>
                                    <div class="grid-item">
                                        <figure class="effect-ruby">
                                            <img src="/psychology_train/demo2/img/tm-img-08-tn.jpg" alt="Image" class="img-fluid tm-img">
                                            <figcaption>
                                                <h2 class="tm-figure-title">Picture <span>Four</span></h2>
                                                <p class="tm-figure-description">Maecenas purus sem, lobortis id odio in sapien.</p>
                                                <a href="/psychology_train/demo2/img/tm-img-08.jpg">View more</a>
                                            </figcaption>           
                                        </figure>
                                    </div>
                                    <div class="grid-item">
                                        <figure class="effect-ruby">
                                            <img src="/psychology_train/demo2/img/tm-img-09-tn.jpg" alt="Image" class="img-fluid tm-img">
                                            <figcaption>
                                                <h2 class="tm-figure-title">Picture <span>Five</span></h2>
                                                <p class="tm-figure-description">Suspendisse id placerat risus. Mauris quis luctus risus.</p>
                                                <a href="/psychology_train/demo2/img/tm-img-09.jpg">View more</a>
                                            </figcaption>           
                                        </figure>
                                    </div>
                                    <div class="grid-item">
                                        <figure class="effect-ruby">
                                            <img src="/psychology_train/demo2/img/tm-img-10-tn.jpg" alt="Image" class="img-fluid tm-img">
                                            <figcaption>
                                                <h2 class="tm-figure-title">Picture <span>Six</span></h2>
                                                <p class="tm-figure-description">Maecenas purus sem, lobortis id odio in sapien.</p>
                                                <a href="/psychology_train/demo2/img/tm-img-10.jpg">View more</a>
                                            </figcaption>           
                                        </figure>
                                    </div>  
                                </div>                                 
                            </div>
                        </div>                      
                    </div>
                </li>
                <!-- Page 4 预约 -->
                <li>
                <div class="cd-full-width">
                    <div class="container-fluid js-tm-page-content" data-page-no="4" data-page-type="gallery">          
                   		<%@ include file="/reserveCourse/reserveCourseIndex.jsp" %>
                   </div>
                        
                </div> <!-- .cd-full-width -->
                </li>
                <!-- Page 5 留言 -->
                <li>
                <div class="cd-full-width">
                    <div class="container-fluid js-tm-page-content tm-page-pad" data-page-no="5">
                   		<%@ include file="/message/messIndex.jsp" %>
                   </div>
                        
                </div> <!-- .cd-full-width -->
                </li>
                
                 <!-- Page 5 关于我们 -->
                <li>
                    <div class="cd-full-width">
                        <div class="container-fluid js-tm-page-content tm-page-width" data-page-no="6">
                            <div class="row">
                                <div class="col-xs-12">
                                    <div class="tm-flex">
                                        <div class="tm-bg-white-translucent text-xs-left tm-textbox tm-textbox-padding tm-white-box-margin-b">
                                            <h2 class="tm-text-title">Lorem ipsum dolor</h2>
                                            <p class="tm-text">Nulla efficitur, ligula et imperdiet volutpat, lacus tortor tempus massa, eget tempus quam nibh vel nulla. Vivamus non molestie leo, non tincidunt diam. Mauris sagittis elit in velit ultricies aliquet sed in magna. Pellentesque semper, est nec consequat viverra, sem augue tincidunt nisi, a posuere nisi sapien sed sapien. Nulla facilisi.</p>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            
                            <div class="row">
                                <div class="col-xs-12">
                                    <div class="tm-flex">
                                        <div class="tm-bg-white-translucent text-xs-left tm-textbox tm-2-col-textbox-2 tm-textbox-padding">
                                            <h2 class="tm-text-title">Nulla facilisi</h2>
                                            <p class="tm-text">Donec vitae bibendum est, et ultrices urna. Curabitur ac bibendum augue, a convallis mi. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Sed ultrices placerat arcu.</p>
                                        </div>
                                        <div class="tm-bg-white-translucent text-xs-left tm-textbox tm-2-col-textbox-2 tm-textbox-padding">
                                            <h2 class="tm-text-title">Aliquam sem sem</h2>
                                            <p class="tm-text">Proin sagittis mauris dolor, vel efficitur lectus dictum nec. Sed ultrices placerat arcu, id malesuada metus cursus suscipit. Donex quis consectetur ligula. Proin accumsan eros id nisi porttitor, a facilisis quam cursus.</p>     
                                        </div>
                                    </div>
                                </div>
                            </div>                        
                        </div>              
                    </div> <!-- .cd-full-width -->

                </li>
                
            </ul> <!-- .cd-hero-slider -->
            
            <footer class="tm-footer">
            
                <div class="tm-social-icons-container text-xs-center">
                    <a href="#" class="tm-social-link"><i class="fa fa-facebook"></i></a>
                    <a href="#" class="tm-social-link"><i class="fa fa-google-plus"></i></a>
                    <a href="#" class="tm-social-link"><i class="fa fa-twitter"></i></a>
                    <a href="#" class="tm-social-link"><i class="fa fa-behance"></i></a>
                    <a href="#" class="tm-social-link"><i class="fa fa-linkedin"></i></a>
                </div>
               <p class="tm-copyright-text">Copyright &copy; 2017 地址：河北省涿州市</p>
            
                
            </footer>
                    
        </div> <!-- .cd-hero -->
        

        <!-- Preloader, https://ihatetomatoes.net/create-custom-preloading-screen/ -->
        <div id="loader-wrapper">
            
            <div id="loader"></div>
            <div class="loader-section section-left"></div>
            <div class="loader-section section-right"></div>

        </div>
        
        <!-- load JS files -->
        <script src="/psychology_train/demo2/js/jquery-1.11.3.min.js"></script>         <!-- jQuery (https://jquery.com/download/) -->
        <script src="/psychology_train/demo2/js/tether.min.js"></script> <!-- Tether for Bootstrap (http://stackoverflow.com/questions/34567939/how-to-fix-the-error-error-bootstrap-tooltips-require-tether-http-github-h) --> 
        <script src="/psychology_train/demo2/js/bootstrap.min.js"></script>             <!-- Bootstrap js (v4-alpha.getbootstrap.com/) -->
        <script src="/psychology_train/demo2/js/hero-slider-main.js"></script>          <!-- Hero slider (https://codyhouse.co/gem/hero-slider/) -->
        <script src="/psychology_train/demo2/js/jquery.magnific-popup.min.js"></script> <!-- Magnific popup (http://dimsemenov.com/plugins/magnific-popup/) -->
    <!--时间控件样式-->  
  <script src="/psychology_train/mobiscroll/dev/js/mobiscroll.core-2.5.2.js" type="text/javascript"></script>
	<script src="/psychology_train/mobiscroll/dev/js/mobiscroll.core-2.5.2-zh.js" type="text/javascript"></script>

	<link href="/psychology_train/mobiscroll/dev/css/mobiscroll.core-2.5.2.css" rel="stylesheet" type="text/css" />
	<link href="/psychology_train/mobiscroll/dev/css/mobiscroll.animation-2.5.2.css" rel="stylesheet" type="text/css" />
	<script src="/psychology_train/mobiscroll/dev/js/mobiscroll.datetime-2.5.1.js" type="text/javascript"></script>
	<script src="/psychology_train/mobiscroll/dev/js/mobiscroll.datetime-2.5.1-zh.js" type="text/javascript"></script>

	<!-- S 可根据自己喜好引入样式风格文件 -->
	<script src="/psychology_train/mobiscroll/dev/js/mobiscroll.android-ics-2.5.2.js" type="text/javascript"></script>
	<link href="/psychology_train/mobiscroll/dev/css/mobiscroll.android-ics-2.5.2.css" rel="stylesheet" type="text/css" />
	<!-- E 可根据自己喜好引入样式风格文件 -->
        <script>

            function adjustHeightOfPage(pageNo) {

                var offset = 80;
                var pageContentHeight = 0;

                var pageType = $('div[data-page-no="' + pageNo + '"]').data("page-type");

                if( pageType != undefined && pageType == "gallery") {
                    pageContentHeight = $(".cd-hero-slider li:nth-of-type(" + pageNo + ") .tm-img-gallery-container").height();
                }
                else {
                    pageContentHeight = $(".cd-hero-slider li:nth-of-type(" + pageNo + ") .js-tm-page-content").height();
                }

                if($(window).width() >= 992) { offset = 120; }
                else if($(window).width() < 480) { offset = 40; }
               
                // Get the page height
                var totalPageHeight = 15 + $('.cd-slider-nav').height()
                                        + pageContentHeight + offset
                                        + $('.tm-footer').height();

                // Adjust layout based on page height and window height
                if(totalPageHeight > $(window).height()) 
                {
                    $('.cd-hero-slider').addClass('small-screen');
                    $('.cd-hero-slider li:nth-of-type(' + pageNo + ')').css("min-height", totalPageHeight + "px");
                }
                else 
                {
                    $('.cd-hero-slider').removeClass('small-screen');
                    $('.cd-hero-slider li:nth-of-type(' + pageNo + ')').css("min-height", "100%");
                }
            }

            /*
                Everything is loaded including images.
            */
            $(window).load(function(){

                adjustHeightOfPage(1); // Adjust page height

                /* Gallery One pop up
                -----------------------------------------*/
                $('.gallery-one').magnificPopup({
                    delegate: 'a', // child items selector, by clicking on it popup will open
                    type: 'image',
                    gallery:{enabled:true}                
                });
				
				/* Gallery Two pop up
                -----------------------------------------*/
				$('.gallery-two').magnificPopup({
                    delegate: 'a',
                    type: 'image',
                    gallery:{enabled:true}                
                });

                /* Gallery Three pop up
                -----------------------------------------*/
                $('.gallery-three').magnificPopup({
                    delegate: 'a',
                    type: 'image',
                    gallery:{enabled:true}                
                });

                /* Collapse menu after click 
                -----------------------------------------*/
                $('#tmNavbar a').click(function(){
                    $('#tmNavbar').collapse('hide');

                    adjustHeightOfPage($(this).data("no")); // Adjust page height       
                });

                /* Browser resized 
                -----------------------------------------*/
                $( window ).resize(function() {
                    var currentPageNo = $(".cd-hero-slider li.selected .js-tm-page-content").data("page-no");
                    
                    // wait 3 seconds
                    setTimeout(function() {
                        adjustHeightOfPage( currentPageNo );
                    }, 1000);
                    
                });
        
                // Remove preloader (https://ihatetomatoes.net/create-custom-preloading-screen/)
                $('body').addClass('loaded');
            });

            /*
            $(function () {
    			var currYear = (new Date()).getFullYear();	
    			var opt={};
    			opt.date = {preset : 'date'};
    			//opt.datetime = { preset : 'datetime', minDate: new Date(2012,3,10,9,22), maxDate: new Date(2014,7,30,15,44), stepMinute: 5  };
    			opt.datetime = {preset : 'datetime'};
    			opt.time = {preset : 'time'};
    			opt.default = {
    				theme: 'android-ics light', //皮肤样式
    		        display: 'modal', //显示方式 
    		        mode: 'scroller', //日期选择模式
    				lang:'zh',
    		        startYear:currYear, //开始年份
    		        endYear:currYear + 10 //结束年份
    			};

    		  	var optDateTime = $.extend(opt['datetime'], opt['default']);
    		    $("#pointDatetime").mobiscroll(optDateTime).datetime(optDateTime);
    			
    			//下面注释部分是上面的参数可以替换改变它的样式
    			//希望一起研究插件的朋友加我个人QQ也可以，本人也建个群 291464597 欢迎进群交流。哈哈。这个不能算广告。
    			// 直接写参数方法
    			//$("#scroller").mobiscroll(opt).date(); 
    			// Shorthand for: $("#scroller").mobiscroll({ preset: 'date' });
    			//具体参数定义如下
    		    //{
    		    //preset: 'date', //日期类型--datatime --time,
    		    //theme: 'ios', //皮肤其他参数【android-ics light】【android-ics】【ios】【jqm】【sense-ui】【sense-ui】【sense-ui】
    										//【wp light】【wp】
    		    //mode: "scroller",//操作方式【scroller】【clickpick】【mixed】
    		    //display: 'bubble', //显示方【modal】【inline】【bubble】【top】【bottom】
    		    //dateFormat: 'yyyy-mm-dd', // 日期格式
    		    //setText: '确定', //确认按钮名称
    		    //cancelText: '清空',//取消按钮名籍我
    		    //dateOrder: 'yymmdd', //面板中日期排列格
    		    //dayText: '日', 
    		    //monthText: '月',
    		    //yearText: '年', //面板中年月日文字
    		    //startYear: (new Date()).getFullYear(), //开始年份
    		    //endYear: (new Date()).getFullYear() + 9, //结束年份
    		    //showNow: true,
    		    //nowText: "明天",  //
    		    //showOnFocus: false,
    		    //height: 45,
    		    //width: 90,
    		    //rows: 3}

            });  
*/

           $.ajaxSetup({  
                async : false  
             });   
            
            function loadCourse(){
            	 $.get("/psychology_train/reserve/loadCourse.do", function (data, textStatus){
            		//返回的 data 可以是 xmlDoc, jsonObj, html, text, 等等.
            		//this; // 在这里this指向的是Ajax请求的选项配置信息，请参考下图
            		var obj = eval('(' + data + ')');
            		var innerHtmlStr = "<div class=\"tm-img-gallery-info-container\"><h2 class=\"tm-text-title tm-gallery-title\"><span class=\"tm-white\">精品课程</span></h2><p class=\"tm-text\"><span class=\"tm-white\">真诚为您奉上以下课程，期待您的到来！</span></p></div>";
            		var p = 0;
            		for(var u in obj){  
            		    //innerHtmlStr = innerHtmlStr +"<tr><td>"+obj[u].courseName+"</td>&nbsp;&nbsp;<td>"+obj[u].startDatetime+"至"+obj[u].endDatetime+"</td>&nbsp;&nbsp;<td>"+obj[u].nowCount+"/"+obj[u].maxCount+"</td></tr>";
            			p++;
            		    innerHtmlStr = innerHtmlStr
            			 +"<div class=\"grid-item divOnClick\" id=\""+obj[u].courseId+"_"+obj[u].courseName+"\">"
            			 +"<figure class=\"effect-ruby\">"
            			 +" <img src=\"/psychology_train/demo2/img/tm-img-0"+p+"-tn.jpg\" alt=\"Image\" class=\"img-fluid tm-img\">"
            			 +"   <figcaption>"
            			 +"       <h2 class=\"tm-figure-title\"><span>"+obj[u].courseName+"</span></h2>"
            			 +"       <p class=\"tm-figure-description\">"+obj[u].startDatetime+"至"+obj[u].endDatetime+"      座位数"+obj[u].maxCount+"     已预约"+obj[u].nowCount+"    "+obj[u].courseMessage+"</p>"
            			// +"       <a href=\"/psychology_train/reserve/index.do\">预约</a>"
            			 +"   </figcaption> "          
            			 +"</figure>"
            			 +"</div>";
            		}  
            		$("#courses").html(innerHtmlStr);
            	});
            	 $(".divOnClick").on("click",function(){
            		 var courseId = this.id.substring(0,this.id.indexOf("_"));
            		 var courseName = this.id.substring(this.id.indexOf("_")+1);
            		 var str = "<div class=\"tm-contact-page\">"
            			 +"<div class=\"row\">"
            			 +"<div class=\"col-xs-12\">"
            			 +"	<div class=\"tm-flex tm-contact-container\">"
            			 +"		<div class=\"tm-bg-white-translucent text-xs-left tm-textbox tm-2-col-textbox-2 tm-textbox-padding tm-textbox-padding-contact\">"
            			 +"			<h2 class=\"tm-contact-info\">预约课程</h2>"
            			 +"			<form id=\"reserve\" name=\"reserve\""
            			 +"				action=\"/psychology_train/reserve/insert.do\" method=\"post\" class=\"tm-contact-form\">"
            			 +"				<div class=\"form-group\">"
            			 +"					<input type=\"text\" id=\"reserveName\" name=\"reserveName\" class=\"form-control\" placeholder=\"姓名\" required />"
            			 +"				</div>"
            			 +"				<div class=\"form-group\">"
            			 +"					<input type=\"text\" class=\"form-control\" id=\"phone\" placeholder=\"电话\" name=\"phone\">"
            			 +"				</div>"
            			 +"				<div class=\"form-group\">"
            			 +"					<input type=\"text\" id=\"email\" name=\"email\" class=\"form-control\" placeholder=\"Email\" />"
            			 +"				</div>"
            			 +"				<div class=\"form-group\">"
            			 +"					<input type=\"text\" id=\"courseName\" value=\""+courseName+"\" name=\"courseName\" class=\"form-control\" readOnly placeholder=\"预约课程\" />"
            			 +"					<input type=\"hidden\" id=\"courseId\" value=\""+courseId+"\" name=\"courseId\"/>"
            			 +"				</div>"
            			 +"				<button type=\"submit\" class=\"pull-xs-right tm-submit-btn\">提交</button>"
            			 +"			</form>"
            			 +"		</div>"
            			 +"		<div class=\"tm-bg-white-translucent text-xs-left tm-textbox tm-2-col-textbox-2 tm-textbox-padding tm-textbox-padding-contact\">"
            			 +"			<h2 class=\"tm-contact-info\">中国科学院心理教育机构合作中心</h2>"
            			 +"		</div>"
            			 +"	</div>"
            			 +"</div>"
            			 +"</div>";
                     $("#courses").html(str);
                 });
            	 adjustHeightOfPage(4);
            }
            
            
            
        </script>            

</body>
</html>
