package poly.com.controller.admin;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import poly.com.constant.SessionAtr;
import poly.com.dto.sanphamlikedinfo;
import poly.com.entity.Taikhoan;
import poly.com.service.StartService;
import poly.com.service.impl.StartServiceimpl;

import java.io.IOException;
import java.util.List;

/**
 * Servlet implementation class homeadmin
 */
@WebServlet(urlPatterns = {"/admin","/admin1"})
public class homeadmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private StartService startService = new StartServiceimpl();
    
    public homeadmin() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Taikhoan CurrenTaikhoan = (Taikhoan) session.getAttribute(SessionAtr.Curren_Taikhoan);
		
		if(CurrenTaikhoan != null && CurrenTaikhoan.getVaitro() == Boolean.TRUE) {
			List<sanphamlikedinfo> sanphams = startService.findSanphamlikeinfo(); 
			request.setAttribute("sanphams", sanphams);
			request.getRequestDispatcher("/view/admin/Tab.jsp").forward(request, response);
		}else {
			response.sendRedirect("index");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
