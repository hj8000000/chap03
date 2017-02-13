package com.example.sevlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/requestinfo")
public class RequestInfo extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html; charset=UTF-8");
		PrintWriter out = resp.getWriter();
		
		out.println("<!doctype html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>클라이언트 및 서버정보</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>클라이언트IP = " + req.getRemoteAddr() + "</p>");
		out.println("<p>요청정보길이 = " + req.getContentLength() + "</p>");
		out.println("<p>요청정보 인코딩 = " + req.getCharacterEncoding() + "</p>");
		out.println("<p>요청정보 컨텐츠타입 = " + req.getContentType() + "</p>");
		out.println("<p>요청정보 프로토콜 = " + req.getProtocol() + "</p>");
		out.println("<p>요청정보 전송방식 = " + req.getMethod() + "</p>");
		out.println("<p>요청 URL = " + req.getRequestURI() + "</p>");
		out.println("<p>컨텍스트 경로 = " + req.getContextPath() + "</p>");
		out.println("<p>서버이름 = " + req.getServerName() + "</p>");
		out.println("<p>서버포트 = " + req.getServerPort() + "</p>");
		out.println("</body>");
		out.println("</html>");
	
	}
	
}
