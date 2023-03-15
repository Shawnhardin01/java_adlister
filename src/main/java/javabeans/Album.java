package javabeans;

import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
public class Album implements Serializable {
    private long id;
    private String artist;
    private String album_name;

    public long getId(int i) {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getArtist(String thestrokes) {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum_name(String thisisit) {
        return album_name;
    }

    public void setAlbum_name(String album_name) {
        this.album_name = album_name;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public int getSales(int i) {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    public String getGenre(String indie) {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    private String release_date;
    private int sales;
    private String genre;

    @Override
    public String toString() {
        return "Album{" +
                "id=" + id +
                ", artist='" + artist + '\'' +
                ", album_name='" + album_name + '\'' +
                ", release_date=" + release_date +
                ", sales=" + sales +
                ", genre='" + genre + '\'' +
                '}';
    }
}

