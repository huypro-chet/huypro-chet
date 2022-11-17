package poly.com.dao.impl;

import java.util.List;


import poly.com.dao.LichSuDao;
import poly.com.dao.attrackDao;

import poly.com.entity.Lichsu;

public class LichSuDaoimpl extends attrackDao<Lichsu> implements LichSuDao{

	@Override
	public List<Lichsu> findByUser(String TAIKHOAN, Boolean trangthai) {
		String sql = "SELECT o FROM Lichsu o WHERE o.taikhoan.taikhoan = ?0 AND o.sanpham.trangthai = ?1"
				+ " ORDER BY o.viewdate DESC";
		return super.findMany(Lichsu.class, sql, TAIKHOAN, trangthai);
	}

	@Override
	public List<Lichsu> findByUserAndIsLiked(String TAIKHOAN, Boolean isliked, Boolean trangthai) { 
		String sql = "SELECT o FROM Lichsu o WHERE o.Taikhoan.taikhoan = ?0 AND o.isliked = ?1"
				+ " o.sanpham.trangthai = ?2"
				+ " ORDER BY o.viewdate DESC";
		return super.findMany(Lichsu.class, sql, TAIKHOAN, isliked, trangthai);
	}

	@Override
	public Lichsu findByUserIdAndSanPhamId(String TAIKHOAN, String TENSP, Boolean trangthai) {
		String sql = "SELECT o FROM Lichsu o WHERE o.taikhoan.taikhoan = ?0 AND o.sanpham.tensp = ?1"
				+ " AND o.sanpham.trangthai = ?2";
		return super.findOne(Lichsu.class, sql, TAIKHOAN, TENSP, trangthai);
	}

}
