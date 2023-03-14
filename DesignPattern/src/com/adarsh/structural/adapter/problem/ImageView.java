package com.adarsh.structural.adapter.problem;

public class ImageView {
    private Image image;

    public ImageView(Image image) {
        this.image = image;
    }

    public void applyFilter(Filter filter){
        filter.apply(image);
    }
}
