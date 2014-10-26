package com.omar.selftastic.app;

import android.location.Location;
import android.view.inputmethod.ExtractedText;

import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by paro on 10/26/14.
 */
public class Friends {
    static Location currentLocation = null;
    static long currentTime = 0;
    static ExtractedText myUser = new ExtractedText();
    static ExtractedText myShh; // the user's passcode
    ArrayList<FriendNode> friends = new ArrayList<FriendNode>();

    public class FriendNode {
        String name;
        ArrayList<String> challenged;
        ArrayList<String> received;


        public FriendNode() {
            try {
                //connect to our db server
                HttpClient httpclient = new DefaultHttpClient();
                HttpPost httppost = new HttpPost("http://152.23.22.21");

                List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>(2);
                nameValuePairs.add(new BasicNameValuePair("myUser", "myShh"));
                nameValuePairs.add(new BasicNameValuePair("sessionid", "234")); // ??!!!????!!!!from where do I get the session id?
                httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));


            } catch (Exception e) {
            }


        }
    }
}
