package com.example.playstorews;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ParentAdapter extends RecyclerView.Adapter<ParentAdapter.ParentViewHolder> {

    List<ParentItem> parentItemsList;

    public ParentAdapter(List<ParentItem> parentItemsList) {
        this.parentItemsList = parentItemsList;
    }

    @NonNull
    @Override
    public ParentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.parent_recycleview,null);
        return new ParentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ParentViewHolder holder, int position) {
        var parentData =  parentItemsList.get(position);
        holder.textView.setText(parentData.getTitle());
        RecyclerView.LayoutManager LayoutManager = new LinearLayoutManager(holder.recyclerView.getContext(),LinearLayoutManager.HORIZONTAL,false);
        holder.recyclerView.setLayoutManager(LayoutManager);
        holder.recyclerView.setAdapter(new ChildAdapter(parentData.getChildItems()));
    }

    @Override
    public int getItemCount() {
        return parentItemsList.size();
    }

    public static class ParentViewHolder extends RecyclerView.ViewHolder{

        TextView textView;
        RecyclerView recyclerView;
        public ParentViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.parent_text);
            recyclerView = itemView.findViewById(R.id.parent_recycleview);
        }
    }
}