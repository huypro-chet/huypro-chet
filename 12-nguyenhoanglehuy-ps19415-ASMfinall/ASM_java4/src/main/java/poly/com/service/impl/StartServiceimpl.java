package poly.com.service.impl;

import java.util.List;

import poly.com.dao.StartDao;
import poly.com.dao.impl.StartDaoimpl;
import poly.com.dto.sanphamlikedinfo;
import poly.com.service.StartService;

public class StartServiceimpl implements StartService{
	
	private StartDao startdao;
	
	public StartServiceimpl() {
		startdao = new StartDaoimpl();
	}

	@Override
	public List<sanphamlikedinfo> findSanphamlikeinfo() {
		// TODO Auto-generated method stub
		return startdao.findSanphamlikeinfo();
	}

}
