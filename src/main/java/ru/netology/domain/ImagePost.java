package ru.netology.domain;

public class ImagePost {
    private String imageUrl;
    private boolean canImageSet;
    private boolean canImageDelete;

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public boolean isCanImageSet() {
        return canImageSet;
    }

    public void setCanImageSet(boolean canImageSet) {
        this.canImageSet = canImageSet;
    }

    public boolean isCanImageDelete() {
        return canImageDelete;
    }

    public void setCanImageDelete(boolean canImageDelete) {
        this.canImageDelete = canImageDelete;
    }
}
