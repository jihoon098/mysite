package kr.co.itcen.mysite.action.board;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.itcen.mysite.dao.BoardDao;
import kr.co.itcen.mysite.vo.BoardVo;
import kr.co.itcen.web.WebUtils;
import kr.co.itcen.web.mvc.Action;

public class BoardListAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String kwd = request.getParameter("kwd");
		List<BoardVo> list = new BoardDao().getList(kwd);
		request.setAttribute("list", list);
		
		int page = 1;
		if(request.getParameter("page") != null) {
			page = Integer.parseInt(request.getParameter("page"));	
		}
		request.setAttribute("page", page);
		
		//WebUtils.redirect(request, response, request.getContextPath() + "/board");
		WebUtils.forward(request, response, "/WEB-INF/views/board/list.jsp");
	}

}
