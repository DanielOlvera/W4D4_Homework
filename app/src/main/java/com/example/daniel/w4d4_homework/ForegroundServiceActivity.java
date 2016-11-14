package com.example.daniel.w4d4_homework;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class ForegroundServiceActivity extends AppCompatActivity {

    Button fgsBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foreground_service);

        fgsBtn = (Button) findViewById(R.id.fs_frgrndSrvce);

        fgsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent service = new Intent(ForegroundServiceActivity.this, ForegroundService.class);
                if (!ForegroundService.IS_SERVICE_RUNNING) {
                    service.setAction(Constants.ACTION.STARTFOREGROUND_ACTION);
                    ForegroundService.IS_SERVICE_RUNNING = true;
                    fgsBtn.setText("Stop Service");
                } else {
                    service.setAction(Constants.ACTION.STOPFOREGROUND_ACTION);
                    ForegroundService.IS_SERVICE_RUNNING = false;
                    fgsBtn.setText("Start Service");

                }
                startService(service);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }
}
