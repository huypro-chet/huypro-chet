package poly.com.dao.impl;

import java.util.ArrayList;
import java.util.List;

import poly.com.dao.StartDao;
import poly.com.dao.attrackDao;
import poly.com.dto.sanphamlikedinfo;

public class StartDaoimpl extends attrackDao<Object[]> implements StartDao {

	@Override
	public List<sanphamlikedinfo> findSanphamlikeinfo() {
		String sql = "select s.id, s.codelink, s.tensp, sum(cast(l.isliked as int)) as 'totarlike'"
				+ " from SANPHAM s inner join LICHSU l on s.id = l.tenspid  where s.TRANGTHAI = 1"
				+ " group by s.id, s.codelink, s.tensp"
				+ " order by sum(cast(l.isliked as int)) desc";
		List<Object[]> objects = super.findManyByNaviteQuery(sql);
		List<sanphamlikedinfo> resutl = new ArrayList<>();
		objects.forEach(object ->{
			sanphamlikedinfo  sanphamlikedinfo = setDataSanphamlikedinfo (object);
			resutl.add(sanphamlikedinfo);			
		});
		return resutl;
	}
	private sanphamlikedinfo setDataSanphamlikedinfo (Object[] object) {
		sanphamlikedinfo  sanphamlikedinfo = new sanphamlikedinfo();
		sanphamlikedinfo.setTenspid((Integer)object[0]);
		sanphamlikedinfo.setTensp((String)object[1]);
		sanphamlikedinfo.setCodelink((String)object[2]);
		sanphamlikedinfo.setTotarlike(object[3]==null ? 0: (Integer)object[3]);
		return sanphamlikedinfo;
	}
}
