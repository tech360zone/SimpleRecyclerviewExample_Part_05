package app.my.simplerecyclerviewexample.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.os.Bundle;

import app.my.simplerecyclerviewexample.databinding.ActivityDetailsBinding;

public class DetailsActivity extends AppCompatActivity {

    private ActivityDetailsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        binding = ActivityDetailsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String name = bundle.getString("name");
            int picture = bundle.getInt("picture");

            binding.tvDName.setText(name);
            binding.ivDPicture.setImageResource(picture);
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return super.onSupportNavigateUp();
    }
}