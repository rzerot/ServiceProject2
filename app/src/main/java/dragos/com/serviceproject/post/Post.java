package dragos.com.serviceproject.post;

import java.io.Serializable;

/**
 * Created by java2 on 11/14/2016.
 */

public class Post implements Serializable {
    String link;

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
