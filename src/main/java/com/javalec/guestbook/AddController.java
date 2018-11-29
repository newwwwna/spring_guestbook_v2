package com.javalec.guestbook;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.javalec.guestbook.dao.GuestBookDAO;
import com.javalec.guestbook.vo.GuestBookVO;

public class AddController implements Controller {
	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) {
		GuestBookDAO dao = new GuestBookDAO();
		GuestBookVO vo = new GuestBookVO();
		ModelAndView mav = new ModelAndView();

		String name = (String) req.getParameter("name");
		String password = (String) req.getParameter("pw");
		String content = (String) req.getParameter("content");

		vo.setName(name);
		vo.setPassword(password);
		vo.setContent(content);

		int result = dao.insert(vo);
		mav.setViewName("redirect:getguestbooklist.do");

		return mav;
	}
}
