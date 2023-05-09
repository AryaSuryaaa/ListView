package com.example.listview;

public class ItemList {
    private String judul, subjudul, imageUrl;

    public ItemList(String judul, String subjudul, String imageUrl) {
        this.judul = judul;
        this.subjudul = subjudul;
        this.imageUrl = imageUrl;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getSubjudul() {
        return subjudul;
    }

    public void setSubjudul(String subjudul) {
        this.subjudul = subjudul;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void add(ItemList itemList) {
    }
}
