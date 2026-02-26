package com.example.playstorews;
import java.util.List;

public class ParentItem {
    String title;
    List<ChildItem> childItems;
   // List<Banner> banners;

    public  ParentItem(String title, List<ChildItem> childItems){
        this.title = title;
        this.childItems = childItems;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<ChildItem> getChildItems() {
        return childItems;
    }

    public void setChildItems(List<ChildItem> childItems) {
        this.childItems = childItems;
    }

//    public List<Banner> getBanners() {
//        return banners;
//    }
//
//    public void setBanners(List<Banner> banners) {
//        this.banners = banners;
//    }
}
