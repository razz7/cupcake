<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OldCode;

=======

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OldCode;

>>>>>>> 9da7a381734e0924a0bc510faea8aa7fa5756a97
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Rasmus2
 */
public class PageLogin {

    public static void generateLogin(HttpServletResponse response) throws IOException {
        try (PrintWriter out = response.getWriter())
        {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet FrontController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Login!</h1>");
            out.println("<p>");
            out.println("<form>" +
            "<input type=\"hidden\" name=\"action\" value=\"login\"><br>" +
            "Username:<br>" +
            "<input type=\"text\" name=\"username\" value=\"\"><br>" +
            "Login:<br>" +
            "<input type=\"password\" name=\"password\" value=\"\"><br><br>" +
            "<input type=\"submit\" value=\"Login\">" +
            "</form>");
            out.println("</p>");
            //out.println("<p><a href=\"/Cupcake/FrontController?action=login\">Log in</a></p>");
            out.println("<p><a href=\"/Cupcake/FrontController?action=makeLogin\">Create an account</a></p>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    
<<<<<<< HEAD
}
=======
}
>>>>>>> 9da7a381734e0924a0bc510faea8aa7fa5756a97
