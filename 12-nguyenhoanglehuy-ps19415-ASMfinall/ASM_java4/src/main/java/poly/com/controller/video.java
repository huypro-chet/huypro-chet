package poly.com.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import poly.com.constant.SessionAtr;
import poly.com.entity.Lichsu;
import poly.com.entity.Sanpham;
import poly.com.entity.Taikhoan;
import poly.com.service.LichsuService;
import poly.com.service.SanPhamService;
import poly.com.service.impl.LichsuServiceimpl;
import poly.com.service.impl.SanPhamServiceimpl;

import java.io.IOException;

@WebServlet(urlPatterns = "/videoct")
public class video extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private SanPhamService sanphamService = new SanPhamServiceimpl();
	private LichsuService lichsuService = new LichsuServiceimpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public video() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String actionParam = request.getParameter("action"); 
		String Codelink = request.getParameter("id");
		HttpSession session = request.getSession();
		
		switch (actionParam) {
			case "Watch": 
				doGetWatch(session, Codelink, request, response);
			case "like": 
				doGetlike(session, Codelink, request, response);
			}
		
	}
	private void doGetWatch(HttpSession session,String Codelink ,HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Sanpham sanpham = sanphamService.findByCODELINK(Codelink);
		request.setAttribute("sanpham", sanpham);
		
		Taikhoan CurrenTaikhoan = (Taikhoan) session.getAttribute(SessionAtr.Curren_Taikhoan);
		
		if(CurrenTaikhoan != null) {
			Lichsu lichsu = lichsuService.Create(CurrenTaikhoan, sanpham); 
			request.setAttribute("flaglikebtn", lichsu.getIsliked());
		}
		
		request.getRequestDispatcher("/view/khachhang/videoct.jsp").forward(request, response);
	}
	
	private void doGetlike(HttpSession session,String Codelink ,HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json");
		Taikhoan CurrenTaikhoan = (Taikhoan) session.getAttribute(SessionAtr.Curren_Taikhoan);
		boolean result = lichsuService.Updatelikeorunlike(CurrenTaikhoan, Codelink);
		if(result == true) {
			response.setStatus(204);
		}else {
			response.setStatus(400);
		}
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
