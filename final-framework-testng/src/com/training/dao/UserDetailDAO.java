package com.training.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.training.bean.UserBean;
import com.training.connection.GetConnection;
import com.training.utility.LoadDBDetails;

public class UserDetailDAO {

	Properties properties; 
	
	public UserDetailDAO() {
		 try {
			properties = new Properties();
			FileInputStream inStream = new FileInputStream("./resources/sql.properties");
			properties.load(inStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<UserBean> getuser(){
		String sql = properties.getProperty("get.user"); 
		
		GetConnection gc  = new GetConnection(); 
		List<UserBean> list = null;
		try {
			gc.ps1 = GetConnection.getMySqlConnection(LoadDBDetails.getDBDetails()).prepareStatement(sql); 
			list = new ArrayList<UserBean>(); 
			
			gc.rs1 = gc.ps1.executeQuery(); 
			
			while(gc.rs1.next()) {
			
				UserBean temp = new UserBean(); 
				temp.setUserEName(gc.rs1.getString(1));
				temp.setEmail(gc.rs1.getString(2));
				temp.setSubject(gc.rs1.getString(3));
				temp.setuserMsg(gc.rs1.getString(4));

				list.add(temp); 
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list; 
	}
	
	public static void main(String[] args) {
		new UserDetailDAO().getuser().forEach(System.out :: println);
	}
	
	

}
