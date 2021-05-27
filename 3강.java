<디렉티브 태그>
JSP 페이지를 어떻게 처리할 것인지를 설정하는 태그
JSP 페이지가 서블릿 프로그램에서 서블릿 클래스로 변환할 때 
JSP 페이지와 관련된 정보를 JSP컨테이너에 지시하는 메시지

page JSP 페이지에 대한 정보를 설정합니다.
include JSP 페이지의 특정 영역에 다른 문서를 포함합니다.
taglib JSP 페이지에서 사용할 태그 라이브러리를 설정합니다.

<page 디렉티브 태그>
현재 JSP 페이지에 대한 정보를 설정하는 태그
JSP 페이지의 어디에서든 선언할 수 있지만 일반적으로 JSP 페이지의 최상단에 선언하는 것을 권장
<language 속성>
JSP 페이지에서 사용할 프로그래밍 언어를 설정하는 데 사용
기본 값은 java
<contentType 속성>
현재 JSP 페이지의 콘텐츠 유형(MIME-type)을 설정하는 데 사용
콘텐츠 유형
text/html, text/xml, text/plain 등
기본 값은 text/html

HTML을 출력하는 JSP 페이지는 contentType을 사용할 필요가 없음

<pageEncoding 속성>
현재 JSP 페이지의 문자 인코딩 유형을 설정하는 데 사용
문자 인코딩 유형의 기본 값은 ISO-8859-1
<import 속성>
현재 JSP 페이지에서 사용할 자바 클래스를 설정하는 데 사용
둘 이상의 자바 클래스를 포함하는 경우 쉼표(,)로 구분하여 연속해서 여러 개의 자바 클래스를 설정
또는 여러 개의 자바 클래스를 각각 별도로 설정할 수도 있음

<html>
<head>
  <title>스크립트 태그</title>
</head>
<body>
	<%@ page import="java.util.Date" %>
	Today is <%= new Date()%>
</body>
</html>

// page 디렉티브 태그에 Date클래스를 이용하여 현재 날짜 출력하기. 결과: Today is Thu May 27 10:55:45 KST 2021 

<session 속성>
현재 JSP 페이지의 HTTP 세션 사용 여부를 설정하는 데 사용
기본 값 : 세션을 자동으로 사용하는 true
만약 session 속성 값을 false로 설정할 경우
 해당 JSP 페이지에서 내장 객체인 session 변수를 사용할 수 없다는 의미이므로  해당 페이지에 대해 세션을 유지 관리할 수 없음
<buffer 속성>
현재 JSP 페이지의 출력 버퍼 크기를 설정하는 데 사용
속성 값 : none과 ‘버퍼 크기’로 설정
버퍼 크기 : 출력 버퍼에 먼저 기록한 후 웹 브라우저로 보냄
<autoFlush 속성>
출력 버퍼 자동 비우기를 위한 true설정
<%@ page autoFlush="true" %>
<isThreadSafe 속성>
멀티스레드 처리를 위한 true 설정
<%@ page isThreadSafe="true" %>
<info 속성>
JSP 페이지 설명을 위한 설정
<%@ page info="Home Page JSP"%>
<errorPage 속성>
이동할 오류 페이지 MyErrorPage.jsp 설정
<%@ page errorPage = "MyErrorPage.jsp" %>
<isErrorPage 속성>
현재 JSP 페이지가 오류 페이지가 되도록 true 설정
<isELIgnored 속성>
표현 언어를 처리하지 않기 위한 true 설정
<isScriptingEnabled 속성>
스크립트 태그를 사용하지 않기 위한 false 설정

<include 디렉티브 태그>
현재 JSP 페이지의 특정 영역에 외부 파일의 내용을 포함하는 태그
현재 JSP 페이지에 포함할 수 있는 외부 파일
HTML, JSP, 텍스트 파일
include 디렉티브 태그는 JSP 페이지 어디에서든 선언 가능

<taglib 디렉티브 태그>
현재 JSP 페이지에 표현 언어, JSTL, 사용자 정의 태그(custom tag) 등 태그 라이브러리를 설정하는 태그

// Welcome.jsp
<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.util.Date"%>
<html>
<head>
<link rel="stylesheet"	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<title>Welcome</title>
</head>
<body>
	<%@ include file="menu.jsp"%>
	<%!String greeting = "웹 쇼핑몰에 오신 것을 환영합니다";
	String tagline = "Welcome to Web Market!";%>
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">
				<%=greeting%>
			</h1>
		</div>
	</div>	
	<div class="container">
		<div class="text-center">
			<h3>
				<%=tagline%>
			</h3>
			<%
				Date day = new java.util.Date();
				String am_pm;
				int hour = day.getHours();
				int minute = day.getMinutes();
				int second = day.getSeconds();
				if (hour / 12 == 0) {
					am_pm = "AM";
				} else {
					am_pm = "PM";
					hour = hour - 12;
				}
				String CT = hour + ":" + minute + ":" + second + " " + am_pm;
				out.println("현재 접속  시각: " + CT + "\n");
			%>
		</div>
		<hr>
	</div>	
	<%@ include file="footer.jsp"%>
</body>
</html>


// footer.jsp
<footer class="container">
	<p>&copy; WebMarket</p>
</footer>

// menu.jsp
<nav class="navbar navbar-expand  navbar-dark bg-dark">
	<div class="container">
		<div class="navbar-header">
			<a class="navbar-brand" href="./welcome.jsp">Home</a>
		</div>
	</div>
</nav>
