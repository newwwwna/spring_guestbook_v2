package com.javalec.guestbook;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.javalec.guestbook.dao.GuestBookDAO;
import com.javalec.guestbook.vo.GuestBookVO;

public class DeleteController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) {
		
		String no = req.getParameter("no");
		String password = req.getParameter("pw");
		ModelAndView mav = new ModelAndView();
		if (password != null || no != null) {
			int id = Integer.parseInt(no);
			GuestBookDAO dao = new GuestBookDAO();
			GuestBookVO vo = new GuestBookVO();

			vo.setNo(id);
			vo.setPassword(password);

			dao.delete(vo);
		}
	
		mav.setViewName("getguestbooklist.do");
		return mav;
		
	
	}
}
