package ru.netology.domain;

public class Post {
    private int id;

    private int ownerIdPost;
    private int fromIdPost;
    private int authorIdPost;

    private int timePost;

    private String textPost;

    private int replyOwnerId;
    private int replyPostId;

    private boolean onlyFriendsPost;

    private CommentPost commentPost;

    private AttachmentPost attachmentPost;

    private boolean postLike;
    private int countLikes;
    private int countComment;
    private int countRepost;
    private int countView;

    private SettingsPost settingsPost;

    private boolean isPinnedPost;
    private boolean isFavoritePost;

    private boolean canPinPost;
    private boolean canEditPost;
    private boolean canDeletePost;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOwnerIdPost() {
        return ownerIdPost;
    }

    public void setOwnerIdPost(int ownerIdPost) {
        this.ownerIdPost = ownerIdPost;
    }

    public int getFromIdPost() {
        return fromIdPost;
    }

    public void setFromIdPost(int fromIdPost) {
        this.fromIdPost = fromIdPost;
    }

    public int getAuthorIdPost() {
        return authorIdPost;
    }

    public void setAuthorIdPost(int authorIdPost) {
        this.authorIdPost = authorIdPost;
    }

    public int getTimePost() {
        return timePost;
    }

    public void setTimePost(int timePost) {
        this.timePost = timePost;
    }

    public String getTextPost() {
        return textPost;
    }

    public void setTextPost(String textPost) {
        this.textPost = textPost;
    }

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

    public boolean isOnlyFriendsPost() {
        return onlyFriendsPost;
    }

    public void setOnlyFriendsPost(boolean onlyFriendsPost) {
        this.onlyFriendsPost = onlyFriendsPost;
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

    public boolean isPinnedPost() {
        return isPinnedPost;
    }

    public void setPinnedPost(boolean pinnedPost) {
        isPinnedPost = pinnedPost;
    }

    public boolean isFavoritePost() {
        return isFavoritePost;
    }

    public void setFavoritePost(boolean favoritePost) {
        isFavoritePost = favoritePost;
    }

    public boolean isCanPinPost() {
        return canPinPost;
    }

    public void setCanPinPost(boolean canPinPost) {
        this.canPinPost = canPinPost;
    }

    public boolean isCanEditPost() {
        return canEditPost;
    }

    public void setCanEditPost(boolean canEditPost) {
        this.canEditPost = canEditPost;
    }

    public boolean isCanDeletePost() {
        return canDeletePost;
    }

    public void setCanDeletePost(boolean canDeletePost) {
        this.canDeletePost = canDeletePost;
    }
}


