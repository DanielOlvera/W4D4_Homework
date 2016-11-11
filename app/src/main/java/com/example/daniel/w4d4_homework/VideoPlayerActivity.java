package com.example.daniel.w4d4_homework;

import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoPlayerActivity extends AppCompatActivity {

    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_player);

        videoView = (VideoView) findViewById(R.id.mvp_videoVw);

        //Creating media controller
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);

        //media location
        Uri uri = Uri.parse("android.resource://com.example.daniel.w4d4_homework/"+R.raw.punkiert_processing);
        //videoView.setVideoPath("http://www.ebookfrenzy.com/android_book/movie.mp4");
        videoView.setVideoURI(uri);
        videoView.start();

    }
}

/*
Reference:
    http://www.imaginaformacion.com/reproduccion-de-video-desde-raw-en-android/
    http://www.javatpoint.com/playing-video-in-android-example
 */