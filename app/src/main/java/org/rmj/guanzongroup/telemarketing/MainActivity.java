package org.rmj.guanzongroup.telemarketing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView mobile_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mobile_list = findViewById(R.id.mobile_list);

        HashMap<Integer, String> contacts = new HashMap<>();
        contacts.put(R.mipmap.ic_contact_foreground, "09993095066");
        contacts.put(R.mipmap.ic_contact_foreground, "09275408234");
        contacts.put(R.mipmap.ic_contact_foreground, "09109756628");
        contacts.put(R.mipmap.ic_contact_foreground, "09436088821");

        List<HashMap<Integer, String>> list = new ArrayList<>();
        list.add(contacts);

        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(list, this);

        //mobile_list.setAdapter(recyclerViewAdapter);
        //mobile_list.setLayoutManager(new LinearLayoutManager(this));
    }
}