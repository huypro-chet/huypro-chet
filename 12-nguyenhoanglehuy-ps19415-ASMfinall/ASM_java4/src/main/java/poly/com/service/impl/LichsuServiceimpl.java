package poly.com.service.impl;

import java.sql.Date;
import java.util.List;

import poly.com.dao.LichSuDao;
import poly.com.dao.impl.LichSuDaoimpl;
import poly.com.entity.Lichsu;
import poly.com.entity.Sanpham;
import poly.com.entity.Taikhoan;
import poly.com.service.LichsuService;
import poly.com.service.SanPhamService;

public class LichsuServiceimpl implements LichsuService {
	
	private LichSuDao dao;
	private SanPhamService sanphamService = new SanPhamServiceimpl();
	
	public LichsuServiceimpl () {
		dao = new LichSuDaoimpl();
	}

	@Override
	public List<Lichsu> findByUser(String TAIKHOAN, Boolean trangthai) {
		return dao.findByUser(TAIKHOAN, trangthai);
	}

	@Override
	public Lichsu Create(Taikhoan taikhoan, Sanpham sanpham) {
		Lichsu lichsu = new Lichsu();
		lichsu.setTaikhoan(taikhoan);
		lichsu.setSanpham(sanpham);
		lichsu.setViewdate(new Date(System.currentTimeMillis()));
		lichsu.setLikedate(new Date(System.currentTimeMillis()));
		lichsu.setIsliked(Boolean.FALSE);
		return dao.Create(lichsu);
	}

	@Override
	public boolean Updatelikeorunlike(Taikhoan taikhoan, String SanphamCodelink) { 
		Sanpham sanpham = sanphamService.findByCODELINK(SanphamCodelink);
		Lichsu existLichsu = findByUserIdAndSanPhamId(taikhoan.getTaikhoan(), sanpham.getTensp(), sanpham.getTrangthai());
		
		if(existLichsu.getIsliked() == Boolean.FALSE) {
			existLichsu.setIsliked(Boolean.TRUE);
			existLichsu.setLikedate(new Date(System.currentTimeMillis()));
		}else {
			existLichsu.setIsliked(Boolean.FALSE);
			existLichsu.setLikedate(null);
		}
		Lichsu updateLichsu = dao.Update(existLichsu);
		return updateLichsu != null ? true: false;
	}

	@Override
	public List<Lichsu> findByUserAndIsLiked(String TAIKHOAN, Boolean isliked, Boolean trangthai) {
		
		return dao.findByUserAndIsLiked(TAIKHOAN, isliked, trangthai);
	}

	@Override
	public Lichsu findByUserIdAndSanPhamId(String TAIKHOAN, String TENSP, Boolean trangthai) {
		
		return dao.findByUserIdAndSanPhamId(TAIKHOAN, TENSP, trangthai);
	}


}
