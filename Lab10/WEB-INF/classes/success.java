import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;

public class success extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet : Success</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<p> Your login is successful!</p>");
        out.println("</body>");
        out.println("</html>");
        out.close();

    }

}