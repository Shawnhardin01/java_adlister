import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class IncorrectServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("message", "You Lose!");
        RequestDispatcher view = request.getRequestDispatcher("outcome.jsp");
        view.forward(request, response);
    }
}
