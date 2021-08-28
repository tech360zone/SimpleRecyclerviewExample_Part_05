package app.my.simplerecyclerviewexample.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import app.my.simplerecyclerviewexample.Adapter.AdapterPerson;
import app.my.simplerecyclerviewexample.Model.Item;
import app.my.simplerecyclerviewexample.R;
import app.my.simplerecyclerviewexample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private List<Item> itemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        itemList = new ArrayList<>();

        Item item1 = new Item("Elon Musk", R.drawable.elon_musk);
        itemList.add(item1);

        Item item2 = new Item("Jeff Bezos", R.drawable.jeff_bezos);
        itemList.add(item2);

        Item item3 = new Item("Mukesh Ambani", R.drawable.mukesh_ambani);
        itemList.add(item3);

        Item item4 = new Item("Ratan Tata", R.drawable.ratan_tata);
        itemList.add(item4);

        Item item5 = new Item("Bill Gates", R.drawable.bill_gates);
        itemList.add(item5);

        Item item6 = new Item("Mark Zuckerberg", R.drawable.mark_zuckerberg);
        itemList.add(item6);

        Item item7 = new Item("Alia Bhatt", R.drawable.alia_bhatt);
        itemList.add(item7);

        Item item8 = new Item("Anushka Sharma", R.drawable.anushka_sharma);
        itemList.add(item8);

        Item item9 = new Item("Katrina Kaiff", R.drawable.katrina_kaiff);
        itemList.add(item9);

        Item item10 = new Item("Shraddha Kapoor", R.drawable.shraddha_kapoor);
        itemList.add(item10);

        binding.rvMain.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        binding.rvMain.setLayoutManager(linearLayoutManager);
        AdapterPerson adapter = new AdapterPerson(this, itemList);
        binding.rvMain.setAdapter(adapter);
    }
}