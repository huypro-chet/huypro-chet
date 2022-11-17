package poly.com.service;

import java.util.List;

import poly.com.entity.Taikhoan;

public interface TaiKhoanService {
	Taikhoan findById(Integer id);
	Taikhoan findByEmail(String EMAIL);
	Taikhoan findByTaikhoan(String TAIKHOAN);
	Taikhoan Login(String TAIKHOAN, String MATKHAU);
	Taikhoan ResetPass(String EMAIL);
	List<Taikhoan> findAll();
	List<Taikhoan> findAll(int pageNumber, int pageSize);
	Taikhoan Create(String TAIKHOAN, String MATKHAU, String EMAIL);
	Taikhoan Update(Taikhoan entity);
	Taikhoan Delete(String TAIKHOAN);
}
