package com.poly.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/form/update")
public class FormServlet extends HttpServlet {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		User bean = new User();
		bean.setFullname("Nguyễn Văn Tèo");
		bean.setGender(true);
		bean.setCountry("VN");
		req.setAttribute("user", bean);
		req.getRequestDispatcher("/form.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String fullname = req.getParameter("fullname");
		System.out.println(fullname);
		req.getRequestDispatcher("/form.jsp").forward(req, resp);
	}

}


//Map<String, Object> map = new HashMap<>();
//map.put("fullname", "Nguyễn Văn Tèo");
//map.put("gender", true);
//map.put("country", "VN");
//req.setAttribute("user", map);
//req.setAttribute("editabled", true);