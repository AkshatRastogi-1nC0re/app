package com.willowood.akshatrastogi.willowoodagri;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.akshatrastogi.willowoodagri.R;

import java.util.ArrayList;

public class CourseAdapter extends RecyclerView.Adapter<CourseAdapter.Viewholder> {

    private Context context;
    private ArrayList<CourseModel> courseModelArrayList;
    private OnNoteListener mOnNoteListener;

    // Constructor
    public CourseAdapter(Context context, ArrayList<CourseModel> courseModelArrayList, OnNoteListener onNoteListener) {
        this.context = context;
        this.courseModelArrayList = courseModelArrayList;
        this.mOnNoteListener = onNoteListener;
    }

    @NonNull
    @Override
    public CourseAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // to inflate the layout for each item of recycler view.
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout, parent, false);
        return new Viewholder(view, mOnNoteListener);
    }

    @Override
    public void onBindViewHolder(@NonNull CourseAdapter.Viewholder holder, int position) {
        // to set data to textview and imageview of each card layout
        CourseModel model = courseModelArrayList.get(position);
        holder.courseNameTV.setText(model.getCourse_name());
        holder.courseRatingTV.setText(model.getCourse_points());
    }

    @Override
    public int getItemCount() {
        // this method is used for showing number
        // of card items in recycler view.
        return courseModelArrayList.size();
    }



    // View holder class for initializing of
    // your views such as TextView and Imageview.
    public class Viewholder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView courseNameTV, courseRatingTV;
        OnNoteListener onNoteListener;

        public Viewholder(@NonNull View itemView, OnNoteListener onNoteListener) {
            super(itemView);
            courseNameTV = itemView.findViewById(R.id.heading_lool);
            courseRatingTV = itemView.findViewById(R.id.bodyas_lool);
            this.onNoteListener = onNoteListener;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            onNoteListener.onNoteClick(getAdapterPosition());
        }
    }

    public interface OnNoteListener{
        void onNoteClick(int position);
    }
}
