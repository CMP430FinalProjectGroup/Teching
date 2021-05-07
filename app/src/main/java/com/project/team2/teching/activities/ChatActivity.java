package com.project.team2.teching.activities;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.project.team2.teching.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class ChatActivity extends AppCompatActivity {

    private ImageButton back_button;
    private TextView name_TV;
    private CircleImageView userImage_IV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_chat);


        name_TV = findViewById(R.id.name);
        userImage_IV =findViewById(R.id.bio_profile_image);
        back_button =findViewById(R.id.back_button);


        //receive data from intent
        int image_Received=getIntent().getIntExtra("image_resource",0);
        String name_Received=getIntent().getStringExtra("title");


        Glide.with(this).load(image_Received)
                .into(userImage_IV);
        name_TV.setText(name_Received);

        back_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });



    }
}