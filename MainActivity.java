package com.example.lmadmin.week9_firebase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference personRef = database.getReference("March 28th");
    private DatabaseReference peopleRef = database.getReference("Additional People");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void set(View view) {
        personRef.setValue(new Person("Adele", 36, true));
    }

    public void add(View view) {
        peopleRef.push().setValue(new Person("Jason", 30, true));
    }
}
