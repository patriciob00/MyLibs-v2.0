package com.mycompany.mylibs.classes;

/**
 * Created by patriciobruno on 01/07/16.
 */

public class friend {
    public int user_id;
    public int friend_id;
    public String friend_name;
    public String friend_img;

    public friend() {
    }

    public friend(int user_id, int friend_id, String friend_name, String friend_img) {
        this.user_id = user_id;
        this.friend_id = friend_id;
        this.friend_name = friend_name;
        this.friend_img = friend_img;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getFriend_id() {
        return friend_id;
    }

    public void setFriend_id(int friend_id) {
        this.friend_id = friend_id;
    }

    public String getFriend_name() {
        return friend_name;
    }

    public void setFriend_name(String friend_name) {
        this.friend_name = friend_name;
    }

    public String getFriend_img() {
        return friend_img;
    }

    public void setFriend_img(String friend_img) {
        this.friend_img = friend_img;
    }
}
