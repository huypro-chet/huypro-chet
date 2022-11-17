package poly.com.service;

import java.util.List;

import poly.com.entity.Lichsu;
import poly.com.entity.Sanpham;
import poly.com.entity.Taikhoan;

public interface LichsuService {
	List<Lichsu> findByUser(String TAIKHOAN, Boolean trangthai);
	List<Lichsu> findByUserAndIsLiked(String TAIKHOAN, Boolean isliked, Boolean trangthai);
	Lichsu findByUserIdAndSanPhamId(String TAIKHOAN, String TENSP, Boolean trangthai); 
	Lichsu Create(Taikhoan taikhoan, Sanpham sanpham);
	boolean Updatelikeorunlike(Taikhoan taikhoan, String SanphamCodelink);

}
