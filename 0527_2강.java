
//JAVA + HTML = JSP 실제 디자이너들이 자바와 관련된 언어에 대한 지식이 부족하기때문에 따로 구현을 한다.

// #스크립트 태그
// <% ... %> 사용
// JSP 페이지가 서블릿 프로그램에서 서블릿 클래스로 변환할 때 
// JSP 컨테이너가 자바 코드가 삽입되어 있는 스크립트 태그를 처리하고 나머지는 HTML 코드나 일반 텍스트로 간주


<html>
<head>
  <title>스크립트 태그</title>
</head>
<body>
  <h2>스크립트 태그</h2>
  <%! 
  int count = 3;
  String makeItLower(String date) {
    return data.toLowerCase();
  } %>
  //선언문 태그를 사용하여 자바변수와 메소드 정의
  
  <%
    for (int i = 1; i <= count; i++) {
        out.println("Java Server Pages " + i + ".<br>");
     }
   %>
  // 스크립틀릿 태그로 자바 로직 코드 작성
  
   <%=makeItLower("Hello World")%>
  </body>
</html>

// 선언문 태그
// 변수나 메소드를 선언 변수: 전역변수로 사용, 메소드: 전역 메소드로 사용

<html>
<head>
  <title>스크립트 태그</title>
</head>
<body>
	<%! int data = 50; %>
  	<%
        out.println("Value of the variable is:" + data);
   %>
  </body>
</html>

// 선언문 태그 사용 Value of the variable is:(data값) 출력

<html>
<head>
  <title>스크립트 태그</title>
</head>
<body>
	<%! int sum(int a, int b){
		return a + b;
	} %>
  	<%
        out.println("2 + 3 = " + sum(2,3));
   %>
  </body>
</html>

// 결과 2 + 3 = 5 출력

// 스크립틀릿 태그
/// 자바 코드로 이루어진 로직 부분을 표현
// out 객체를 사용하지 않고도 쉽게 HTML 응답을 만들어냄 

<html>
<head>
  <title>스크립트 태그</title>
</head>
<body>
	<%
		for (int i = 0; i <= 10; i++){
			if(i % 2 == 0)
				out.println(i + "<br>");
		} 
	
	%>
  </body>
</html>

// 결과: 0 2 4 6 8 10 0에서 10까지의 짝수출력

<html>
<head>
  <title>스크립트 태그</title>
</head>
<body>
	<%
		int a = 10;
		int b = 20;
		int c = 30;
	%>
	<%= a + b + c %>
  </body>
</html>

// 결과 60




