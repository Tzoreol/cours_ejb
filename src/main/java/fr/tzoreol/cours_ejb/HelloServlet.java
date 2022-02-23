package fr.tzoreol.cours_ejb;

import java.io.*;
import javax.ejb.EJB;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", pa = "/")
public class HelloServlet extends HttpServlet {
    @EJB
    MyBean beanOne;

    @EJB
    MyBean beanTwo;
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("Equals? " + (beanOne.equals(beanTwo) ? "true" : "false") + "<br/>");
        out.println("BeanOne ID: " + beanOne.id + "<br/>");
        out.println("BeanTwo ID: " + beanTwo.id);
        out.println("</body></html>");
    }

    public void destroy() {
    }
}