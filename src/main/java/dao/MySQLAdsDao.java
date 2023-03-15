package dao;

import ADS.Ad;
import ADS.Ads;

import java.io.ObjectInputFilter;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.logging.Logger;

import static java.Config.*;

public class MySQLAdsDao implements Ads {
    private Connection connection = null;

    public MySQLAdsDao(ObjectInputFilter.Config config) {
        try {  DriverManager.registerDriver(new Driver() {
            @Override
            public Connection connect(String url, Properties info) throws SQLException {
                return null;
            }

            @Override
            public boolean acceptsURL(String url) throws SQLException {
                return false;
            }

            @Override
            public DriverPropertyInfo[] getPropertyInfo(String url, Properties info) throws SQLException {
                return new DriverPropertyInfo[0];
            }

            @Override
            public int getMajorVersion() {
                return 0;
            }

            @Override
            public int getMinorVersion() {
                return 0;
            }

            @Override
            public boolean jdbcCompliant() {
                return false;
            }

            @Override
            public Logger getParentLogger() throws SQLFeatureNotSupportedException {
                return null;
            }
        });

            connection = DriverManager.getConnection(
                    getUrl(),
                   getUser(),
                    getPassword()
            );
        } catch (SQLException e){
            throw new RuntimeException("Error connecting to the database!",e);
        }
    }



    @Override
    public List<Ad> all() {
        List<Ad> ads = new ArrayList<>();

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Ads");

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String title = resultSet.getString("title");
                String description = resultSet.getString("description");
                Ad ad = new Ad(id, title, description);
                ads.add(ad);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return ads;
    }

    @Override
    public void insert(Ad ad) {
        try {
            PreparedStatement statement = connection.prepareStatement(
                    "INSERT INTO ads (title, description) VALUES (?, ?)");
            statement.setString(1, ad.getTitle());
            statement.setString(2, ad.getDescription());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Ad ad) {
        try {
            PreparedStatement statement = connection.prepareStatement(
                    "UPDATE ads SET title=?, description=? WHERE id=?");
            statement.setString(1, ad.getTitle());
            statement.setString(2, ad.getDescription());
            statement.setInt(3, (int) ad.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        try {
            PreparedStatement statement = connection.prepareStatement(
                    "DELETE FROM ads WHERE id=?");
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
