package ru.netology.domain;

public class DataPost {
    private int publicationDataOrTime;
    private boolean showPublicationDateOrTime;

    public int getPublicationDataOrTime() {
        return publicationDataOrTime;
    }

    public void setPublicationDataOrTime(int publicationDataOrTime) {
        this.publicationDataOrTime = publicationDataOrTime;
    }

    public boolean isShowPublicationDateOrTime() {
        return showPublicationDateOrTime;
    }

    public void setShowPublicationDateOrTime(boolean showPublicationDateOrTime) {
        this.showPublicationDateOrTime = showPublicationDateOrTime;
    }
}
