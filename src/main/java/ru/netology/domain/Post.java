package ru.netology.domain;

public class Post {
    private int id;
    private CommentsInfo commentsInfo;
    private PinnedRecordInfo pinnedRecordInfoInfo;
    private RepostInfo repostInfo;
    private ReplyInfo replyInfo;
    private int datePost;
    private String textInfo;
    private String copyright;
    private String geoInfo;
    private int likesInfo;
    private String SourceInfo;
    private String imagePost;
    private String ownerId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public PinnedRecordInfo getPinnedInfo() {
        return pinnedRecordInfoInfo;
    }

    public void setPinnedInfo(PinnedRecordInfo pinnedInfo) {
        this.pinnedRecordInfoInfo = pinnedInfo;
    }

    public RepostInfo getRepostInfo() {
        return repostInfo;
    }

    public void setRepostInfo(RepostInfo repostInfo) {
        this.repostInfo = repostInfo;
    }

    public ReplyInfo getReplyInfo() {
        return replyInfo;
    }

    public void setReplyInfo(ReplyInfo replyInfo) {
        this.replyInfo = replyInfo;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerPost(String ownerId) {
        this.ownerId = ownerId;
    }

    public int getDatePost() {
        return datePost;
    }

    public void setDatePost(int datePost) {
        this.datePost = datePost;
    }

    public String getTextInfo() {
        return textInfo;
    }

    public void setTextInfo(String textInfo) {
        this.textInfo = textInfo;
    }

    public String getImagePost() {
        return imagePost;
    }

    public void setImagePost(String imagePost) {
        this.imagePost = imagePost;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public String getGeoInfo() {
        return geoInfo;
    }

    public void setGeoInfo(String geoInfo) {
        this.geoInfo = geoInfo;
    }

    public int getLikesInfo() {
        return likesInfo;
    }

    public void setLikesInfo(int likesInfo) {
        this.likesInfo = likesInfo;
    }

    public String getSourceInfo() {
        return SourceInfo;
    }

    public void setSourceInfo(String sourceInfo) {
        SourceInfo = sourceInfo;
    }
}
