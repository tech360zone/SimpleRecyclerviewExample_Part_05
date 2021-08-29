package app.my.simplerecyclerviewexample.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import org.jetbrains.annotations.NotNull;

import java.util.List;

import app.my.simplerecyclerviewexample.Activity.DetailActivity;
import app.my.simplerecyclerviewexample.Interface.RvItemClick;
import app.my.simplerecyclerviewexample.Model.Item;
import app.my.simplerecyclerviewexample.R;

public class AdapterPerson extends RecyclerView.Adapter<AdapterPerson.PersonViewHolder> {

    private final Context context;
    private final List<Item> itemList;
    private RvItemClick rvItemClick;

    public AdapterPerson(Context context, List<Item> itemList, RvItemClick rvItemClick) {
        this.context = context;
        this.itemList = itemList;
        this.rvItemClick = rvItemClick;
    }

    @NonNull
    @NotNull
    @Override
    public PersonViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_row_layout, parent, false);
        return new PersonViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull AdapterPerson.PersonViewHolder holder, int position) {
        ((PersonViewHolder) holder).bindData(itemList.get(position));
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public class PersonViewHolder extends RecyclerView.ViewHolder {

        ImageView ivPicture;
        TextView tvName;

        public PersonViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);

            ivPicture = itemView.findViewById(R.id.ivPicture);
            tvName = itemView.findViewById(R.id.tvName);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    rvItemClick.onClickItem(itemList.get(getAdapterPosition()));
                }
            });
        }

        public void bindData(Item item) {
            tvName.setText(item.getName());
            Glide.with(context).load(item.getPicture()).into(ivPicture);
        }
    }
}
