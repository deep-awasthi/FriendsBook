package com.deepawasthi.friendsbook.Entities;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.sql.Timestamp;
import java.util.UUID;

@Table("users")
public class UserEntity {

    @PrimaryKey
    private UUID usedId;
    private String userName;
    private String userImage;
    private Boolean active;
    private Timestamp joiningDate;

    public UserEntity() {
    }

    public UserEntity(UUID usedId, String userName, String userImage, Boolean active, Timestamp joiningDate) {
        this.usedId = usedId;
        this.userName = userName;
        this.userImage = userImage;
        this.active = active;
        this.joiningDate = joiningDate;
    }

    public UUID getUsedId() {
        return usedId;
    }

    public void setUsedId(UUID usedId) {
        this.usedId = usedId;
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

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Timestamp getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(Timestamp joiningDate) {
        this.joiningDate = joiningDate;
    }
}
