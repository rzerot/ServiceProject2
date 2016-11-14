package dragos.com.serviceproject.comments;

import java.io.Serializable;

/**
 * Created by java2 on 11/10/2016.
 */

public class Comments implements Serializable {
    private int score;
    private String display_name;
    private long post_id;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;


    }

    public String getDisplay_name() {
        return display_name;
    }


    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
    }

    public long getPost_id() {
        return post_id;
    }

    public void setPost_id(long post_id) {
        this.post_id = post_id;
    }
}
