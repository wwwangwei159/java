
 <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Open+Sans:300,400">  
 <!-- Google web font "Open Sans" -->
 <link rel="stylesheet" href="${webRoot}/demo2/font-awesome-4.5.0/css/font-awesome.min.css">                
 <!-- Font Awesome -->
 <link rel="stylesheet" href="${webRoot}/demo2/css/bootstrap.min.css">                                      
 <!-- Bootstrap style -->
 <link rel="stylesheet" href="${webRoot}/demo2/css/hero-slider-style.css">                              
 <!-- Hero slider style (https://codyhouse.co/gem/hero-slider/) -->
 <link rel="stylesheet" href="${webRoot}/demo2/css/magnific-popup.css">                                 
 <!-- Magnific popup style (http://dimsemenov.com/plugins/magnific-popup/) -->
 <link rel="stylesheet" href="${webRoot}/demo2/css/templatemo-style.css">                                   
 <!-- Templatemo style -->


<!-- load JS files -->
<script src="${webRoot}/demo2/js/jquery-1.11.3.min.js"></script>         <!-- jQuery (https://jquery.com/download/) -->
<script src="${webRoot}/demo2/js/tether.min.js"></script> <!-- Tether for Bootstrap (http://stackoverflow.com/questions/34567939/how-to-fix-the-error-error-bootstrap-tooltips-require-tether-http-github-h) --> 
<script src="${webRoot}/demo2/js/bootstrap.min.js"></script>             <!-- Bootstrap js (v4-alpha.getbootstrap.com/) -->
<script src="${webRoot}/demo2/js/hero-slider-main.js"></script>          <!-- Hero slider (https://codyhouse.co/gem/hero-slider/) -->
<script src="${webRoot}/demo2/js/jquery.magnific-popup.min.js"></script> <!-- Magnific popup (http://dimsemenov.com/plugins/magnific-popup/) -->

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
