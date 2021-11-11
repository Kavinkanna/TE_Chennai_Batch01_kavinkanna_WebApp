package com.te.webproject.servletcon;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.te.webproject.beans.EmpInfo;

public class ShowDetails {

	public static EmpInfo empDetails() {

		EmpInfo info = null;

		try {

			EntityManagerFactory emf = Persistence.createEntityManagerFactory("emp");
			EntityManager em = emf.createEntityManager();

			EmpInfo eInfo = em.find(EmpInfo.class, Login.getId());
			if (eInfo != null) {
				info = eInfo;
			}
			emf.close();
			em.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return info;
	}

	public static EmpInfo getEmp() {

		return empDetails();

	}
}
