//問題1
// $(function () {
//   console.log("豊田大樹");
// });


//問題2
// $(function () {
//   $(".btn").on("click", function () {
//     $(".name").css("color", "red");
//   });
// });


//問題3
// $(function () {
//   $("#btn").on("click", function () {
//     alert($("#age").val());
//   });
// });


//問題4
// $(function(){
//   $("#btn").on("click", function () {
//     $(this).prop("disabled", true);
//   });
// });


//問題5
$(function() {
  $("#lang").on("change", function(){
    $("#Java, #JavaScript").hide();
    if ($(this).val() == "Java") {
      $("Java").show();
    } else if ($(this).val() == "JavaScript") {
      $("JavaScript").show();
    }
  });
});
