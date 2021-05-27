4강. 액션태그

액션 태그
서버나 클라이언트에게 어떤 행동을 하도록 명령하는 태그
JSP 페이지에서 페이지와 페이지 사이 제어 
다른 페이지의 실행 결과 내용을 현재 페이지에 포함 
자바 빈즈(JavaBeans) 등의 다양한 기능 제공
XML 형식 <jsp: … /> 사용

forward 액션 태그
현재 JSP 페이지에서 다른 페이지로 이동하는 태그
JSP 컨테이너는 현재 JSP 페이지에서 forward 액션 태그를 만나면 
그 전까지 출력 버퍼에 저장되어 있던 내용을 모두 삭제하고
forward 액션 태그에 설정된 페이지로 프로그램의 제어가 이동

page 속성 값
현재 JSP 페이지에서 이동할 페이지의 외부 파일명
외부 파일은 현재 JSP 페이지와 같은 디렉터리에 있으면 파일명만 설정하고, 그렇지 않으면 전체 URL(또는 상대 경로)을 설정해야 함

// first.jps
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Action Taga</title>
</head>
<body>
	<h3>이 파일은 first.jsp입니다.</h3>
	<jsp:forward page="second.jsp"/>
	
	<p>===first.jsp의 페이지===
</body>
</html>

// second.jsp
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Action Tag</title>
</head>
<body>
	<h3>이 파일은 second.jsp입니다.</h3>
	Today is : <%=new java.util.Date()%>
</body>
</html>

include 액션 태그
include 디렉티브 태그처럼 현재 JSP 페이지의 특정 영역에 외부 파일의 내용을 포함하는 태그
현재 JSP 페이지에 포함할 수 있는 외부 파일은 HTML, JSP, 서블릿 페이지 등

page 속성 값
현재 JSP 페이지 내에 포함할 내용을 가진 외부 파일명
외부 파일은 현재 JSP 페이지와 같은 디렉터리에 있으면 파일명만 설정하고, 그렇지 않으면 전체 URL(또는 상대 경로)을 설정해야 함 
flush 속성 값
설정한 외부 파일로 제어가 이동할 때 현재 JSP 페이지가 지금까지 출력 버퍼에 저장한 결과를 처리, 기본 값은 false
true 로 설정하면 외부 파일로 제어가 이동할 때 현재 JSP 페이지가 지금까지 출력 버퍼에 저장된 내용을 웹 브라우저에 출력하고 출력 버퍼를 비움

param 액션 태그
현재 JSP 페이지에서 다른 페이지에 정보를 전달하는 태그
이 태그는 단독으로 사용되지 못하며 <jsp:forward>나 <jsp:include> 태그의 내부에 사용
다른 페이지에 여러 개의 정보를 전송해야 할 때는 다중의 param 액션 태그 사용
