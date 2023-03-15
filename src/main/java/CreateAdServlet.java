import ADS.Ad;
import ADS.Ads;
import dao.ListAdsDao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public class CreateAdServlet extends HttpServlet {
    private DataSource dataSource;

    public void init() {
        dataSource = (DataSource) getServletContext().getAttribute("dataSource");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/create.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, IOException {
        try (Connection conn = dataSource.getConnection()) {
            String title = request.getParameter("title");
            String description = request.getParameter("description");
            double price = Double.parseDouble(request.getParameter("price"));

            Ad ad = new Ad(title, description, price);
            Ads adsDao = new ListAdsDao();
            adsDao.insert(ad);
        } catch (SQLException e) {
            throw new ServletException("Unable to create ad", e);
        }

        response.sendRedirect("/ads");
    }
}
