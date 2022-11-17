package poly.com.service;

import java.util.List;

import poly.com.entity.Sanpham;

public interface SanPhamService {
	Sanpham findById(Integer id);
	Sanpham findByCODELINK(String CODELINK);
	List<Sanpham> findAll();
	List<Sanpham> findAll(int pageNumber, int pageSize);
	Sanpham Create(Sanpham entity);
	Sanpham Update(Sanpham entity);
	Sanpham Delete(String CODELINK);
}
