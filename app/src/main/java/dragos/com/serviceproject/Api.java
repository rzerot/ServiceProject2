package dragos.com.serviceproject;

import dragos.com.serviceproject.comments.CommentsResponse;
import dragos.com.serviceproject.post.PostResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by java2 on 11/10/2016.
 */

public interface Api {

    @GET("users?site=stackoverflow")

    Call<UserResponse> getUser(@Query("pagesize") int pagesize ,@Query("sort") String sort);


    @GET("comments?site=stackoverflow")
    Call<CommentsResponse> getComments(@Query("pagesize") int pagesize, @Query("min") int min, @Query("sort") String sort);


    @GET("posts/{ids}?site=stackoverflow")
    Call<PostResponse> getPosts(@Path("ids") long ids);
}


