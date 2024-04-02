package com.deepawasthi.friendsbook.Entities;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.sql.Timestamp;
import java.util.UUID;

@Table("comments")
public class CommentEntity {

    @PrimaryKey
    private UUID commentId;
    private UUID postId;
    private UUID userId;
    private String userName;
    private String userImage;
    private Timestamp commentTime;

    public CommentEntity() {
    }

    public CommentEntity(UUID commentId, UUID postId, UUID userId, String userName, String userImage) {
        this.commentId = commentId;
        this.postId = postId;
        this.userId = userId;
        this.userName = userName;
        this.userImage = userImage;
        this.commentTime = commentTime;
    }

    public UUID getCommentId() {
        return commentId;
    }

    public void setCommentId(UUID commentId) {
        this.commentId = commentId;
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

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }

    public Timestamp getCommentTime(){
        return commentTime;
    }

    public void setCommentTime(Timestamp commentTime) {
        this.commentTime = commentTime;
    }
}
