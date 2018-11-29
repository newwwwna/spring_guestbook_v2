package com.javalec.guestbook;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.javalec.guestbook.dao.GuestBookDAO;
import com.javalec.guestbook.vo.GuestBookVO;

public class SelectoneController implements Controller{
@Override
public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
	ModelAndView mav = new ModelAndView();
	GuestBookDAO dao = new GuestBookDAO();
	GuestBookVO vo = new GuestBookVO();
	GuestBookVO vo2 = new GuestBookVO();
	
	String num=req.getParameter("no");
	int no = Integer.parseInt(num);
	vo.setNo(no);
	vo2 = dao.getGuestBook(vo);
	mav.addObject("vo", vo2);
	
	mav.setViewName("selectone");
	
	return mav;
}
}
