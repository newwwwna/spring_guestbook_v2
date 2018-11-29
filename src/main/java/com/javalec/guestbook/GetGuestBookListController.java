package com.javalec.guestbook;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.javalec.guestbook.dao.GuestBookDAO;
import com.javalec.guestbook.vo.GuestBookVO;

public class GetGuestBookListController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) {
		String keyword = req.getParameter("search");
		List<GuestBookVO> list = null;

		ModelAndView mav = new ModelAndView();

		String select = req.getParameter("select");
		GuestBookDAO dao = new GuestBookDAO();

		if (keyword != null) {
			if (select.equals("name")) {
				list = dao.nameSearch(keyword);
			} else {
				list = dao.search(keyword);
			}
		} else {
			list = dao.getGuestBookList();
		}
		// MAV 객체에 request 정보 세팅
		mav.addObject("list", list);
		// index.jsp로 이동!
		mav.setViewName("index");
		return mav;
	}

}
