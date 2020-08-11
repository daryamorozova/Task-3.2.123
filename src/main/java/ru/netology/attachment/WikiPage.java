package ru.netology.attachment;

public class WikiPage {
    private int id;
    private int groupId;
    private int creatorId;
    private String title;
    private boolean currentUserCanEdit;
    private boolean currentUserCanEditAccess;
    private int[] whoCanView = {0,1,2};
    private int[] whoCanEdit = {0,1,2};
    private int edited;
    private int created;
    private int editorId;
    private int views;
    private String parent;
    private String parent2;
    private String source;
    private String html;
    private String viewUrl;

}
