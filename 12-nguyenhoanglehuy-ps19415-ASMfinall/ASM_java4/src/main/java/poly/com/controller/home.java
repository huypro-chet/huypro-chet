package poly.com.controller;

import java.io.IOException;

import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.websocket.Session;
import poly.com.constant.SessionAtr;
import poly.com.entity.Sanpham;
import poly.com.service.impl.SanPhamServiceimpl;




@WebServlet(urlPatterns =  "/index")
public class home extends HttpServlet {
	private static final long serialVersionUID = 1L;

//	private SanPhamService sanphamService = new SanPhamServiceimpl(); 

    public home() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SanPhamServiceimpl testDAO = new SanPhamServiceimpl();
		List<Sanpham> sanphams = testDAO.findAll();
		request.setAttribute("sanphams", sanphams);
		HttpSession session = request.getSession();
		
		request.getRequestDispatcher("/view/khachhang/index.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
