package poly.com.controller;

import jakarta.servlet.ServletException;


import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import poly.com.constant.SessionAtr;
import poly.com.entity.Taikhoan;
import poly.com.service.TaiKhoanService;
import poly.com.service.emailService;
import poly.com.service.impl.TaiKhoanServiceimpl;
import poly.com.service.impl.emailServletimpl;
import poly.com.uil.jpaUI;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.swing.text.AbstractDocument.Content;

/**
 * Servlet implementation class User
 */
@WebServlet(urlPatterns = {"/Dangnhap", "/Dangky", "/logout"})
public class User extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private TaiKhoanService userservice = new TaiKhoanServiceimpl() ;  
	private emailService EmailService = new emailServletimpl();
   
  
    public User() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String path = request.getServletPath();
		switch (path) {
			case "/Dangnhap":
				doGetLogin(request, response);
				break;
			case "/Dangky":
				doGetRegister(request, response);;
				break;
			case "/logout":
				doGetlogout(session, request, response);;
				break;
		}
	}

	protected void doGetLogin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.getRequestDispatcher("/view/khachhang/Dangnhap.jsp").forward(request, response);
	}
	
	protected void doGetRegister(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.getRequestDispatcher("/view/khachhang/Dangky.jsp").forward(request, response);
	}
		
	protected void doGetlogout(HttpSession session, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			session.removeAttribute(SessionAtr.Curren_Taikhoan);
			session.invalidate();
			response.sendRedirect("index");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String path = request.getServletPath();
		switch (path) {
			case "/Dangnhap":
				doPostLogin(session, request, response);;
				break;
			case "/Dangky":
				doPostRegister(session, request, response);;
				break;
		}
	}
	
	protected void doPostLogin(HttpSession session, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		Taikhoan taikhoan = userservice.Login(username, password);
		
		if (taikhoan != null) {

			session.setAttribute(SessionAtr.Curren_Taikhoan, taikhoan);
			if(taikhoan.getVaitro()== Boolean.TRUE) {
//				admin
				response.sendRedirect("admin");
			} else {
//				user
				response.sendRedirect("index");
			}
			 
		}else {
			response.sendRedirect("Dangnhap");
		}
	}
	

	protected void doPostRegister(HttpSession session, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String username = request.getParameter("username");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		System.out.println(username + " - " + email + " - " + password);
		
		Taikhoan taikhoan = userservice.Create(username, password, email);
		if (taikhoan != null) {
			EmailService.SenMail(getServletContext(), taikhoan, "Welcome to us");
			System.out.println("toi day");
			session.setAttribute(SessionAtr.Curren_Taikhoan, taikhoan);
			response.sendRedirect("index");
		}else {
			response.sendRedirect("Dangky");
		}
	}

}
