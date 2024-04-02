package com.deepawasthi.friendsbook.Services;

import com.deepawasthi.friendsbook.Entities.StatusEntity;

import java.util.List;
import java.util.UUID;

public interface StatusService {
    public StatusEntity createStatus(StatusEntity status);
    public List<StatusEntity> retieveAllStatus();
    public String deleteStatusById(UUID statusId);
}
