package com.example.tracetogether.Application.Vaccination;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SearchView;

import com.example.tracetogether.Data.Model.Vaccination_Record;
import com.example.tracetogether.R;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;

public class MohViewAppt extends AppCompatActivity {

    RecyclerView rv;
    MyAdapter myAdapter;

    //view function
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.moh_view_appt);

        rv = findViewById(R.id.vacList);
        rv.setLayoutManager(new LinearLayoutManager(this));

        FirebaseRecyclerOptions<Vaccination_Record> options = new FirebaseRecyclerOptions.Builder<Vaccination_Record>()
                .setQuery(FirebaseDatabase.getInstance().getReference().child("patient_list"), Vaccination_Record.class)
                .build();

        myAdapter = new MyAdapter(options);
        myAdapter.startListening();
        rv.setAdapter(myAdapter);
    }

    //search function
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.search,menu);
        MenuItem item = menu.findItem(R.id.search);
        SearchView searchView = (SearchView)item.getActionView();

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                txtSearch(query);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String query) {
                txtSearch(query);
                return false;
            }
        });

        return super.onCreateOptionsMenu(menu);
    }

    //search function
    private void txtSearch(String str) {
        FirebaseRecyclerOptions<Vaccination_Record> options = new FirebaseRecyclerOptions.Builder<Vaccination_Record>()
                .setQuery(FirebaseDatabase.getInstance().getReference().child("patient_list").orderByChild("ic").startAt(str).endAt(str+"~"), Vaccination_Record.class)
                .build();

        myAdapter = new MyAdapter(options);
        myAdapter.startListening(); //start taking the list into recyclerview
        rv.setAdapter(myAdapter);
    }
}