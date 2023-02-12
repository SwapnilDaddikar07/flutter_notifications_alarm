package com.example.flutter_notifications_alarm;

import io.flutter.embedding.android.FlutterActivity;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends FlutterActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        System.out.println(intent.toString());
    }
}
