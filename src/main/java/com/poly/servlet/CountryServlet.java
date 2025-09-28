package com.poly.servlet;


import java.util.List;
import java.util.ArrayList;
import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/countries")
public class CountryServlet extends HttpServlet {

    /**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
    	List<Country> list = new ArrayList<>();
        list.add(new Country("VN", "Việt Nam"));
        list.add(new Country("US", "United States"));
        list.add(new Country("CN", "China"));

        req.setAttribute("countries", list);
        req.getRequestDispatcher("views/countries.jsp").forward(req, resp);
    }

}