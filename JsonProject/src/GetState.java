import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.model.State;


public class GetState extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		ArrayList<State> states=new ArrayList<State>();
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			try {
				Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/countrycity","root","root");
				Statement statement=connection.createStatement();
				String sql="SELECT * FROM state";
				ResultSet resultSet=statement.executeQuery(sql);
				while(resultSet.next()){
					State state=new State();
					state.setStateId(resultSet.getInt(1));
					state.setStateName(resultSet.getString(2));
					states.add(state);
					//out.write("<select>");
					//out.write("<option value=" + resultSet.getInt(1) + ">" + resultSet.getString(2) + "</option>");
				}
				
				Gson gson = new Gson();
				System.out.println(gson.toJson(states));
				String statesList = gson.toJson(states);
				System.out.println(statesList);
				out.println("{\"States\":" + statesList + "}");
			}catch (Exception e) {
					e.printStackTrace();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
