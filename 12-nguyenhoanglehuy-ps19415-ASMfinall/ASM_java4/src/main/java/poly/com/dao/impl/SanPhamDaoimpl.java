package poly.com.dao.impl;

import java.util.List;


import poly.com.dao.SanPhamDao;
import poly.com.dao.attrackDao;

import poly.com.entity.Sanpham;

public class SanPhamDaoimpl extends attrackDao<Sanpham> implements SanPhamDao {

	@Override
	public Sanpham findById(Integer id) {
		return super.findById(Sanpham.class, id);
	}

	@Override
	public Sanpham findByCODELINK(String CODELINK) {
		String sql = "SELECT o FROM Sanpham o WHERE o.codelink = ?0";
		return super.findOne(Sanpham.class, sql, CODELINK);
	}

	@Override
	public List<Sanpham> findAll() {
		return super.findAll(Sanpham.class, true);
	}

	@Override
	public List<Sanpham> findAll(int pageNumber, int pageSize) {
		return super.findAll(Sanpham.class, true, pageNumber, pageSize);
	}

}
