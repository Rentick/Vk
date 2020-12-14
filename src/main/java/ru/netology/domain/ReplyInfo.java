package ru.netology.domain;

public class ReplyInfo {
    private int replyOwnerId;
    private int replyPostId;
    private int canReply;

    public int getReplyOwnerId() {
        return replyOwnerId;
    }

    public void setReplyOwnerId(int replyOwnerId) {
        this.replyOwnerId = replyOwnerId;
    }

    public int getReplyPostId() {
        return replyPostId;
    }

    public void setReplyPostId(int replyPostId) {
        this.replyPostId = replyPostId;
    }

    public int getCanReply() {
        return canReply;
    }

    public void setCanReply(int canReply) {
        this.canReply = canReply;
    }
}
