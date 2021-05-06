package com.example.collegeapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AnnouncementAdapter extends RecyclerView.Adapter<AnnouncementAdapter.AnnouncementViewholder> implements Filterable {

    ArrayList<AnnoncementHelperClass> annoncementHelperClassArrayList;
    ArrayList<AnnoncementHelperClass> backup;
    Context context;

    public AnnouncementAdapter(ArrayList<AnnoncementHelperClass> annoncementHelperClassArrayList, Context context) {
        this.annoncementHelperClassArrayList = annoncementHelperClassArrayList;
        this.context = context;
        backup = new ArrayList<>(annoncementHelperClassArrayList);
    }



    @NonNull
    @Override
    public AnnouncementAdapter.AnnouncementViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.announcement_card_design, parent, false);
        return new AnnouncementViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AnnouncementAdapter.AnnouncementViewholder holder, int position) {
        final AnnoncementHelperClass temp = annoncementHelperClassArrayList.get(position);

        AnnoncementHelperClass annoncementHelperClass = annoncementHelperClassArrayList.get(position);

        holder.Acategory.setText(annoncementHelperClass.getCategory());
        holder.Adate.setText(annoncementHelperClass.getDate());
        holder.Atitle.setText(annoncementHelperClass.getAnnoncetitle());

        holder.Atitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, AnnouncementNextPage.class);

                intent.putExtra("Title", temp.getAnnoncetitle());
                intent.putExtra("Date", temp.getDate());
                intent.putExtra("Description", temp.getDescription());
                intent.putExtra("Uploader", temp.getUploadername());
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

                context.startActivity(intent);
            }
        });


    }


    @Override
    public int getItemCount() {
        return annoncementHelperClassArrayList.size();
    }


    public class AnnouncementViewholder extends RecyclerView.ViewHolder {
        TextView Acategory, Adate, Atitle;

        public AnnouncementViewholder(@NonNull View itemView) {
            super(itemView);
            Acategory = itemView.findViewById(R.id.announcement_category);
            Adate = itemView.findViewById(R.id.announcement_date);
            Atitle = itemView.findViewById(R.id.announcement_title);

        }
    }

    @Override
    public Filter getFilter() {

        return filter;
    }

    Filter filter = new Filter() {
        @Override
        //
        protected FilterResults performFiltering(CharSequence keyword) {
            ArrayList<AnnoncementHelperClass> filtereddata = new ArrayList<>();
            if (keyword.toString().isEmpty()) {
                filtereddata.addAll(backup);
            } else {
                for (AnnoncementHelperClass obj : backup) {
                    if (obj.getAnnoncetitle().toString().toLowerCase().contains(keyword.toString().toLowerCase()))
                        filtereddata.add(obj);
                }
            }
            FilterResults results = new FilterResults();
            results.values = filtereddata;
            return results;
        }

        @Override
        protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
            annoncementHelperClassArrayList.clear();
            annoncementHelperClassArrayList.addAll((ArrayList<AnnoncementHelperClass>) filterResults.values);
            notifyDataSetChanged();
        }
    };


}
