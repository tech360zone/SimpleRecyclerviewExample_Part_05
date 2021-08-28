package app.my.simplerecyclerviewexample.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.List;

import app.my.simplerecyclerviewexample.Model.Item;
import app.my.simplerecyclerviewexample.R;

public class AdapterPerson extends RecyclerView.Adapter<AdapterPerson.PersonViewHolder> {

    private Context context;
    private List<Item> itemList;

    public AdapterPerson(Context context, List<Item> itemList) {
        this.context = context;
        this.itemList = itemList;
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
        Item item = itemList.get(position);
        holder.tvName.setText(item.getName());
        holder.ivPicture.setImageResource(item.getPicture());
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
        }
    }
}
