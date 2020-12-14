package ru.netology.domain;

public class PinnedRecordInfo {
    private int canPinRecord;
    private int canDelete;
    private int canEdit;
    private int markedAsAds;
    private boolean isFavorite;

    public int getCanPinRecord() {
        return canPinRecord;
    }

    public void setCanPinRecord(int canPinRecord) {
        this.canPinRecord = canPinRecord;
    }

    public int getCanDelete() {
        return canDelete;
    }

    public void setCanDelete(int canDelete) {
        this.canDelete = canDelete;
    }

    public int getCanEdit() {
        return canEdit;
    }

    public void setCanEdit(int canEdit) {
        this.canEdit = canEdit;
    }

    public int getMarkedAsAds() {
        return markedAsAds;
    }

    public void setMarkedAsAds(int markedAsAds) {
        this.markedAsAds = markedAsAds;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }
}
