package javabeans;

import java.io.Serializable;
import java.sql.Date;

public class quote implements Serializable {
    private long id;

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor_first_name() {
        return author_first_name;
    }

    public void setAuthor_first_name(String author_first_name) {
        this.author_first_name = author_first_name;
    }

    public String getAuthor_last_name() {
        return author_last_name;
    }

    public void setAuthor_last_name(String author_last_name) {
        this.author_last_name = author_last_name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    private String author_first_name;
    private String author_last_name;
    private String content;

    @Override
    public String toString() {
        return "quote{" +
                "id=" + id +
                ", author_first_name='" + author_first_name + '\'' +
                ", author_last_name='" + author_last_name + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
