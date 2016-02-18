import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class SavePathInDB {
	public Integer savePath(String pathname){
		System.out.println("--------------------DB----------------------");
		Integer i =0;
		String url = "jdbc:mysql://localhost:3306/servlet";
		String user = "root";
		String password = "root";
		System.out.println("pathname : "+pathname);
		try {
			Class.forName("com.mysql.jdbc.Driver");
			try {
				Connection connection = DriverManager.getConnection(url, user, password);
				Statement statement = connection.createStatement();
				String sql = "insert into fileupload (file_name) values ('"+pathname+"')";
				i = statement.executeUpdate(sql);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		return i;
	}
}
