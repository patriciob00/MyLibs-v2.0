package com.mycompany.mylibs.classes;

import java.util.Date;

/**
 * Created by patriciobruno on 29/06/16.
 */

public class message {

    public int _id;
    public int user_id;
    public int id_receiver;
    public String title;
    public String body;
    public boolean status;
    public Date date;
    public int item_id;

    public message() {
    }

    public message(int _id, int user_id, int id_receiver, String title, String body, boolean status, Date date, int item_id) {
        this._id = _id;
        this.user_id = user_id;
        this.id_receiver = id_receiver;
        this.title = title;
        this.body = body;
        this.status = status;
        this.date = date;
        this.item_id = item_id;
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

    public int getId_receiver() {
        return id_receiver;
    }

    public void setId_receiver(int id_receiver) {
        this.id_receiver = id_receiver;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getItem_id() {
        return item_id;
    }

    public void setItem_id(int item_id) {
        this.item_id = item_id;
    }
}
