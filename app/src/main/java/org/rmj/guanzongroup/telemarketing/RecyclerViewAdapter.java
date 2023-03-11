package org.rmj.guanzongroup.telemarketing;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.HashMap;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {
    List<HashMap<Integer, String>> recyclerViewHolderList;
    Context context;

    public RecyclerViewAdapter(List<HashMap<Integer, String>> recyclerViewHolderList, Context context){
        this.recyclerViewHolderList = recyclerViewHolderList;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.layout_contact_no_list, parent, false);

        RecyclerViewHolder viewHolder = new RecyclerViewHolder(view);
        Log.d("HELLLOOO", "HELLOOOO");
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
        holder.imageView.setImageResource((Integer) recyclerViewHolderList.get(position).keySet().toArray()[position]);
        holder.textView.setText(recyclerViewHolderList.get(position).values().toArray()[position].toString());
    }

    @Override
    public int getItemCount() {
        return recyclerViewHolderList.size();
    }
}
