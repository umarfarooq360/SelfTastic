package com.omar.selftastic.app;

import java.util.ArrayList;

/**
 * Created by paro on 10/26/14.
 */
public class Friends {
    ArrayList<FriendNode> friends = new ArrayList<FriendNode>();

    public class FriendNode {
        String name;
        ArrayList<String> challenged;// do we need a list?
        ArrayList<String> received;// do we need a list?

    }
}
