package com.example.playstorews;
public class ChildItem {
    int imageId;
    String text;
    String subtitle;

    public ChildItem(int imageId, String text,String subtitle){
        this.imageId= imageId;
        this.text = text;
        this.subtitle = subtitle;
    }


    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }
}
