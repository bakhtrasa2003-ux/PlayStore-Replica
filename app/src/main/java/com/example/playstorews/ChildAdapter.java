package com.example.playstorews;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ChildAdapter extends RecyclerView.Adapter<ChildAdapter.ChildViewHolder>
{
    List<ChildItem> childItemList;

    public ChildAdapter(List<ChildItem> childItemList) {
        this.childItemList = childItemList;
    }

    @NonNull
    @Override
    public ChildViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.child_item,null);
        return new ChildViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ChildViewHolder holder, int position) {
        ChildItem dataList = childItemList.get(position);
        holder.imageView.setImageResource(dataList.getImageId());
        holder.textView.setText(dataList.getText());
        holder.Subtitle.setText(dataList.getSubtitle());

    }

    @Override
    public int getItemCount() {
        return childItemList.size();
    }

    public static class ChildViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView textView, Subtitle;
        public ChildViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageview_child);
            textView = itemView.findViewById(R.id.textview_child);
            Subtitle = itemView.findViewById(R.id.Subtitle_child);
        }
    }
}