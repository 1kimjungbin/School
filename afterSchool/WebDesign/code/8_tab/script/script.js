$(function () {

    let tabBtn = $(".tab_btn>ul>li");
    let tabCont = $(".tab_cont>div");

    tabCont.hide().eq(0).show();
    //eq : 선택한 요소의 인덱스 번호에 해당하는 요소를 찾음

    tabBtn.click(function(e) {
        e.preventDefault();
        // a 태그나 submit 태그는 누르게 되면 href를 통해 이동하거나,
        // 창이 새로고침하여 실행된다.
        // preventDefault를 통해 이러한 동작을 막아줄 수 있다.

        let target = $(this);
        let index = target.index();
    
        tabBtn.removeClass("active");
        target.addClass("active");
        tabCont.css("display", "none");
        tabCont.eq(index.css("display","block"));
    });


});