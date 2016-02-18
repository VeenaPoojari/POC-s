import java.io.File;
import java.io.FileInputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DownloadFile extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean isMultipart;
	private String filePath;
	private int maxFileSize = 50000 * 1024;
	private int maxMemSize = 4 * 1024;
	private File file;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, java.io.IOException {

		System.out.println("-------------------");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String filename = request.getParameter("filename");
		
		//String filename = "home.jsp";
		//String filepath = "e:\\";
		String filepathname = request.getParameter("filepath");
		System.out.println("filename : "+filepathname);
		response.setContentType("APPLICATION/OCTET-STREAM");
		response.setHeader("Content-Disposition", "attachment; filename=\""
				+ filename + "\"");

		FileInputStream fileInputStream = new FileInputStream(filepathname);

		int i;
		while ((i = fileInputStream.read()) != -1) {
			out.write(i);
		}
		fileInputStream.close();
		out.close();
	}
}
