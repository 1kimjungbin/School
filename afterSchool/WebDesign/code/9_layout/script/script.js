$(function () {
    $(".layerPopup").click(function() {
        $(".layer").css("display", "block");
        $(".layer_bg").show();
    });
    $(".layer .close").click(function() {
        $(".layer").css("display", "none");
        $(".layer_bg").hide();
    });
});