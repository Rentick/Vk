package ru.netology.domain;

public class TextInfo {
    private String textPost;
    private boolean canSet;
    private boolean canDelete;
    private boolean canEdit;

    public String getTextPost() {
        return textPost;
    }

    public void setTextPost(String textPost) {
        this.textPost = textPost;
    }

    public boolean isCanSet() {
        return canSet;
    }

    public void setCanSet(boolean canSet) {
        this.canSet = canSet;
    }

    public boolean isCanDelete() {
        return canDelete;
    }

    public void setCanDelete(boolean canDelete) {
        this.canDelete = canDelete;
    }

    public boolean isCanEdit() {
        return canEdit;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }
}
