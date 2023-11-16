import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class index extends HttpServlet 
{
   private String message;
   public void init() throws ServletException 
   {
      message = "Welcome Back";
   }
   public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException 
      {
      	response.setContentType("text/html");
      	PrintWriter out = response.getWriter();
      	out.println("<h1><centre>" + message + "</centre></h1>");
      	out.println("<p><centre>PLANTEX - Botanical house!!!<centre></p>");
        out.println("<p style = \"font-family: Verdana, Geneva, Tahoma, sans-serif;\">
           Welcome to our Plant Paradise, the ultimate online destination for plant enthusiasts. 
           Explore a diverse collection of plants, guided by expert care instructions 
           and captivating photos. 
           Enjoy seamless browsing,secure packaging,and prompt delivery.
           Join a vibrant community, shop sustainably,and find inspiration to bring nature into your space. 
           Your journey to a greener life begins here!!!</p>");
   }

   public void destroy() {
      // do nothing.
   }
