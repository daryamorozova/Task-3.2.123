package ru.netology.ru.netology.attachment;

import java.util.prefs.BackingStoreException;

public class Poll {
    private int id;
    private int ownerId;
    private int created;
    private String question;
    private int votes;
    private Answer answer;
    private boolean anononimus;
    private boolean multiple;
    private int endDate;
    private boolean closed;
    private boolean isBoard;
    private boolean canEdit;
    private boolean canVote;
    private boolean canReport;
    private boolean canShare;
    private int authorId;
    private Photo photo;
    private Backgroung backgroung;


}
