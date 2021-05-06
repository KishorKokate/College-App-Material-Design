package com.example.collegeapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HappeningAdapter extends RecyclerView.Adapter<HappeningAdapter.myviewholder> {
    ArrayList<Model> data;
    ArrayList<Model> backup;
    Context context;

    public HappeningAdapter(ArrayList<Model> data, Context context) {
        this.data = data;
        this.context = context;
        backup = new ArrayList<>(data);
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.happening_recycler_view, parent, false);
        return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {
        final Model temp = data.get(position);
        holder.t1.setText(data.get(position).getHeader());
        holder.img.setImageResource(data.get(position).getImgname());

        holder.t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, HappeningOnclickActivity.class);
                intent.putExtra("imagename", temp.getImgname());
                intent.putExtra("header", temp.getHeader());
                intent.putExtra("desc", temp.getDesc());
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

                context.startActivity(intent);
            }
        });

    }


    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class myviewholder extends RecyclerView.ViewHolder {

        ImageView img;
        TextView t1;

        public myviewholder(@NonNull View itemView) {
            super(itemView);
            img = (ImageView) itemView.findViewById(R.id.img);
            t1 = (TextView) itemView.findViewById(R.id.t1);

        }
    }


}
