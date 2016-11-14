package dragos.com.serviceproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.zip.Inflater;

import dragos.com.serviceproject.comments.Comments;
import dragos.com.serviceproject.post.Post;

/**
 * Created by java2 on 11/10/2016.
 */

public class ServiceAdapter extends BaseAdapter {
    Context context;
    ArrayList<User> users;
    ArrayList<Comments> comments = new ArrayList<>();
    ArrayList<Post> posts = new ArrayList<>();

    public ServiceAdapter(Context context, ArrayList<Post> posts) {
        this.context = context;
        this.posts = posts;
    }

    @Override
    public int getCount() {
        return posts.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
//    public View getView(int i, View view, ViewGroup viewGroup) {
//        if (view == null) {
//            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//            view = inflater.inflate(R.layout.whatever, viewGroup, false);
//            TextView textView = (TextView) view.findViewById(R.id.text_list);
//            textView.setText(i + "     " + comments.get(i).getScore());
//        }
//
//
//        return view;
//    }
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.whatever, viewGroup, false);
            TextView textView = (TextView) view.findViewById(R.id.text_list);
            textView.setText(i + "     " + posts.get(i).getLink());
        }

        return view;
    }


}
