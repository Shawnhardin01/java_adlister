import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "viewcolorservlet", urlPatterns = "/viewcolor")
public class viewcolorservlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)  throws IOException, ServletException{

    }
}