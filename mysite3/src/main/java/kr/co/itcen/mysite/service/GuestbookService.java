package kr.co.itcen.mysite.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.itcen.mysite.repository.GuestbookDao;
import kr.co.itcen.mysite.vo.GuestbookVo;

@Service
public class GuestbookService {

	@Autowired
	private GuestbookDao guestbookDao;

	public List<GuestbookVo> get() {
		return guestbookDao.getList();
	}

	public void insert(GuestbookVo vo) {
		guestbookDao.insert(vo);
	}

	
	public void delete(GuestbookVo vo) { 
		guestbookDao.delete(vo);
	}

	public boolean writeContent( GuestbookVo vo ) {
		int count = guestbookDao.insert(vo);
		return count == 1;
	}
	 

}
