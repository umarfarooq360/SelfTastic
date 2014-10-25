package com.omar.selftastic.app;


import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.hardware.Camera;
import android.hardware.Camera.CameraInfo;
import android.widget.Toast;

import java.io.File;

public class CallCamera extends Activity {

    private static final String TAG = "CallCamera";
    private static final int CAPTURE_IMAGE_ACTIVITY_REQ = 0;
    private Camera camera;
    int cameraId  =0 ;

    Uri fileUri = null;
    ImageView photoImage = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // cameraId = findFrontFacingCamera();

        camera = Camera.open(cameraId);

        if (cameraId < 0) {

            Toast.makeText(this, "No front facing camera found.",

                    Toast.LENGTH_LONG).show();

        }

    }




}

