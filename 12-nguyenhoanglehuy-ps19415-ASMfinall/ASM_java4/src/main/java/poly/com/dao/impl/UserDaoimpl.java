package poly.com.dao.impl;

import java.util.List;


import poly.com.dao.UserDao;
import poly.com.dao.attrackDao;
import poly.com.entity.Taikhoan;


public class UserDaoimpl extends attrackDao<Taikhoan> implements UserDao {

	@Override
	public Taikhoan findById(Integer id) {
		return super.findById(Taikhoan.class, id);
	}

	@Override
	public Taikhoan findByEmail(String EMAIL) {
		String sql = "SELECT o FROM Taikhoan o WHERE o.email = ?0";
		return super.findOne(Taikhoan.class, sql, EMAIL);
	}

	@Override
	public Taikhoan findByTaikhoan(String TAIKHOAN) {
		String sql = "SELECT o FROM Taikhoan o WHERE o.taikhoan = ?0";
		return super.findOne(Taikhoan.class, sql, TAIKHOAN);
	}


	@Override
	public Taikhoan findByTaikhoanandMatkhau(String TAIKHOAN, String MATKHAU) {
		String sql = "SELECT o FROM Taikhoan o WHERE o.taikhoan = ?0 AND o.matkhau = ?1";
		return super.findOne(Taikhoan.class, sql, TAIKHOAN, MATKHAU);
	}

	@Override
	public List<Taikhoan> findAll() {
		return super.findAll(Taikhoan.class, true);
	}

	@Override
	public List<Taikhoan> findAll(int pageNumber, int pageSize) {
		return super.findAll(Taikhoan.class, true, pageNumber, pageSize);
	}
	
//	public User Create(User entity){
//		return super.Create(entity);
//	}
//	
//	public User Update(User entity){
//		return super.Update(entity);
//	}
//	
//	public User Delete(User entity){
//		return super.Delete(entity);
//	}

}
