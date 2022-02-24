package fr.tzoreol.cours_ejb;

import fr.tzoreol.cours_ejb.ejbs.Cart;
import fr.tzoreol.cours_ejb.ejbs.Converter;

import java.io.*;
import javax.ejb.EJB;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/")
public class HelloServlet extends HttpServlet {
    @EJB
    Cart cart;

    @EJB
    Converter converter;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        this.cart.createCart("Tzoreol");
        this.cart.addItem("Dentifrice", 5);
        this.cart.addItem("RedBull", 10);
        this.cart.removeItem("Pâte de fruit", 2);
        this.cart.removeItem("Dentifrice", 5);
        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + this.cart.displayCustomer() + "</h1>");
        out.println("<h3>" + this.cart.displayCart() + "</h3>");
        out.println("<h2>TOTAL - " + this.converter.usdToEur(this.cart.getTotal()) + "</h3>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}