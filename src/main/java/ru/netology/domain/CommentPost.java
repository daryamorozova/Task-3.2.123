package ru.netology.domain;

public class CommentPost {
    private String commentPost;
    private String replyCommentPost;
    private boolean canCloseCommentPost;
    private boolean canOpenCommentPost;


    public String getCommentPost() {
        return commentPost;
    }

    public void setCommentPost(String commentPost) {
        this.commentPost = commentPost;
    }

    public String getReplyCommentPost() {
        return replyCommentPost;
    }

    public void setReplyCommentPost(String replyCommentPost) {
        this.replyCommentPost = replyCommentPost;
    }

    public boolean isCanCloseCommentPost() {
        return canCloseCommentPost;
    }

    public void setCanCloseCommentPost(boolean canCloseCommentPost) {
        this.canCloseCommentPost = canCloseCommentPost;
    }

    public boolean isCanOpenCommentPost() {
        return canOpenCommentPost;
    }

    public void setCanOpenCommentPost(boolean canOpenCommentPost) {
        this.canOpenCommentPost = canOpenCommentPost;
    }
}
