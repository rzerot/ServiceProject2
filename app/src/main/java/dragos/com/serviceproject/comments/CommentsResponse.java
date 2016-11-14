package dragos.com.serviceproject.comments;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by java2 on 11/10/2016.
 */

public class CommentsResponse implements Serializable {

    @SerializedName("items")
    private ArrayList<Comments> comments;

    public ArrayList<Comments> getComments() {
        return comments;
    }

    public void setComments(ArrayList<Comments> comments) {
        this.comments = comments;
    }
}
