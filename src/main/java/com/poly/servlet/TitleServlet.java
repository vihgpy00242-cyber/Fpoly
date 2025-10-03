package com.poly.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/title")
public class TitleServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		Map<String, Object> map = new HashMap<>();
		map.put("title", "Tiêu đề bản tin");
		map.put("content", "Nội dung bản tin thường rất dài");
		req.setAttribute("item", map);
		
        req.setAttribute("item", map);
        req.getRequestDispatcher("/views/title-info.jsp").forward(req, resp);
	}
}
