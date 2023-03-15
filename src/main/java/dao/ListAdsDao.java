package dao;

import ADS.Ad;
import ADS.Ads;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ListAdsDao implements Ads {
    private Connection conn;

    public ListAdsDao() {
        this.conn = conn;
    }

    private List<Ad> ads;

    public List<Ad> all() {
        if (ads == null) {
            ads = generateAds();
        }
        return ads;
    }

    @Override
    public long insert(Ad ad) throws SQLException {
        String query = "INSERT INTO ads (title, description, price) VALUES (?, ?, ?)";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setString(1, ad.getTitle());
        stmt.setString(2, ad.getDescription());
        stmt.setDouble(3, ad.getPrice());
        stmt.executeUpdate();
        return 0;
    }

    @Override
    public void update(Ad ad) {

    }

    @Override
    public void delete(int id) {

    }

    private List<Ad> generateAds() {
        List<Ad> ads = new ArrayList<>();
        ads.add(new Ad(
                1,
                "playstation for sale",
                "This is a slightly used playstation"
        ));
        ads.add(new Ad(
                2,
                "Super Nintendo",
                "Get your game on with this old-school classic!"
        ));
        ads.add(new Ad(
                3,
                "Junior Java Developer Position",
                "Minimum 7 years of experience required. You will be working in the scripting language for Java, JavaScript"
        ));
        ads.add(new Ad(
                4,
                "JavaScript Developer needed",
                "Must have strong Java skills"
        ));
        return ads;
    }
}
