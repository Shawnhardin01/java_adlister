package dao;

import ADS.Ad;
import ADS.Ads;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {
    private Connection connection = null;

    public MySQLAdsDao() {
        try {
            // Connect to the MySQL database
            connection = DriverManager.getConnection("jdbc:mysql://localhost:8080/ymir-shawn", "username", "password");
        } catch (SQLException e){
            throw new RuntimeException(e);
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
