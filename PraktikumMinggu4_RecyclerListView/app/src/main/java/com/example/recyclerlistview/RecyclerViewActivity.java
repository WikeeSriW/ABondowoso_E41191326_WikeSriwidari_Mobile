package com.example.recyclerlistview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {

    private MahasiswaAdapter mAdapter;
    private RecyclerView rvMahasiswa;
    private ArrayList<Mahasiswa> mahasiswaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        addData();

        rvMahasiswa = findViewById(R.id.rv_mahasiswa);

        mAdapter = new MahasiswaAdapter(mahasiswaArrayList);
        rvMahasiswa.setLayoutManager(new LinearLayoutManager(this));
        rvMahasiswa.setAdapter(mAdapter);
    }

    private void addData() {
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("Wike", "E41191326", "085432344655"));
        mahasiswaArrayList.add(new Mahasiswa("Rara", "E41190868", "082545673765"));
        mahasiswaArrayList.add(new Mahasiswa("Nabila", "E41190860", "083456765465"));
        mahasiswaArrayList.add(new Mahasiswa("Anggun", "E41192090", "085678765433"));
        mahasiswaArrayList.add(new Mahasiswa("Tasya", "E41192010", "082765467653"));
        mahasiswaArrayList.add(new Mahasiswa("Keira", "E41193010", "085432345654"));
        mahasiswaArrayList.add(new Mahasiswa("Pinky", "E41194509", "082675654324"));
    }
}