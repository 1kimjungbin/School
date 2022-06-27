$(function(){
    $(".nav>ul>li").mouseover(function(){
        $(".submenu").stop().slideDown(200);
    });

    $(".nav>ul>li").mouseleave(function() {
        $(".submenu").stop().slideUp(200);
    });

    //side
    let currentIndex = 0;

    setInterval(function() {
        if(currentIndex<2) {
            currentIndex++;
        } else {
            currentIndex = 0;
        }

        let slidePosition = currentIndex * (-300) + "px";
        $(".slideList").animate({top:slidePosition}, 400);
    }, 3000);
});