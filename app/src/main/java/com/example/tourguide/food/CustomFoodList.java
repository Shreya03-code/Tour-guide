package com.example.tourguide.food;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tourguide.R;

public class CustomFoodList extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] food;
    private final Integer[] imageId;

    public CustomFoodList(Activity context,String[] food,Integer[] imageId){

        super(context, R.layout.custom_listview,food);
        this.context = context;
        this.food = food;
        this.imageId = imageId;

    }

    @Override
    public View getView (int position, View view, ViewGroup parent){
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.custom_listview,null,true);
        TextView txtTitle = rowView.findViewById(R.id.txt);
        ImageView imageView = rowView.findViewById(R.id.img);

        txtTitle.setText(food[position]);
        imageView.setImageResource(imageId[position]);

        rowView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,RowFoodActivity.class);
                intent.putExtra("kfood",food[position]);
                context.startActivity(intent);
            }
        });

        return rowView;
    }

}
