import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ViewFiles extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ResultSet resultSet = null;
		System.out.println("--------------------DB----------------------");
		String url = "jdbc:mysql://localhost:3306/servlet";
		String user = "root";
		String password = "root";
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.write("<table>");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			try {
				Connection connection = DriverManager.getConnection(url, user, password);
				Statement statement = connection.createStatement();
				String sql = "select * from fileupload";
				resultSet = statement.executeQuery(sql);
				while(resultSet.next()){
					out.write("<tr>");
					System.out.println(resultSet.getInt(1));
					//System.out.println(resultSet.getBlob(2));
					Blob blob = resultSet.getBlob(2);
					byte[] bdata = blob.getBytes(1, (int) blob.length());
					String s = new String(bdata);
					System.out.println("s : "+s);
					/*out.println("<a href='file?filepath=" + file + "&filename="
							+ filename
							+ "' target='blank' > Uploaded Filename: "
							+ fileName + "<br>");
					out.println("<a href='index.jsp'>BACK</a>");*/
					out.write("<td><a href='file'>"+s+"</a></td></tr>");
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		out.write("</table>");
	}
}
