package com.example.android.miwok;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static com.example.android.miwok.R.id.textLayout;

/**
 * Created by Pallavi J on 08-03-2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    int  mColorResourceId;

    public WordAdapter(Context context, ArrayList<Word> wordlist, int colorResrcId){
        super(context,0,wordlist);
        mColorResourceId = colorResrcId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Word currentWord = getItem(position);

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_tem, parent, false);
        }
        View textContainer = listItemView.findViewById( textLayout );
        //int color = ContextCompat.getColor(getContext(),mColorResourceId);
        textContainer.setBackgroundResource(mColorResourceId);

        TextView defaultWord = (TextView) listItemView.findViewById(R.id.defaultTextView);
        defaultWord.setText(currentWord.getDefaultTranslation());
        TextView miwokWord = (TextView) listItemView.findViewById(R.id.miwokTextView);
        miwokWord.setText(currentWord.getMiwokTranslation());
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.imageView);
        if( currentWord.hasImage()){
            imageView.setImageResource(currentWord.getImageResrcID());
            imageView.setVisibility(View.VISIBLE);
        }else{
            imageView.setVisibility(View.GONE);
        }

        return listItemView;
    }
}
