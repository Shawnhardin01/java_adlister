import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "pickcolorservlet", urlPatterns = "/pickcolor")
public class pickcolorservlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String color = request.getParameter("color");
        response.sendRedirect("viewcolor.jsp?color=" + color);
    }
}