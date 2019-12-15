import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;

public class loginHandler extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String[][] login = { { "abubakar", "losogen" }, { "hassam", "football" }, { "nisar", "pucit" }, };

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        int success = 0;
        for (int i = 0; i < login.length; i++) {
            if (username.equals(login[i][0]))
                success++;
            if (password.equals(login[i][1]))
                success++;

        }
        if (success == 2) {
            response.sendRedirect("success");
        } else
            response.sendRedirect("error");
        out.close();

    }

}