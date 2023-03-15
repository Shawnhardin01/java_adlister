import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class GuessServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int answer = (int) (Math.random() * 3) + 1;
        int guess = Integer.parseInt(request.getParameter("guess"));

        if (guess == answer) {
            response.sendRedirect("/correct");
        } else {
            response.sendRedirect("/incorrect");
        }
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher view = request.getRequestDispatcher("guess.jsp");
        view.forward(request, response);
    }
}
