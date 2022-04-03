package com.example.humanbody;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class HBAdapter extends ArrayAdapter<humanbody> {
    List <humanbody>HBlist;
    public HBAdapter ( @NonNull Context context, int resource, @NonNull List<humanbody> objects ) {
        super(context, resource, objects);
        HBlist = objects;

    }

    @NonNull
    @Override
    public View getView ( int position, @Nullable View convertView, @NonNull ViewGroup parent ) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.bodylist, parent, false);
        humanbody currentHB =HBlist.get(position);

        TextView shapeNameTextView = view.findViewById(R.id.item1_name);
        ImageView shapeImageTextView = view.findViewById(R.id.item1_image);
        TextView price = view.findViewById(R.id.price_);

        shapeNameTextView.setText(currentHB.getItemName());
        shapeImageTextView.setImageResource(currentHB.getItemImage());
        price.setText (currentHB.getItemPrice()+"");



        ImageView icon= view.findViewById(R.id.delete);

        icon.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                HBlist.remove(position);
                notifyDataSetChanged();
            }
        });

        return view;

    }

}
