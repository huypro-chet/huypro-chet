package poly.com.service;

import jakarta.servlet.ServletContext;
import poly.com.entity.Taikhoan;

public interface emailService {
	void SenMail(ServletContext context, Taikhoan recipion, String Stye);
}
