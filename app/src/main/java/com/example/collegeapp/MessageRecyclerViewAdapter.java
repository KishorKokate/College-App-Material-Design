package com.example.collegeapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MessageRecyclerViewAdapter extends RecyclerView.Adapter<MessageRecyclerViewAdapter.MessageRecyclerViewHolder> {

    ArrayList<MessageHelperClass> MessageviewLocation;

    public MessageRecyclerViewAdapter(ArrayList<MessageHelperClass> messageviewLocation) {
        MessageviewLocation = messageviewLocation;
    }

    @NonNull
    @Override
    public MessageRecyclerViewAdapter.MessageRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.message_card_design, parent, false);
        MessageRecyclerViewHolder messageRecyclerViewHolder = new MessageRecyclerViewHolder(view);
        return messageRecyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MessageRecyclerViewAdapter.MessageRecyclerViewHolder holder, int position) {

        MessageHelperClass messageHelperClass=MessageviewLocation.get(position);
        holder.mtitle.setText(messageHelperClass.getmTitle());
        holder.mdescription.setText(messageHelperClass.getmDesc());
        holder.msender.setText(messageHelperClass.getmSender());
        holder.mdate.setText(messageHelperClass.getmDate());


    }

    @Override
    public int getItemCount() {
        return MessageviewLocation.size();
    }

    public class MessageRecyclerViewHolder extends RecyclerView.ViewHolder {
        TextView mtitle, mdescription, msender, mdate;

        public MessageRecyclerViewHolder(@NonNull View itemView) {
            super(itemView);

            mtitle = itemView.findViewById(R.id.message_title);
            mdescription = itemView.findViewById(R.id.message_description);
            msender = itemView.findViewById(R.id.sender_name);
            mdate = itemView.findViewById(R.id.message_date);


        }
    }
}
