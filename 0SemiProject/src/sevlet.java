

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class sevlet
 */
@WebServlet("/sevlet")
public class sevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public sevlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");//request 한글 인코딩
		response.setContentType("text/html;charset=UTF-8");
		String Dog[]=request.getParameterValues("Dog");
		PrintWriter out=response.getWriter();
		out.println("<html><head></head><body></body>");
		
		if(Dog!=null) {
			for(String s:Dog) {
				if(Dog.equals("강아지1")){
					
				}
					
					
				
			}
		}else {
			out.println("값이없지렁이");
		}
		
		out.println("끝났지렁이");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
