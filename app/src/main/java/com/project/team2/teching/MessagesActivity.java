package com.project.team2.teching;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MessagesActivity extends AppCompatActivity {

    private ImageButton back_button;
    private RecyclerView mRecyclerView;
    private RecyclerView mRecyclerView_recent_viewed;
    private ArrayList<User> mUsersDaata;
    private Recent_Messaged_User_Adapter mAdapter;
    private Recent_Viewed_Adapter mAdapter_recent_viewed;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messages);


        back_button = findViewById(R.id.back_button);

        // Initialize the RecyclerView.
        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView_recent_viewed = findViewById(R.id.recyclerView_for_recent_profile);



        // Set the Layout Manager.
        mRecyclerView.setLayoutManager(new GridLayoutManager(this, 1));
        mRecyclerView_recent_viewed.setLayoutManager(
                new GridLayoutManager(this, 1, GridLayoutManager.HORIZONTAL, false));


        // Initialize the ArrayList that will contain the data.
        mUsersDaata = new ArrayList<>();

        // Initialize the adapter and set it to the RecyclerView.
        mAdapter = new Recent_Messaged_User_Adapter(this, mUsersDaata);
        mAdapter_recent_viewed = new Recent_Viewed_Adapter(this, mUsersDaata);


        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView_recent_viewed.setAdapter(mAdapter_recent_viewed);


        initializeData();



        back_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });



    }


    private void initializeData() {
        // Get the resources from the XML file.
        String[] nameList = getResources()
                .getStringArray(R.array.name);

        TypedArray imageResources =
                getResources().obtainTypedArray(R.array.userImages);

        String[] bioList = getResources()
                .getStringArray(R.array.bio);




        // Clear the existing data (to avoid duplication).
        mUsersDaata.clear();

        // Create the ArrayList of meals objects with titles and
        // information about each sport.
        for(int i=0;i<nameList.length;i++){
            mUsersDaata.add(new User(nameList[i],imageResources.getResourceId(i,0),bioList[i]));
        }

        // Notify the adapter of the change.
        mAdapter.notifyDataSetChanged();
    }



}
