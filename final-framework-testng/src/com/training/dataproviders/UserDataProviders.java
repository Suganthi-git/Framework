package com.training.dataproviders;

import java.util.List;

import org.testng.annotations.DataProvider;

import com.training.bean.LoginBean;
import com.training.bean.UserBean;
import com.training.dao.ELearningDAO;
import com.training.dao.UserDetailDAO;
import com.training.readexcel.ApachePOIExcelRead;
import com.training.readexcel.ReadExcel;

public class UserDataProviders {
	@DataProvider(name = "db-inputs")
	public Object [][] getDBData() {

		List<UserBean> list = new UserDetailDAO().getuser(); 
		
		Object[][] result = new Object[list.size()][]; 
		int count = 0; 
		for(UserBean temp : list){
			Object[]  obj = new Object[4]; 
			obj[0] = temp.getUserEName(); 
			obj[1] = temp.getEmail();
			obj[2] = temp.getSubject();
			obj[3] = temp.getuserMsg();
 			
			result[count ++] = obj; 
		}
		
		
		return result;
	}
	
	@DataProvider(name = "excel-inputs")
	public Object[][] getExcelData(){
		String fileName ="C:\\Users\\SuganthiDhanasamy\\Desktop\\Selenium Complex case.xlsx";
		String SheetName="Sheet2";
		return new ApachePOIExcelRead().getExcelContent(fileName,SheetName);
	}
	
	@DataProvider(name = "xls-inputs")
	public Object[][] getXLSData(){
		// ensure you will have the title as first line in the file 
		return new ReadExcel().getExcelData("C:/Users/Naveen/Desktop/Testing.xls", "Sheet1"); 
	}
}
