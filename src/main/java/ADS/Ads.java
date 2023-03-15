package ADS;

import java.sql.SQLException;
import java.util.List;

public interface Ads {
    List<Ad> all();

    long insert(Ad ad) throws SQLException;

    void update(Ad ad);

    void delete(int id);
}