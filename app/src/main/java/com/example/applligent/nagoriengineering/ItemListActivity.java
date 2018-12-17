package com.example.applligent.nagoriengineering;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;

import com.example.applligent.nagoriengineering.databinding.ActivityItemListBinding;

public class ItemListActivity extends AppCompatActivity {
    ActivityItemListBinding binding;
    ItemDao itemDao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_list);
        itemDao = MyNagoriApplication.getDatabase().itemDao();
        binding = DataBindingUtil.setContentView(this, R.layout.activity_item_list);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
