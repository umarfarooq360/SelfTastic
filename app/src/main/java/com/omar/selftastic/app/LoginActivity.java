package com.omar.selftastic.app;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.ExtractedTextRequest;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A login screen that offers login via email/password and via Google+ sign in.
 * <p/>
 * ************ IMPORTANT SETUP NOTES: ************
 * In order for Google+ sign in to work with your app, you must first go to:
 * https://developers.google.com/+/mobile/android/getting-started#step_1_enable_the_google_api
 * and follow the steps in "Step 1" to create an OAuth 2.0 client for your package.
 */
public class LoginActivity extends Activity {

    // UI references.
    private AutoCompleteTextView mEmailView;
    private EditText mPasswordView;
    private View mProgressView;
    private View mEmailLoginFormView;
    private View mSignOutButtons;
    private View mLoginFormView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Find the Google+ sign in button.
    }

    private void onLogin() {
        SharedPreferences sharedPref = this.getPreferences(Context.MODE_PRIVATE);
        // we take the username introduced
        TextView user = (TextView) findViewById(R.id.email);
        ExtractedTextRequest request = new ExtractedTextRequest();
        user.extractText(request, Friends.myUser);

        // we take the password introduced
        TextView pass = (TextView) findViewById(R.id.email);
        ExtractedTextRequest requestPass = new ExtractedTextRequest();
        pass.extractText(requestPass, Friends.myShh);

    }
}



