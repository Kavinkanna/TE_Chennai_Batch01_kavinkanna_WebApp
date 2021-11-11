package com.te.webproject.servletcon;

import java.io.IOException;
//import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.te.webproject.beans.EmpInfo;

@WebServlet("/update")
public class Update extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	static EmpInfo i = null;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		updateInfo(req, resp);

	}

	private static void dataUpdate(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

//		PrintWriter out=resp.getWriter();

		String name = req.getParameter("name");
		String user = req.getParameter("user");
		String gender = req.getParameter("gender");
		String role = req.getParameter("role");
		String mail = req.getParameter("mail");
		String mobile = req.getParameter("mobile");
		String sal = req.getParameter("sal");

		if (name.length() > 0) {
			try {
				i.setName(Validations.checkString(name));
			} catch (Exception e) {
				req.getRequestDispatcher("./UpdateDetails").forward(req, resp);
			}
		}

		if (user.length() > 0) {
			try {
				i.setUsername(Validations.user(user));
			} catch (Exception e) {
				req.getRequestDispatcher("./UpdateDetails").forward(req, resp);
			}
		}

		if (gender != null) {
			i.setGender(gender);
		}

		if (role.length() > 0) {
			try {
				i.setRole(Validations.checkString(role));
			} catch (Exception e) {
				req.getRequestDispatcher("./UpdateDetails").forward(req, resp);
			}
		}

		if (mail.length() > 0) {
			try {
				i.setEmail(Validations.email(mail));
			} catch (Exception e) {
				req.getRequestDispatcher("./UpdateDetails").forward(req, resp);
			}
		}

		if (mobile.length() > 0) {
			try {
				i.setMobileno(Validations.mobile(Long.parseLong(mobile)));
			} catch (Exception e) {
				req.getRequestDispatcher("./UpdateDetails").forward(req, resp);
			}
		}

		if (sal.length() > 0) {
			i.setSalary(Double.parseDouble(sal));
		}
	}

	public static void updateInfo(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		EntityManagerFactory fact = null;
		EntityManager mgr = null;
		EntityTransaction trn = null;

		try {
			fact = Persistence.createEntityManagerFactory("emp");
			mgr = fact.createEntityManager();
			trn = mgr.getTransaction();
			trn.begin();
			i = mgr.find(EmpInfo.class, Login.getId());
			dataUpdate(req, resp);
			trn.commit();
			resp.sendRedirect("http://localhost:8080/webproject/Menu");
		} catch (Exception e) {
			if (trn != null) {
				trn.rollback();
			}
			System.out.println("Update Failed, Try Again");
		} finally {
			try {
				if (fact != null) {
					fact.close();
				}
				if (mgr != null) {
					mgr.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
