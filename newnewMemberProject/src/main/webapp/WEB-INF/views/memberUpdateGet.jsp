<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!-- <!DOCTYPE html> -->
<!-- <html> -->
<!-- <head> -->
<!-- <meta charset="UTF-8"> -->
<!-- <title>회원정보수정</title> -->
<!-- </head> -->
<!-- <body> -->
<!-- <form action="update" method="post"> -->
<%-- 번호 : <input type="text" name="mno" value="${member.mno}"readonly><br> --%>
<%-- 이름 : <input type="text" name="mname" value="${member.mname}"><br> --%>
<%-- 이메일 : <input type="text" name="email" value="${member.email}"><br> --%>
<%-- 패스워드 : <input type="password" name="pwd" value="${member.pwd}"><br> --%>
<!-- <input type="submit" value="수정"> -->
<!-- <input type="reset" value="초기화"> -->
<!-- <input type="button" onclick="location.href='list'" value="리스트"> -->
<!-- </form> -->
<!-- </body> -->
<!-- </html> -->

<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="favicon.ico">
    <title>회원정보수정</title>
    <!-- Simple bar CSS -->
    <link rel="stylesheet" href="/resources/css/simplebar.css">
    <!-- Fonts CSS -->
    <link href="https://fonts.googleapis.com/css2?family=Overpass:ital,wght@0,100;0,200;0,300;0,400;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,600;1,700;1,800;1,900&display=swap" rel="stylesheet">
    <!-- Icons CSS -->
    <link rel="stylesheet" href="/resources/css/feather.css">
    <!-- Date Range Picker CSS -->
    <link rel="stylesheet" href="/resources/css/daterangepicker.css">
    <!-- App CSS -->
    <link rel="stylesheet" href="/resources/css/app-light.css" id="lightTheme">
    <link rel="stylesheet" href="/resources/css/app-dark.css" id="darkTheme" disabled>
  </head>
  <body class="light ">
    <div class="wrapper vh-100">
      <div class="row align-items-center h-100">
        <form class="col-lg-6 col-md-8 col-10 mx-auto" action="update" method="post">
          <div class="mx-auto text-center my-4">
            <a class="navbar-brand mx-auto mt-2 flex-fill text-center" href="./index.html">
              <svg version="1.1" id="logo" class="navbar-brand-img brand-md" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" x="0px" y="0px" viewBox="0 0 120 120" xml:space="preserve">
                <g>
                  <polygon class="st0" points="78,105 15,105 24,87 87,87 	" />
                  <polygon class="st0" points="96,69 33,69 42,51 105,51 	" />
                  <polygon class="st0" points="78,33 15,33 24,15 87,15 	" />
                </g>
              </svg>
            </a>
            <h2 class="my-3">회원정보수정</h2>
          </div>
<!--           <div class="form-group"> -->
<!--             <label for="inputEmail4">Email</label> -->
<!--             <input type="email" class="form-control" id="inputEmail4"> -->
<!--           </div> -->
          <div class="form-row">
            <div class="form-group col-md-6">
              <label for="firstname">NO</label>
              <input type="text" name="mno" value="${member.mno}"readonly id="firstname" class="form-control">
            </div>
            <div class="form-group col-md-6">
              <label for="lastname">NAME</label>
              <input type="text" name="mname" value="${member.mname}" id="lastname" class="form-control">
            </div>
            <div class="form-group col-md-6">
              <label for="firstname">EMAIL</label>
              <input type="text" name="email" value="${member.email}" id="firstname" class="form-control">
            </div>
            <div class="form-group col-md-6">
              <label for="lastname">PASSWORD</label>
              <input type="password" name="pwd" value="${member.pwd}" id="lastname" class="form-control">
            </div>
          </div>
          <hr class="my-4">
          <button class="btn btn-lg btn-primary btn-block" type="submit">수정</button>
          <button class="btn btn-lg btn-primary btn-block" type="reset">Reset</button>
          <button class="btn btn-lg btn-primary btn-block" type="button" onclick="location.href='list'">리스트로돌아가기</button>
          <p class="mt-5 mb-3 text-muted text-center">20200909</p>
        </form>
      </div>
    </div>
    <script src="/resources/js/jquery.min.js"></script>
    <script src="/resources/js/popper.min.js"></script>
    <script src="/resources/js/moment.min.js"></script>
    <script src="/resources/js/bootstrap.min.js"></script>
    <script src="/resources/js/simplebar.min.js"></script>
    <script src='/resources/js/daterangepicker.js'></script>
    <script src='/resources/js/jquery.stickOnScroll.js'></script>
    <script src="/resources/js/tinycolor-min.js"></script>
    <script src="/resources/js/config.js"></script>
    <script src="/resources/js/apps.js"></script>
    <!-- Global site tag (gtag.js) - Google Analytics -->
    <script async src="https://www.googletagmanager.com/gtag/js?id=UA-56159088-1"></script>
    <script>
      window.dataLayer = window.dataLayer || [];

      function gtag()
      {
        dataLayer.push(arguments);
      }
      gtag('js', new Date());
      gtag('config', 'UA-56159088-1');
    </script>
  </body>
</html>
</body>
</html>