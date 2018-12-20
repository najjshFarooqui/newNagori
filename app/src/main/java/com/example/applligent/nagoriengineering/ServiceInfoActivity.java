package com.example.applligent.nagoriengineering;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.applligent.nagoriengineering.databinding.ActivityServiceInfoBinding;

public class ServiceInfoActivity extends AppCompatActivity {
    ItemDao itemDao;
    ActivityServiceInfoBinding binding;
    public int partsId;
    Item item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_info);
        itemDao = MyNagoriApplication.getDatabase().itemDao();
        binding = DataBindingUtil.setContentView(this, R.layout.activity_parts_info);
        partsId = getIntent().getIntExtra("parts_info", -1);

    }
    @Override
    protected void onResume() {
        super.onResume();
        item = itemDao.get(partsId);
        binding.setItem(item);
    }
}
