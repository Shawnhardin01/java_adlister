import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class CorrectServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("message", "You Won!");
        RequestDispatcher view = request.getRequestDispatcher("outcome.jsp");
        view.forward(request, response);
    }
}
