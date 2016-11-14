package com.example.daniel.w4d4_homework;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MediaPlayerActivity extends AppCompatActivity {

    private static final String TAG = "MediaPlayerTAG_";
    MediaPlayer mPlayer;

    Button strBtn;
    Button stpBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media_player);

        strBtn = (Button) findViewById(R.id.mp_btnPlay);
        stpBtn = (Button) findViewById(R.id.mp_btnStop);

        Log.d(TAG, "onCreate: ");
    }

    public void doStart(View view) {
        mPlayer = MediaPlayer.create(this, R.raw.withoutyou);
        mPlayer.start();
    }

    public void doStop(View view) {
        if(mPlayer!= null && mPlayer.isPlaying()){
            mPlayer.stop();
        }
    }
}
