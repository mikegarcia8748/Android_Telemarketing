package org.rmj.guanzongroup.telemarketing;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.textview.MaterialTextView;

public class RecyclerViewHolder extends RecyclerView.ViewHolder{
    public ImageView imageView;
    public MaterialTextView textView;

    public RecyclerViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.contact_img);
        textView = itemView.findViewById(R.id.contact);
    }
}
