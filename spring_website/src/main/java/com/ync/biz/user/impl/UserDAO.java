package com.ync.biz.user.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Repository;

import com.ync.biz.board.BoardVO;
import com.ync.biz.common.JDBCUtil;
import com.ync.biz.user.UserVO;

@Repository("UserDAO")
public class UserDAO  {
	
	//ALT + SHIFT + T ����Ű Extra Interface
	//�����ʸ��콺 Refactor => Extra Interface 
	
	// UserDAO �ڵ����� �����Ǵ� implements ����
	// �Լ� ���� Override �� ����
	
	
	private Connection conn = null;
	private PreparedStatement stmt = null;
	private ResultSet rs = null;
	
	private final String USER_GET = "select * from users where id=? and password=?";
	private final String USER_INSERT ="insert into users(id,password,name,role) values(?,?,?,?)";
	

	public  UserVO getUser(UserVO vo) {
		System.out.println("======> JDBC getUser() ��� ó��");
		UserVO user = null;
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(USER_GET);
			stmt.setString(1, vo.getId());
			stmt.setString(2, vo.getPassword());
			rs = stmt.executeQuery();
			if(rs.next()) {
				user = new UserVO();
				user.setSeq(rs.getInt("SEQ"));
				user.setId(rs.getString("ID"));
				user.setPassword(rs.getString("PASSWORD"));
				user.setName(rs.getString("NAME"));
				user.setRole(rs.getString("ROLE"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(rs, stmt,conn);
		}
		return user;
	}
	
	public void insertUser(UserVO vo) {
		
		System.out.println("===> JDBC insertUser() ��� ó��");
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(USER_INSERT);
			stmt.setString(1, vo.getId());
			stmt.setString(2, vo.getPassword());
			stmt.setString(3, vo.getName());
			stmt.setString(4, vo.getRole());
			stmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(stmt, conn);
		}
		
	}	
	

}
