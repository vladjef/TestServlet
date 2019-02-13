

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
          
        response.setContentType("text/html");
        
        PrintWriter writer = response.getWriter();
        try {
        	writer.println("<!DOCTYPE html>");
        	writer.println("<html>");
        	writer.println("<head>");
        	writer.println("<title>Servlet NewServlet</title>");            
        	writer.println("</head>");
        	writer.println("<body>");
        	writer.println("<h1>Servlet 'Test' at " + request.getContextPath() + "</h1>");
        	writer.println(""
                    + "<table width=\"700\" border=\"1\">\n" +
"        <caption>Test table for testing servet's endpoints in JAVA EE</caption>\n" +
"        <tr>\n" +
"            <td>1</td>\n" +
"            <td>2</td>\n" +
"            <td>3</td>\n" +
"        </tr>\n" +
"\n" +
"        <tr>\n" +
"            <td>easy</td>\n" +
"            <td>medium</td>\n" +
"            <td>hard</td>\n" +
"        </tr>\n" +
"    </table>"
                    + "");
        	writer.println("</body>");
        	writer.println("</html>");

        } finally {
            writer.close();  
        }
    }

}
