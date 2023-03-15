import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "Pizzaservlet", urlPatterns = "/pizza-order")
public class Pizzaservlet extends HttpServlet {

//
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)  throws IOException, ServletException{
        System.out.println(request.getParameter("sauce"));
        System.out.println(request.getParameter("size"));
        System.out.println(request.getParameter("crust"));
        System.out.println(request.getParameter("topping1"));
        System.out.println(request.getParameter("topping2"));
         System.out.println(request.getParameter("topping3"));
         System.out.println(request.getParameter("topping4"));
    }
}
