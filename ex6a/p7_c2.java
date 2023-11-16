/*Receive the cookie set already*/
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class p7_c2 extends HttpServlet 
{
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
  {
    try 
    {
      	response.setContentType("text/html");
        PrintWriter pwriter = response.getWriter();
        Cookie[] ck = request.getCookies();
        int len = ck.length;
      	String value;
        pwriter.println("<h3>Hello - </h3>");
        for (int i = 0; i < len; i++) {
        	value = ck[i].getValue();
        	pwriter.println(value);
      	}
      	writer.print("<h2>Plants Varieties Available</h3>");
        pwriter.print("<h4>Herbs</h4>");
        pwriter.print("<h4>Shrubs</h4>");
        pwriter.print("<h4>Trees</h4>");
        pwriter.print("<h4>Climbers</h4>");
        pwriter.print("<h4>Creepers</h4>");
        pwriter.close();
    } 
    catch (Exception exp)
    {
      	System.out.println(exp);
    }
  }
}
