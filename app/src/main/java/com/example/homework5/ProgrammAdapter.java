package com.example.homework5;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

public class ProgrammAdapter extends RecyclerView.Adapter<ProgrammAdapter.ProgrammViewHolder> {

    private List<ProgrammLanguage> list = new ArrayList<>();
    private LayoutInflater inflater;
    private Context context;


     public ProgrammAdapter (Context context, List<ProgrammLanguage> list ){
              this.inflater = LayoutInflater.from(context);
              this.list = list;
              this.context = context;

     }

    @NonNull
    @Override
    public ProgrammViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_programm, parent, false);
        return new ProgrammViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProgrammViewHolder holder, int position) {
         holder.txtLanguages.setText(list.get(position).getName());
         holder.imLanguage.setImageResource(list.get(position).getImage());
          holder.itemView.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                   Intent intent = new Intent(context, SecondDesActivity.class);
                   intent.putExtra("name", list.get(position).getName());
//                   intent.putExtra("description", list.get(position).getDescription());
                   context.startActivity(intent);
              }
          });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ProgrammViewHolder extends RecyclerView.ViewHolder {

           TextView txtLanguages;
           ImageView imLanguage;



        public ProgrammViewHolder(@NonNull View itemView) {
            super(itemView);

            txtLanguages = itemView.findViewById(R.id.language_item);
            imLanguage = itemView.findViewById(R.id.im_java);


        }

//        public void bind(ProgrammLanguage programmLanguage) {
//            txtLanguages.setText(programmLanguage.getName());
//            imLanguage.setImageResource(programmLanguage.getImage());
//        }
//
    }
}
