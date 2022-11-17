package poly.com.service.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import poly.com.dao.SanPhamDao;
import poly.com.dao.impl.SanPhamDaoimpl;
import poly.com.entity.Sanpham;
import poly.com.service.SanPhamService;
import poly.com.uil.jpaUI;

public class SanPhamServiceimpl implements SanPhamService {
	
	private SanPhamDao dao;
	
	public SanPhamServiceimpl () {
		dao = new SanPhamDaoimpl();
	}

	@Override
	public Sanpham findById(Integer id) {
		return dao.findById(id);
	}

	@Override
	public Sanpham findByCODELINK(String CODELINK) {
		return dao.findByCODELINK(CODELINK);
	}

	@Override
	public List<Sanpham> findAll() {
		try {
			EntityManager em = jpaUI.getEntityManager();
			TypedQuery<Sanpham> query = em.createNamedQuery("Sanpham.findAll", Sanpham.class);

			return query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public List<Sanpham> findAll(int pageNumber, int pageSize) {
		return dao.findAll(pageNumber, pageSize);
	}

	@Override
	public Sanpham Create(Sanpham entity) {
		entity.setTrangthai(Boolean.TRUE);
		entity.setLuottuongtac(0);
		entity.setLuotxem(0);
		return dao.Create(entity);
	}

	@Override
	public Sanpham Update(Sanpham entity) {
		return dao.Update(entity);
	}

	@Override
	public Sanpham Delete(String CODELINK) {
		Sanpham entity = findByCODELINK(CODELINK);
		entity.setTrangthai(Boolean.FALSE);
		return dao.Update(entity);
	}

}
