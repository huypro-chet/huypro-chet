package poly.com.service.impl;

import jakarta.servlet.ServletContext;
import poly.com.entity.Taikhoan;
import poly.com.service.emailService;
import poly.com.uil.Senmailuil;

public class emailServletimpl implements emailService{
	
	private static final String EMAIL_WELCOME_SUBJCE = "Welcome to online";

	@Override
	public void SenMail(ServletContext context, Taikhoan recipion, String Stye) {
        String host = context.getInitParameter("host");
        String port = context.getInitParameter("port");
        String user = context.getInitParameter("user");
        String pass = context.getInitParameter("pass");
		
        try {
				String content = null;
				String subjce = null;
				switch (Stye) {
					case "welcome":
						subjce = EMAIL_WELCOME_SUBJCE;
						content = "Xin Chào" + recipion.getTaikhoan() + ", đã tham gia vào Club";
						break;
					default:
						subjce = "Online Entertament";
						content = "Maybe this email is wrong";
				}
				
				Senmailuil.sendEmail(host, port, user, pass,recipion.getEmail(), subjce, content);
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}
		
}
