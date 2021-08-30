package app.my.simplerecyclerviewexample.Interface;

import android.view.MenuItem;

import app.my.simplerecyclerviewexample.Model.Item;

public interface RvItemClick {
    void onClickItem(Item item);
    void onRvMenuItem(int position, MenuItem menuItem, Item item);
}
