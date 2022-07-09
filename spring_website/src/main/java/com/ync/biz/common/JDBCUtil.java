package com.ync.biz.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.jdbc.Driver;
import com.mysql.cj.protocol.Resultset;

public class JDBCUtil {
	
	public static Connection	getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost/sohn","root","thsghdud00@@");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}
	
	public static void close(PreparedStatement stmt,Connection conn) {
		if(stmt != null) {
			try {
				if(!stmt.isClosed())
					stmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				stmt = null;
			}
		}
		if(conn != null) {
			try {
				if(!conn.isClosed())
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				conn = null;
			}
		}		
		
		
	}
	
	public static void close(ResultSet rs, PreparedStatement stmt,Connection conn) {
		if(rs != null) {
			try {
				if(!rs.isClosed())
					rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				rs = null;
			}
		}		
		if(stmt != null) {
			try {
				if(!stmt.isClosed())
					stmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				stmt = null;
			}
		}
		if(conn != null) {
			try {
				if(!conn.isClosed())
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				conn = null;
			}
		}		
		
	}
	

}