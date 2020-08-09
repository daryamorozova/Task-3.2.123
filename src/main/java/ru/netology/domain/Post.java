package ru.netology.domain;

public class Post {
    private int id;
    private String authorPost;
    private String timePost;

    private String textPost;

    private CommentPost commentPost;

    private AttachmentPost attachmentPost;

    private boolean postLike;
    private int countLikes;
    private int countComment;
    private int countRepost;
    private int countView;

    private SettingsPost settingsPost;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthorPost() {
        return authorPost;
    }

    public void setAuthorPost(String authorPost) {
        this.authorPost = authorPost;
    }

    public String getTimePost() {
        return timePost;
    }

    public void setTimePost(String timePost) {
        this.timePost = timePost;
    }

    public String getTextPost() {
        return textPost;
    }

    public void setTextPost(String textPost) {
        this.textPost = textPost;
    }

    public CommentPost getCommentPost() {
        return commentPost;
    }

    public void setCommentPost(CommentPost commentPost) {
        this.commentPost = commentPost;
    }

    public AttachmentPost getAttachmentPost() {
        return attachmentPost;
    }

    public void setAttachmentPost(AttachmentPost attachmentPost) {
        this.attachmentPost = attachmentPost;
    }

    public boolean isPostLike() {
        return postLike;
    }

    public void setPostLike(boolean postLike) {
        this.postLike = postLike;
    }

    public int getCountLikes() {
        return countLikes;
    }

    public void setCountLikes(int countLikes) {
        this.countLikes = countLikes;
    }

    public int getCountComment() {
        return countComment;
    }

    public void setCountComment(int countComment) {
        this.countComment = countComment;
    }

    public int getCountRepost() {
        return countRepost;
    }

    public void setCountRepost(int countRepost) {
        this.countRepost = countRepost;
    }

    public int getCountView() {
        return countView;
    }

    public void setCountView(int countView) {
        this.countView = countView;
    }

    public SettingsPost getSettingsPost() {
        return settingsPost;
    }

    public void setSettingsPost(SettingsPost settingsPost) {
        this.settingsPost = settingsPost;
    }
}
