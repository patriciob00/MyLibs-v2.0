package com.mycompany.mylibs.classes;

/**
 * Created by patriciobruno on 29/06/16.
 */

public class item {

    public int _id;
    public int user_id;
    public int category_id;
    public int collection_id;
    public String title;
    public float quantity;
    public float price;
    public boolean sellAvailable;

    public item() {
    }

    public item(int _id, int user_id, int category_id, int collection_id, String title, float quantity, float price, boolean sellAvailable) {
        this._id = _id;
        this.user_id = user_id;
        this.category_id = category_id;
        this.collection_id = collection_id;
        this.title = title;
        this.quantity = quantity;
        this.price = price;
        this.sellAvailable = sellAvailable;
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

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public int getCollection_id() {
        return collection_id;
    }

    public void setCollection_id(int collection_id) {
        this.collection_id = collection_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isSellAvailable() {
        return sellAvailable;
    }

    public void setSellAvailable(boolean sellAvailable) {
        this.sellAvailable = sellAvailable;
    }
}
