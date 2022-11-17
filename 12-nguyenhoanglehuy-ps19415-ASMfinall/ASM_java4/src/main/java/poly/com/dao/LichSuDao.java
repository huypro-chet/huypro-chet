package poly.com.dao;

import java.util.List;

import poly.com.entity.Lichsu;

public interface LichSuDao {
	
	List<Lichsu> findByUser(String TAIKHOAN, Boolean trangthai);
	List<Lichsu> findByUserAndIsLiked(String TAIKHOAN, Boolean isliked, Boolean trangthai);
	Lichsu findByUserIdAndSanPhamId(String TAIKHOAN, String TENSP, Boolean trangthai);
	Lichsu Create(Lichsu entity);
	Lichsu Update(Lichsu entity);
	Lichsu Delete(Lichsu entity);
}
