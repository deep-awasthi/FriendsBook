package com.deepawasthi.friendsbook.Entities;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.sql.Timestamp;
import java.util.UUID;

@Table("status")
public class StatusEntity {

    @PrimaryKey
    private UUID statusId;
    private UUID userID;
    private String statusImageUrl;
    private Timestamp uploadTime;

    public StatusEntity() {
    }

    public StatusEntity(UUID statusId, UUID userID, String statusImageUrl, Timestamp uploadTime) {
        this.statusId = statusId;
        this.userID = userID;
        this.statusImageUrl = statusImageUrl;
        this.uploadTime = uploadTime;
    }

    public UUID getStatusId() {
        return statusId;
    }

    public void setStatusId(UUID statusId) {
        this.statusId = statusId;
    }

    public UUID getUserID() {
        return userID;
    }

    public void setUserID(UUID userID) {
        this.userID = userID;
    }

    public String getStatusImageUrl() {
        return statusImageUrl;
    }

    public void setStatusImageUrl(String statusImageUrl) {
        this.statusImageUrl = statusImageUrl;
    }

    public Timestamp getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Timestamp uploadTime) {
        this.uploadTime = uploadTime;
    }
}
