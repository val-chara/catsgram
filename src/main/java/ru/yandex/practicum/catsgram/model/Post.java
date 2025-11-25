package ru.yandex.practicum.catsgram.model;

import java.time.Instant;

public class Post {
    private Long id;
    private Integer authorId;
    private String author;
    private String description;
    private String imageUrl;
    private Instant postDate;

    public Post() {
    }
    public Post(Long id, Integer authorId, String author, String description, String imageUrl, Instant postDate) {
        this.id = id;
        this.authorId = authorId;
        this.author = author;
        this.description = description;
        this.imageUrl = imageUrl;
        this.postDate = postDate;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Integer getAuthorId() {
        return authorId;
    }
    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getImageUrl() {
        return imageUrl;
    }
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
    public Instant getPostDate() {
        return postDate;
    }
    public void setPostDate(Instant postDate) {
        this.postDate = postDate;
    }
}