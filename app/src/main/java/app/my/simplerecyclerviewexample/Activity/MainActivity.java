package app.my.simplerecyclerviewexample.Activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

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
    private LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        itemList = new ArrayList<>();
        handler = new Handler();

        itemList.add(new Item("Outdoors", "https://cdn.pixabay.com/photo/2021/08/23/08/28/path-6567149_960_720.jpg"));
        itemList.add(new Item("Island", "https://cdn.pixabay.com/photo/2021/08/01/12/58/beach-6514331_960_720.jpg"));
        itemList.add(new Item("Nature/Landscapes", "https://cdn.pixabay.com/photo/2021/08/25/07/23/nature-6572635_960_720.jpg"));
        itemList.add(new Item("Building Design", "https://cdn.pixabay.com/photo/2020/12/22/16/30/art-5852645_960_720.jpg"));
        itemList.add(new Item("Animals", "https://cdn.pixabay.com/photo/2021/08/22/08/54/bird-6564593_960_720.jpg"));
        itemList.add(new Item("Software Developer", "https://cdn.pixabay.com/photo/2021/08/04/13/06/software-developer-6521720_960_720.jpg"));
        itemList.add(new Item("Boy", "https://cdn.pixabay.com/photo/2021/08/20/03/57/boy-6559419_960_720.jpg"));
        itemList.add(new Item("St Petersburg", "https://cdn.pixabay.com/photo/2020/01/30/12/27/st-petersburg-4805295_960_720.jpg"));
        itemList.add(new Item("Cat", "https://cdn.pixabay.com/photo/2021/08/24/01/44/cat-6569156_960_720.jpg"));
        itemList.add(new Item("Mountains", "https://cdn.pixabay.com/photo/2021/08/14/04/15/mountains-6544522_960_720.jpg"));
        itemList.add(new Item("Close Up", "https://cdn.pixabay.com/photo/2021/06/10/21/21/hop-6327065_960_720.jpg"));
        itemList.add(new Item("Castle", "https://cdn.pixabay.com/photo/2021/08/23/07/38/castle-6566978_960_720.jpg"));
        itemList.add(new Item("Nature", "https://cdn.pixabay.com/photo/2021/08/01/12/58/beach-6514331_960_720.jpg"));
        itemList.add(new Item("Kid", "https://cdn.pixabay.com/photo/2021/08/22/15/39/kid-6565461_960_720.jpg"));
        itemList.add(new Item("Little girl with toy", "https://cdn.pixabay.com/photo/2014/09/16/01/19/girl-447701_960_720.jpg"));
        itemList.add(new Item("Color in hand, Kid", "https://cdn.pixabay.com/photo/2018/03/03/06/26/girl-3194977_960_720.jpg"));
        itemList.add(new Item("Woman", "https://cdn.pixabay.com/photo/2018/06/18/02/03/woman-3481756_960_720.jpg"));

        binding.rvMain.setHasFixedSize(true);
        linearLayoutManager = new LinearLayoutManager(this);
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
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = new MenuInflater(this);
        menuInflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.linearLayout:
                binding.rvMain.setLayoutManager(linearLayoutManager);
                break;
            case R.id.gridLayout:
                GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
                binding.rvMain.setLayoutManager(gridLayoutManager);
                break;
            case R.id.staggeredLayout:
                StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2,
                        StaggeredGridLayoutManager.VERTICAL);
                binding.rvMain.setLayoutManager(staggeredGridLayoutManager);
                break;
        }
        return true;
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