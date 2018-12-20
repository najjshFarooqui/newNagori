package com.example.applligent.nagoriengineering;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;

import com.example.applligent.nagoriengineering.databinding.ActivityCompanyDetailsBinding;

public class CompanyDetailsActivity extends AppCompatActivity {
    TableLayout tableLayout;
    Item item;
    ItemDao itemDao;
   ActivityCompanyDetailsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_company_details);
        itemDao= MyNagoriApplication.getDatabase().itemDao();
        binding=DataBindingUtil.setContentView(this, R.layout.activity_company_details);

    }
}
