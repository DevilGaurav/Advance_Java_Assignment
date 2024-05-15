package web_pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/hello")
/* runtime,class level ,mandatory annotation meant for wc
 * when you deploy a web app ,wc creates a map
 * key --url pattern(/hello)
 * value --F.Q. servlet class name (web_page.TestServlet)
 * URL--http://host:port/day1_lab/hello
 * http--app layer protocol(scheme)
 * host -- DNS qualified host name(www.abc.com)or IP address
 * port-TCP port no(def port-8080)
 * URI/path-/day_lab/hello
 * /day1_lab-context (=web app) root
 * /hello--URL pattern
 *  
 */
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("in init");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("in destroy");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in doGet");
		//1.ser resp content type
		response.setContentType("text/hetml");
		//2.get print writer from http servelet response , to send buffered text contents --> to clnt
		try(PrintWriter pw=response.getWriter()){
			pw.print("<h4>hello from servlet</h4>"+LocalDateTime.now()+"</h4>");
		}
	}

}
