package com.te.webproject.servletcon;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.webproject.beans.EmpInfo;

public class InsertData {

	public static void registerInfo() {

		EntityManagerFactory fact = null;
		EntityManager mgr = null;
		EntityTransaction trn = null;

		EmpInfo info = Registers.getData();

		try {
			fact = Persistence.createEntityManagerFactory("emp");
			mgr = fact.createEntityManager();
			trn = mgr.getTransaction();
			trn.begin();
			mgr.persist(info);
			trn.commit();
		} catch (Exception e) {
			System.out.println("Registration Failed, Try Again");
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
