package com.mycompany.mylibs.classes;

/**
 * Created by patriciobruno on 29/06/16.
 */

public class category {

    public int _id;
    public int user_id;
    public String name;

    public category() {
    }

    public category(int _id, int user_id, String name) {
        this._id = _id;
        this.user_id = user_id;
        this.name = name;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
