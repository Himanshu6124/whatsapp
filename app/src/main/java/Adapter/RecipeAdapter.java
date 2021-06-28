package Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewneetroots.R;

import java.util.ArrayList;

import Models.RecipeModel;

public class RecipeAdapter extends RecyclerView.Adapter<RecipeAdapter.viewHolder>
{
    ArrayList<RecipeModel> list;
    Context context;

    public RecipeAdapter(ArrayList<RecipeModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull

    @Override
    public viewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.sample_recyclarview,parent,false);

        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  RecipeAdapter.viewHolder holder, int position) {

        RecipeModel model =  list.get(position);
        holder.textView.setText(model.getText());
        holder.imageView.setImageResource(model.getPic());


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder
    {
        ImageView imageView;
        TextView textView;



        public viewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById((R.id.imageview));
            textView = itemView.findViewById((R.id.textView));


        }
    }
}
