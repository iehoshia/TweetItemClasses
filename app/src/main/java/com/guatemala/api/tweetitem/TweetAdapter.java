package com.guatemala.api.tweetitem;

import android.app.Activity;
import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by API on 01/06/2015.
 */
public class TweetAdapter extends ArrayAdapter<Tweet>{

    private LayoutInflater inflater;
    private TextView textView;

    public TweetAdapter(Activity activity, ArrayList<Tweet> articulos) {
        super(activity, R.layout.tweet, articulos);
        inflater = activity.getWindow().getLayoutInflater();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        Tweet tweet = getItem(position);
        if (convertView==null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.tweet, parent, false);
        }
        TextView tTitulo = (TextView) convertView.findViewById(R.id.titulo);
        tTitulo.setText(tweet.title);
        return convertView;
    }
}
