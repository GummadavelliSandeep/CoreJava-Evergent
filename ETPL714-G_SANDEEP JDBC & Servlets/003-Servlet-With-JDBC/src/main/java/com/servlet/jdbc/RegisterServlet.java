package com.servlet.jdbc;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
 
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
public class RegisterServlet extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        Connection conn = null;
		String url = "jdbc:mysql://localhost:3306/";
		String dbName = "evergentdb";
		String driver = "com.mysql.jdbc.Driver";
		String userName = "root"; 
		String password = "admin";	 
 
        String uname = request.getParameter("userName");
        String mypassword = request.getParameter("password");
        String email = request.getParameter("email");
        String lang = request.getParameter("language");
 
        try {
           /* Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection(
            		"jdbc:oracle:thin:@localhost:1521:XE","capgdb","capgdb");
            		*/
        	
    			Class.forName(driver);
    			conn = DriverManager.getConnection(url+dbName,userName,password);
        	     	
        	
        	
    PreparedStatement ps = conn.prepareStatement("insert into USERDETAILS values(?,?,?,?)");
 
            ps.setString(1, uname);
            ps.setString(2, mypassword);
            ps.setString(3, email);
            ps.setString(4, lang);
 
            int i = ps.executeUpdate();
            if (i > 0)
                out.print("You are successfully registered...");
 
        } catch (Exception e2) {
            System.out.println(e2);
        }
 
        out.close();
    }
 
}
