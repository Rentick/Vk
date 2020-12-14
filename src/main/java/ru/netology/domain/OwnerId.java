package ru.netology.domain;

public class OwnerId {
    private int Id;
    private String ownerIdGroup;
    private String ownerIdPerson;
    private boolean overview;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getOwnerIdGroup() {
        return ownerIdGroup;
    }

    public void setOwnerIdGroup(String ownerIdGroup) {
        this.ownerIdGroup = ownerIdGroup;
    }

    public String getOwnerIdPerson() {
        return ownerIdPerson;
    }

    public void setOwnerIdPerson(String ownerIdPerson) {
        this.ownerIdPerson = ownerIdPerson;
    }

    public boolean isOverview() {
        return overview;
    }

    public void setOverview(boolean overview) {
        this.overview = overview;
    }
}
