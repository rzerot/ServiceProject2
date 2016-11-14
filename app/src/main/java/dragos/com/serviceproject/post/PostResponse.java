package dragos.com.serviceproject.post;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by java2 on 11/14/2016.
 */

public class PostResponse implements Serializable{

    @SerializedName("items")
 private    ArrayList<Post> posts = new ArrayList<>();

    public ArrayList<Post> getPosts() {
        return posts;
    }

    public void setPosts(ArrayList<Post> posts) {
        this.posts = posts;
    }
}
