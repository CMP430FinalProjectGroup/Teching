package com.project.team2.teching.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.project.team2.teching.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class UserProfileActivity extends AppCompatActivity {

    private ImageButton back_button;
    private TextView name_TV;
    private CircleImageView userImage_IV;
    private TextView bio_TV;
    private Button messageBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);

        name_TV = findViewById(R.id.name);
        userImage_IV =findViewById(R.id.bio_profile_image);
        bio_TV =findViewById(R.id.bio_Textbox);
        messageBox=findViewById(R.id.nextBtn_messageBox);

        back_button = findViewById(R.id.back_button);

        //receive data from intent
        int image_Received=getIntent().getIntExtra("image_resource",0);
        String name_Received=getIntent().getStringExtra("title");
        String bio_Received=getIntent().getStringExtra("bio");

        Glide.with(this).load(image_Received)
                .into(userImage_IV);
        name_TV.setText(name_Received);
        bio_TV.setText(bio_Received);

        messageBox.setOnClickListener(v -> {
            Intent intent = new Intent(UserProfileActivity.this, ChatActivity.class);
            intent.putExtra("title",name_Received);
            intent.putExtra("bio",bio_Received);
            intent.putExtra("image_resource", image_Received);
            startActivity(intent);
        });

        back_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}