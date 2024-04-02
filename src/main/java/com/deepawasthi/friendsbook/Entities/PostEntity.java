package com.deepawasthi.friendsbook.Entities;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.sql.Timestamp;
import java.util.UUID;

@Table("friendsbookposts")
public class PostEntity {

    @PrimaryKey
    private UUID postId;
    private UUID userId;
    private String userName;
    private String imageUrl;
    private String description;
    private String postImageUrl;
    private int likes;
    private Timestamp timestamp;

    public PostEntity(UUID postId, UUID userId, String userName, String imageUrl, String description, String postImageUrl, int likes, Timestamp timestamp) {
        this.postId = postId;
        this.userId = userId;
        this.userName = userName;
        this.imageUrl = imageUrl;
        this.description = description;
        this.postImageUrl = postImageUrl;
        this.likes = likes;
        this.timestamp = timestamp;
    }

    public PostEntity() {

    }

    public UUID getPostId() {
        return postId;
    }

    public void setPostId(UUID postId) {
        this.postId = postId;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPostImageUrl() {
        return postImageUrl;
    }

    public void setPostImageUrl(String postImageUrl) {
        this.postImageUrl = postImageUrl;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }
}
