package com.example.doeit;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

/*public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

}*/

class MyViewHolder extends RecyclerView.ViewHolder{

    ImageView recImage;
    TextView recTile, recDesc, recStatus;
    CardView recCard;
    public MyViewHolder(@NonNull View itemView) {
        super(itemView);

        recImage = itemView.findViewById(R.id.recImage);
        recCard = itemView.findViewById(R.id.recCard);
        recImage = itemView.findViewById(R.id.recImage);
        recImage = itemView.findViewById(R.id.recImage);

    }
}