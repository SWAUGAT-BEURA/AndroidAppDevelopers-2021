package com.android.internshipprogram;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.WindowManager;

import com.android.internshipprogram.HelperClasses.HomeAdapter.CentralRecyclerAdapter;
import com.android.internshipprogram.HelperClasses.HomeAdapter.CentralRecyclerHelper;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView central_recycler;
    RecyclerView state_recycler;
    RecyclerView others_recycler;

    RecyclerView.Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        central_recycler=findViewById(R.id.central_recycler_view);
        state_recycler=findViewById(R.id.state_recycler_view);
        others_recycler=findViewById(R.id.others);
        central_recycler();
        state_recycler();
        others_recycler();
    }

    private void others_recycler() {
        others_recycler.setHasFixedSize(true);
        others_recycler.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        ArrayList<CentralRecyclerHelper> centralRecyclerHelpers=new ArrayList<>();
        centralRecyclerHelpers.add(new CentralRecyclerHelper(R.drawable.cbse,"CBSE",""));
        centralRecyclerHelpers.add(new CentralRecyclerHelper(R.drawable.it1,"Income Tax Department",""));
        centralRecyclerHelpers.add(new CentralRecyclerHelper(R.drawable.indianoil,"Indian Oil",""));
        centralRecyclerHelpers.add(new CentralRecyclerHelper(R.drawable.morth,"Ministry of Health and Human Resources",""));
        centralRecyclerHelpers.add(new CentralRecyclerHelper(R.drawable.adhar,"Aadhar card",""));
        adapter=new CentralRecyclerAdapter(centralRecyclerHelpers);
        others_recycler.setAdapter(adapter);
    }

    private void state_recycler() {
        state_recycler.setHasFixedSize(true);
        state_recycler.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        ArrayList<CentralRecyclerHelper> centralRecyclerHelpers=new ArrayList<>();
        centralRecyclerHelpers.add(new CentralRecyclerHelper(R.drawable.cbse,"CBSE",""));
        centralRecyclerHelpers.add(new CentralRecyclerHelper(R.drawable.it1,"Income Tax Department",""));
        centralRecyclerHelpers.add(new CentralRecyclerHelper(R.drawable.indianoil,"Indian Oil",""));
        centralRecyclerHelpers.add(new CentralRecyclerHelper(R.drawable.morth,"Ministry of Health and Human Resources",""));
        centralRecyclerHelpers.add(new CentralRecyclerHelper(R.drawable.adhar,"Aadhar card",""));

        adapter=new CentralRecyclerAdapter(centralRecyclerHelpers);
        state_recycler.setAdapter(adapter);
    }

    private void central_recycler() {
        central_recycler.setHasFixedSize(true);
        central_recycler.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        ArrayList<CentralRecyclerHelper> centralRecyclerHelpers=new ArrayList<>();
        centralRecyclerHelpers.add(new CentralRecyclerHelper(R.drawable.cbse,"CBSE",""));
        centralRecyclerHelpers.add(new CentralRecyclerHelper(R.drawable.it1,"Income Tax Department",""));
        centralRecyclerHelpers.add(new CentralRecyclerHelper(R.drawable.indianoil,"Indian Oil",""));
        centralRecyclerHelpers.add(new CentralRecyclerHelper(R.drawable.morth,"Ministry of Health and Human Resources",""));
        centralRecyclerHelpers.add(new CentralRecyclerHelper(R.drawable.adhar,"Aadhar card",""));

        adapter=new CentralRecyclerAdapter(centralRecyclerHelpers);
        central_recycler.setAdapter(adapter);


    }
}