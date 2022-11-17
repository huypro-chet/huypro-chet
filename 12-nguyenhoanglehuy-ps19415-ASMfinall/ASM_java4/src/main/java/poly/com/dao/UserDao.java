package poly.com.dao;

import java.util.List;

import poly.com.entity.Taikhoan;

public interface UserDao {
	Taikhoan findById(Integer id);
	Taikhoan findByEmail(String EMAIL);
	Taikhoan findByTaikhoan(String TAIKHOAN);
	Taikhoan findByTaikhoanandMatkhau(String TAIKHOAN, String MATKHAU);
	List<Taikhoan> findAll();
	List<Taikhoan> findAll(int pageNumber, int pageSize);
	Taikhoan Create(Taikhoan entity);
	Taikhoan Update(Taikhoan entity);
	Taikhoan Delete(Taikhoan entity);
}
