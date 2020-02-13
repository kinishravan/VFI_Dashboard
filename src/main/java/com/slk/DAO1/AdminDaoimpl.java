package com.slk.DAO1;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import com.mysql.cj.protocol.Resultset;
import com.slk.model1.Admin;
import com.slk.util.DButil;

@Repository
	public class AdminDaoimpl implements AdminDao {

		// Dummy database. Initialize with some dummy values.
	 Connection con;
		private static List<Admin> admin;
		 
	
         {
			
			try {
				con=DButil.getConnection();
				System.out.println("connection object "+con);
			} catch (Exception e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		
			
			
			
		}
		
         @Override
     	public void addJob(Admin emp) {
     		try {
     			/*
     			 * String query1="select max(employee_id) from employee";
     			 * PreparedStatement stmt1=connection.prepareStatement(query1);
     			 * ResultSet rs1= stmt1.executeQuery(query1); rs1.next();
     			 * 
     			 * int employee_id=rs1.getInt(1); System.out.println(
     			 * "before increment"); employee_id=++employee_id;
     			 * System.out.println("aftr increment");
     			 */
     			
     			String query1 = " insert into newjob values(?,?,?,?); ";
     			String query2="select max(idnewjob) from newjob";
     			Statement select_stmt = con.createStatement();
    			ResultSet select_rs = select_stmt.executeQuery(query2);

    			select_rs.next();
    			int id=select_rs.getInt(1);
     			id++;
     			PreparedStatement stmt1 = con.prepareStatement(query1);
     			System.out.println("function incoming");

     			stmt1.setInt(1, id);
     			stmt1.setString(2, emp.getTitle());
     			stmt1.setString(3, emp.getExperience());
     			stmt1.setString(4, emp.getSkills());
     			
     			System.out.println(emp.getIdnewjob()+ emp.getExperience() + emp.getSkills());
     			int j = stmt1.executeUpdate();
     			System.out.println(j);
     			System.out.println("insertion to the admin job done");

     			

     			/*
     			 * String id= emp.employee_id; stmt.setString(9,id);
     			 * System.out.println(id); stmt.setString(10, emp.getBranch_id());
     			 * System.out.println(emp.branch_id); ResultSet i=
     			 * stmt.executeQuery(); System.out.println("i="+i);
     			 */

     		} catch (Exception e) {
     			e.printStackTrace();
     		}

     	}
	
		

	}


