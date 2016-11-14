package dragos.com.serviceproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import dragos.com.serviceproject.comments.Comments;
import dragos.com.serviceproject.comments.CommentsResponse;
import dragos.com.serviceproject.post.Post;
import dragos.com.serviceproject.post.PostResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<User> users = new ArrayList<>();
    ArrayList<Comments> comments = new ArrayList<>();
    ArrayList<Post> posts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.list);

        init();


    }


    void setListener() {
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                RestClient.getApi().getPosts(comments.get(i).getPost_id()).enqueue(new Callback<PostResponse>() {
                    @Override
                    public void onResponse(Call<PostResponse> call, Response<PostResponse> response) {
                        Log.d("Print", "ion");
                        posts = (response.body().getPosts());
                     posts.get(0).getLink();
                        Log.d("printing",  posts.get(0).getLink());

                    }

                    @Override
                    public void onFailure(Call<PostResponse> call, Throwable t) {

                    }
                });


            }
        });

    }

    private void init() {
//        RestClient.getApi().getUser(100,"name").enqueue(new Callback<UserResponse>() {
//            @Override
//            public void onResponse(Call<UserResponse> call, Response<UserResponse> response) {
//                Log.d("Print", "gica");
//                users = (response.body().getItems());
//                ServiceAdapter adapter = new ServiceAdapter(MainActivity.this, users);
//                listView.setAdapter(adapter);
//            }
//
//            @Override
//            public void onFailure(Call<UserResponse> call, Throwable t) {
//
//            }
//        });

        RestClient.getApi().getComments(30, 5, "votes").enqueue(new Callback<CommentsResponse>() {
            @Override
            public void onResponse(Call<CommentsResponse> call, Response<CommentsResponse> response) {
                Log.d("Print", "ion");
                comments = (response.body().getComments());
                ServiceAdapter commentAdapter = new ServiceAdapter(MainActivity.this, posts);
                listView.setAdapter(commentAdapter);

            }

            @Override
            public void onFailure(Call<CommentsResponse> call, Throwable t) {

            }
        });


    }


}
