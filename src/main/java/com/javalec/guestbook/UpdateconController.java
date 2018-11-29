package com.javalec.guestbook;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class UpdateconController implements Controller {
	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) {

		ModelAndView mav = new ModelAndView();
		if (req.getParameter("pw").equals(req.getParameter("password"))) {
			mav.setViewName("updateform.jsp");
			
		} else {
			mav.setViewName("getguestbooklist.do");
			
		}

		return mav;
	}
}
