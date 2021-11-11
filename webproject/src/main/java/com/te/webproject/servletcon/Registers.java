package com.te.webproject.servletcon;

import java.io.IOException;
//import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.te.webproject.beans.EmpInfo;

@WebServlet("/reg")
public class Registers extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	static EmpInfo i = new EmpInfo();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		dataRegister(req, resp);

	}

	private static void dataRegister(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

//		PrintWriter out=resp.getWriter();

		String name = req.getParameter("name");
		String user = req.getParameter("user");
		String pwd = req.getParameter("pwd");
		String pwd1 = req.getParameter("pwd1");
		String gender = req.getParameter("gender");
		String role = req.getParameter("role");
		String mail = req.getParameter("mail");
		Long mob = 1l;

		try {
			mob = Long.parseLong(req.getParameter("mobile"));
		} catch (Exception e) {
			req.getRequestDispatcher("./Register").forward(req, resp);
		}

		Double sal = null;
		try {
			sal = Double.parseDouble(req.getParameter("sal"));
		} catch (Exception e) {
			req.getRequestDispatcher("./Register").forward(req, resp);
		}

		i.setEmpid(Validations.genarateId());

		try {
			i.setName(Validations.checkString(name));
		} catch (Exception e) {
			req.getRequestDispatcher("./Register").forward(req, resp);
		}

		try {
			i.setUsername(Validations.user(user));
		} catch (Exception e) {
			req.getRequestDispatcher("./Register").forward(req, resp);
		}

		i.setGender(gender);

		try {
			i.setPassword(Validations.pass(pwd, pwd1));
		} catch (Exception e) {
			req.getRequestDispatcher("./Register").forward(req, resp);
		}

		try {
			i.setRole(Validations.checkString(role));
		} catch (Exception e) {
			req.getRequestDispatcher("./Register").forward(req, resp);
		}

		try {
			i.setEmail(Validations.email(mail));
		} catch (Exception e) {
			req.getRequestDispatcher("./Register").forward(req, resp);
		}

		try {
			i.setMobileno(Validations.mobile(mob));
		} catch (Exception e) {
			req.getRequestDispatcher("./Register").forward(req, resp);
		}

		i.setSalary(sal);

		InsertData.registerInfo();

		resp.sendRedirect("http://localhost:8080/webproject/Welcome");
	}

	public static EmpInfo getData() {
		return i;
	}

}
