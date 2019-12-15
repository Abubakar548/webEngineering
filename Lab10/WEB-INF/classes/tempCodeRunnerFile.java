import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;

public class success extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet : Success</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<p>Welcome " + request.getParameter("username") + " <br> + Your login is successful!</p>");
        out.println("</body>");
        out.println("</html>");
        out.close();

    }

}