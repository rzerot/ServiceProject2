package dragos.com.serviceproject;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by java2 on 11/10/2016.
 */

public class User implements Serializable {

@SerializedName("display_name")
    private String displayName;


    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
}
