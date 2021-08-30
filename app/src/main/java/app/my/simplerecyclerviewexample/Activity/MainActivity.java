package app.my.simplerecyclerviewexample.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

import app.my.simplerecyclerviewexample.Adapter.AdapterPerson;
import app.my.simplerecyclerviewexample.Interface.RvItemClick;
import app.my.simplerecyclerviewexample.Model.Item;
import app.my.simplerecyclerviewexample.R;
import app.my.simplerecyclerviewexample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements RvItemClick {

    private ActivityMainBinding binding;
    private List<Item> itemList;
    private AdapterPerson adapter;
    private Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        itemList = new ArrayList<>();
        handler = new Handler();

        itemList.add(new Item("Elon Mask", "https://cdn.pixabay.com/photo/2021/08/01/12/58/beach-6514331_960_720.jpg"));
        itemList.add(new Item("Elon Mask", "https://cdn.pixabay.com/photo/2021/08/01/12/58/beach-6514331_960_720.jpg"));
        itemList.add(new Item("Elon Mask", "https://cdn.pixabay.com/photo/2021/08/01/12/58/beach-6514331_960_720.jpg"));
        itemList.add(new Item("Elon Mask", "https://cdn.pixabay.com/photo/2021/08/01/12/58/beach-6514331_960_720.jpg"));
        itemList.add(new Item("Elon Mask", "https://cdn.pixabay.com/photo/2021/08/01/12/58/beach-6514331_960_720.jpg"));
        itemList.add(new Item("Elon Mask", "https://cdn.pixabay.com/photo/2021/08/01/12/58/beach-6514331_960_720.jpg"));
        itemList.add(new Item("Elon Mask", "https://cdn.pixabay.com/photo/2021/08/01/12/58/beach-6514331_960_720.jpg"));
        itemList.add(new Item("Elon Mask", "https://cdn.pixabay.com/photo/2021/08/01/12/58/beach-6514331_960_720.jpg"));
        itemList.add(new Item("Elon Mask", "https://cdn.pixabay.com/photo/2021/08/01/12/58/beach-6514331_960_720.jpg"));
        itemList.add(new Item("Elon Mask", "https://cdn.pixabay.com/photo/2021/08/01/12/58/beach-6514331_960_720.jpg"));
        itemList.add(new Item("Tech360Zone", "https://cdn.pixabay.com/photo/2021/08/01/12/58/beach-6514331_960_720.jpg"));
        itemList.add(new Item("Elon Mask", "https://cdn.pixabay.com/photo/2021/08/01/12/58/beach-6514331_960_720.jpg"));
        itemList.add(new Item("Elon Mask", "https://cdn.pixabay.com/photo/2021/08/01/12/58/beach-6514331_960_720.jpg"));
        itemList.add(new Item("Elon Mask", "https://cdn.pixabay.com/photo/2021/08/01/12/58/beach-6514331_960_720.jpg"));
        itemList.add(new Item("Elon Mask", "https://cdn.pixabay.com/photo/2021/08/01/12/58/beach-6514331_960_720.jpg"));
        itemList.add(new Item("Elon Mask", "https://cdn.pixabay.com/photo/2021/08/01/12/58/beach-6514331_960_720.jpg"));
        itemList.add(new Item("Elon Mask", "https://cdn.pixabay.com/photo/2021/08/01/12/58/beach-6514331_960_720.jpg"));
        itemList.add(new Item("Elon Mask", "https://cdn.pixabay.com/photo/2021/08/01/12/58/beach-6514331_960_720.jpg"));
        itemList.add(new Item("Elon Mask", "https://cdn.pixabay.com/photo/2021/08/01/12/58/beach-6514331_960_720.jpg"));
        itemList.add(new Item("Elon Mask", "https://cdn.pixabay.com/photo/2021/08/01/12/58/beach-6514331_960_720.jpg"));
        itemList.add(new Item("Elon Mask", "https://cdn.pixabay.com/photo/2021/08/01/12/58/beach-6514331_960_720.jpg"));
        itemList.add(new Item("Elon Mask", "https://cdn.pixabay.com/photo/2021/08/01/12/58/beach-6514331_960_720.jpg"));
        itemList.add(new Item("Elon Mask", "https://cdn.pixabay.com/photo/2021/08/01/12/58/beach-6514331_960_720.jpg"));
        itemList.add(new Item("Elon Mask", "https://cdn.pixabay.com/photo/2021/08/01/12/58/beach-6514331_960_720.jpg"));
        itemList.add(new Item("Elon Mask", "https://cdn.pixabay.com/photo/2021/08/01/12/58/beach-6514331_960_720.jpg"));
        itemList.add(new Item("Elon Mask", "https://cdn.pixabay.com/photo/2021/08/01/12/58/beach-6514331_960_720.jpg"));
        itemList.add(new Item("Elon Mask", "https://cdn.pixabay.com/photo/2021/08/01/12/58/beach-6514331_960_720.jpg"));
        itemList.add(new Item("Elon Mask", "https://cdn.pixabay.com/photo/2021/08/01/12/58/beach-6514331_960_720.jpg"));
        itemList.add(new Item("Elon Mask", "https://cdn.pixabay.com/photo/2021/08/01/12/58/beach-6514331_960_720.jpg"));
        itemList.add(new Item("Elon Mask", "https://cdn.pixabay.com/photo/2021/08/01/12/58/beach-6514331_960_720.jpg"));
        itemList.add(new Item("Elon Mask", "https://cdn.pixabay.com/photo/2021/08/01/12/58/beach-6514331_960_720.jpg"));
        itemList.add(new Item("Elon Mask", "https://cdn.pixabay.com/photo/2021/08/01/12/58/beach-6514331_960_720.jpg"));
        itemList.add(new Item("Elon Mask", "https://cdn.pixabay.com/photo/2021/08/01/12/58/beach-6514331_960_720.jpg"));
        itemList.add(new Item("Elon Mask", "https://cdn.pixabay.com/photo/2021/08/01/12/58/beach-6514331_960_720.jpg"));
        itemList.add(new Item("Elon Mask", "https://cdn.pixabay.com/photo/2021/08/01/12/58/beach-6514331_960_720.jpg"));
        itemList.add(new Item("Elon Mask", "https://cdn.pixabay.com/photo/2021/08/01/12/58/beach-6514331_960_720.jpg"));
        itemList.add(new Item("Elon Mask", "https://cdn.pixabay.com/photo/2021/08/01/12/58/beach-6514331_960_720.jpg"));
        itemList.add(new Item("Elon Mask", "https://cdn.pixabay.com/photo/2021/08/01/12/58/beach-6514331_960_720.jpg"));
        itemList.add(new Item("Elon Mask", "https://cdn.pixabay.com/photo/2021/08/01/12/58/beach-6514331_960_720.jpg"));
        itemList.add(new Item("Elon Mask", "https://cdn.pixabay.com/photo/2021/08/01/12/58/beach-6514331_960_720.jpg"));
        itemList.add(new Item("Elon Mask", "https://cdn.pixabay.com/photo/2021/08/01/12/58/beach-6514331_960_720.jpg"));
        itemList.add(new Item("Elon Mask", "https://cdn.pixabay.com/photo/2021/08/01/12/58/beach-6514331_960_720.jpg"));
        itemList.add(new Item("Elon Mask", "https://cdn.pixabay.com/photo/2021/08/01/12/58/beach-6514331_960_720.jpg"));
        itemList.add(new Item("Elon Mask", "https://cdn.pixabay.com/photo/2021/08/01/12/58/beach-6514331_960_720.jpg"));
        itemList.add(new Item("Elon Mask", "https://cdn.pixabay.com/photo/2021/08/01/12/58/beach-6514331_960_720.jpg"));
        itemList.add(new Item("Elon Mask", "https://cdn.pixabay.com/photo/2021/08/01/12/58/beach-6514331_960_720.jpg"));
        itemList.add(new Item("Elon Mask", "https://cdn.pixabay.com/photo/2021/08/01/12/58/beach-6514331_960_720.jpg"));
        itemList.add(new Item("Elon Mask", "https://cdn.pixabay.com/photo/2021/08/01/12/58/beach-6514331_960_720.jpg"));
        itemList.add(new Item("Elon Mask", "https://cdn.pixabay.com/photo/2021/08/01/12/58/beach-6514331_960_720.jpg"));
        itemList.add(new Item("Elon Mask", "https://cdn.pixabay.com/photo/2021/08/01/12/58/beach-6514331_960_720.jpg"));
        itemList.add(new Item("Elon Mask", "https://cdn.pixabay.com/photo/2021/08/01/12/58/beach-6514331_960_720.jpg"));
        itemList.add(new Item("Elon Mask", "https://cdn.pixabay.com/photo/2021/08/01/12/58/beach-6514331_960_720.jpg"));
        itemList.add(new Item("Elon Mask", "https://cdn.pixabay.com/photo/2021/08/01/12/58/beach-6514331_960_720.jpg"));
        itemList.add(new Item("Elon Mask", "https://cdn.pixabay.com/photo/2021/08/01/12/58/beach-6514331_960_720.jpg"));
        itemList.add(new Item("Elon Mask", "https://cdn.pixabay.com/photo/2021/08/01/12/58/beach-6514331_960_720.jpg"));

        binding.rvMain.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        binding.rvMain.setLayoutManager(linearLayoutManager);
        adapter = new AdapterPerson(this, itemList, this);
        binding.rvMain.setAdapter(adapter);

        binding.rvMain.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(@NonNull @NotNull RecyclerView recyclerView, int newState) {
                if (newState == RecyclerView.SCROLL_STATE_IDLE) {
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            binding.ivTopBtn.setVisibility(View.GONE);
                        }
                    }, 3000);
                }
            }

            @Override
            public void onScrolled(@NonNull @NotNull RecyclerView recyclerView, int dx, int dy) {
                if (dy > 0) {
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            binding.ivTopBtn.setVisibility(View.GONE);
                        }
                    }, 3000);
                } else if (dy < 0) {
                    binding.ivTopBtn.setVisibility(View.VISIBLE);
                }
            }
        });

        binding.ivTopBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.rvMain.smoothScrollToPosition(0);
            }
        });
    }

    @Override
    public void onClickItem(Item item) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra("name", item.getName());
        intent.putExtra("picture", item.getPicture());
        startActivity(intent);
    }

    @Override
    public void onRvMenuItem(int position, MenuItem menuItem, Item item) {
        switch (menuItem.getItemId()) {
            case R.id.edit:
                Toast.makeText(this, item.getName(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.delete:
                itemList.remove(position);
                adapter.notifyItemRemoved(position);
                break;
        }
    }
}