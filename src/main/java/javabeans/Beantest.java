package javabeans;
import javabeans.Album;
public class Beantest {
    public static void main(String[] args) {
        Album thisisit = new Album();
        thisisit.setAlbum_name("thisisit") ;
        thisisit.setArtist("Thestrokes");
        thisisit.setGenre("indie");
        thisisit.setRelease_date(("07/30/2001"));
        thisisit.setId(3);
        thisisit.setSales(2);
        System.out.println(thisisit);
        quote Jfk = new quote();
        Jfk.setAuthor_first_name("jhon");
        Jfk.setAuthor_last_name("Kenedy");
        Jfk.setContent("The only thing to fear is fear itself.");
        Jfk.setId(7);
        System.out.println(Jfk);

    }

}
