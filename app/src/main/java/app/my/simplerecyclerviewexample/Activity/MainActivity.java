package app.my.simplerecyclerviewexample.Activity;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.recyclerview.widget.LinearLayoutManager;

import java.util.ArrayList;
import java.util.List;

import app.my.simplerecyclerviewexample.Adapter.AdapterPerson;
import app.my.simplerecyclerviewexample.Interface.RvItemClick;
import app.my.simplerecyclerviewexample.Model.Item;
import app.my.simplerecyclerviewexample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements RvItemClick {

    private ActivityMainBinding binding;
    private List<Item> itemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        itemList = new ArrayList<>();

        Item item1 = new Item(
                "Elon Musk",
                "https://cdn.pixabay.com/photo/2021/08/23/08/28/path-6567149_960_720.jpg");
        itemList.add(item1);

        Item item2 = new Item(
                "Jeff Bezos",
                "https://cdn.pixabay.com/photo/2021/06/05/13/10/kid-6312635_960_720.jpg");
        itemList.add(item2);

        Item item3 = new Item(
                "Mukesh Ambani",
                "https://cdn.pixabay.com/photo/2021/08/01/12/58/beach-6514331_960_720.jpg");
        itemList.add(item3);

        Item item4 = new Item(
                "Ratan Tata",
                "https://cdn.pixabay.com/photo/2021/08/25/07/23/nature-6572635_960_720.jpg");
        itemList.add(item4);

        Item item5 = new Item(
                "Bill Gates",
                "https://cdn.pixabay.com/photo/2021/07/30/17/58/dragonfly-6510395_960_720.jpg");
        itemList.add(item5);

        Item item6 = new Item(
                "Mark Zuckerberg",
                "https://cdn.pixabay.com/photo/2021/07/30/17/58/dragonfly-6510395_960_720.jpg");
        itemList.add(item6);

        Item item7 = new Item(
                "Alia Bhatt",
                "https://cdn.pixabay.com/photo/2021/08/20/03/57/boy-6559419_960_720.jpg");
        itemList.add(item7);

        Item item8 = new Item(
                "Anushka Sharma",
                "https://cdn.pixabay.com/photo/2021/08/04/13/06/software-developer-6521720_960_720.jpg");
        itemList.add(item8);

        Item item9 = new Item(
                "Katrina Kaiff",
                "https://cdn.pixabay.com/photo/2020/09/02/18/33/portland-head-light-5539153_960_720.jpg");
        itemList.add(item9);

        Item item10 = new Item(
                "Shraddha Kapoor",
                "https://cdn.pixabay.com/photo/2021/08/24/01/44/cat-6569156_960_720.jpg");
        itemList.add(item10);

        binding.rvMain.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        binding.rvMain.setLayoutManager(linearLayoutManager);
        AdapterPerson adapter = new AdapterPerson(this, itemList, this);
        binding.rvMain.setAdapter(adapter);
    }

    @Override
    public void onClickItem(Item item) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra("name", item.getName());
        intent.putExtra("picture", item.getPicture());
        startActivity(intent);
    }
}