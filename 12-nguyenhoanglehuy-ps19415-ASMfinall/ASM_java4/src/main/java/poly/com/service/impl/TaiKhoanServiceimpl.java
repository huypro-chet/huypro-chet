package poly.com.service.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import poly.com.dao.UserDao;
import poly.com.dao.impl.UserDaoimpl;
import poly.com.entity.Taikhoan;
import poly.com.service.TaiKhoanService;
import poly.com.uil.jpaUI;

public class TaiKhoanServiceimpl implements TaiKhoanService {
	
	private UserDao dao;
	
	public TaiKhoanServiceimpl () {
		dao = new UserDaoimpl();
	}

	@Override
	public Taikhoan findById(Integer id) {	
		return dao.findById(id);
	}

	@Override
	public Taikhoan findByEmail(String EMAIL) {	
		return dao.findByEmail(EMAIL);
	}

	@Override
	public Taikhoan findByTaikhoan(String TAIKHOAN) {
		return dao.findByTaikhoan(TAIKHOAN);
	}

	@Override
	public Taikhoan Login(String TAIKHOAN, String MATKHAU) {
		return dao.findByTaikhoanandMatkhau(TAIKHOAN, MATKHAU);
	}

	@Override
	public Taikhoan ResetPass(String EMAIL) {	
		return null;
	}

	@Override
	public List<Taikhoan> findAll() {
		try {
			EntityManager em = jpaUI.getEntityManager();
			TypedQuery<Taikhoan> query = em.createNamedQuery("Taikhoan.findAll", Taikhoan.class);

			return query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public List<Taikhoan> findAll(int pageNumber, int pageSize) {
	
		return dao.findAll(pageNumber, pageSize);
	}

	@Override
	public Taikhoan Create(String TAIKHOAN, String MATKHAU, String EMAIL) {
		Taikhoan newUser = new Taikhoan();
		newUser.setTaikhoan(TAIKHOAN);
		newUser.setMatkhau(MATKHAU);
		newUser.setEmail(EMAIL);
		newUser.setVaitro(Boolean.FALSE);
		newUser.setTrangthai(Boolean.TRUE);
		newUser.setDaxoa(Boolean.TRUE);
		return dao.Create(newUser);
	}

	@Override
	public Taikhoan Update(Taikhoan entity) {
		return dao.Update(entity);
	}

	@Override
	public Taikhoan Delete(String TAIKHOAN) {
		Taikhoan User = dao.findByTaikhoan(TAIKHOAN);
		User.setTrangthai(Boolean.FALSE);
		return dao.Update(User);
	}

}
