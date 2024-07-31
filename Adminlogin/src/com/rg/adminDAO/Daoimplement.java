package com.rg.adminDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.rg.adminConnector.ConnectorDb;

public class Daoimplement implements Dtointerface{

	public boolean insertAdmin(String aname, int salary) {
		Connection con = null;
		int insert =0;
		try {
			con = ConnectorDb.requestCon();
			String query = "insert into admin (adminname,salary) values(?,?)";
			PreparedStatement ptst = con.prepareCall(query);
			ptst.setString(1,aname);
			ptst.setInt(2, salary);
			insert = ptst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(insert == 1) {
			return true;
		}else {
			return false;
		}
	}

	public boolean deleteAdmin(String adminname) {
		Connection con = null;
		int delete = 0;
		try {
			con = ConnectorDb.requestCon();
			String query = "delete from admin where adminname = ?";
			PreparedStatement ptst = con.prepareCall(query);
			ptst.setString(1, adminname);
			ptst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(delete != 1) {
			return true;
		}else {
			return false;
		}
	}

	
}
