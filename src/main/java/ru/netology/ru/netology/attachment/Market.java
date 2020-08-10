package ru.netology.ru.netology.attachment;

public class Market {
    private int id;
    private int ownerId;
    private String title;
    private String description;
    private Price price;
    private Dimensions dimensions;
    private int weight;
    private Category category;
    private String thumbPhoto;
    private int date;
    private int[] availability = {0,1,2};
    private boolean favorite;


}
