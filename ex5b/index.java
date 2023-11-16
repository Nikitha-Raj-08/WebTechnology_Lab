import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class p2 extends HttpServlet {
   public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
      response.setContentType("text/html");
      PrintWriter out = response.getWriter();
      String title = "PLANTEX-Botanical House";
      String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";  
       out.println(docType +
         "<html>\n" +
            "<head><title>" + title + "</title></head>\n" +
            "<body bgcolor = \"#f0f0f0\">\n" +
               "<h1 align = \"center\">" + title + "</h1>\n" +
               "<ul>\n" +
                  "  <li><b>Name</b>: "
                  + request.getParameter("name") + "\n" +
                  "  <li><b>Place</b>: "
                  + request.getParameter("age") + "\n" +
               "</ul>\n" +
            "</body>" +
         "</html>"
      );
      out.println(docType +
         "<html>\n" +
            "<body bgcolor = \"#f0f0f0\">\n" +
               "<ul>\n" +
                  "  <li><b>HERBS: </b>: "
                  + request.getParameter("Herbs") + "\n" +
                  "  <li><b>SHRUBS: </b>: "
                  + request.getParameter("Shrubs") + "\n" +
                  "  <li><b>TREES: </b>: "
                  + request.getParameter("Trees") + "\n" +
                   "  <li><b>CLIMBERS: </b>: "
                  + request.getParameter("Climbers") + "\n" +
                   "  <li><b>CREEPERS: </b>: "
                  + request.getParameter("Creepers") + "\n" +                  
               "</ul>\n" +
            "</body>" +
         "</html>"
      );

   }
}
