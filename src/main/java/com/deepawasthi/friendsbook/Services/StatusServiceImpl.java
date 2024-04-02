package com.deepawasthi.friendsbook.Services;

import com.deepawasthi.friendsbook.Entities.StatusEntity;
import com.deepawasthi.friendsbook.Repositories.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class StatusServiceImpl implements StatusService{

    @Autowired
    StatusRepository statusRepository;

    @Override
    public StatusEntity createStatus(StatusEntity status) {
        Date date = new Date();
        long time = date.getTime();
        Timestamp uploadTime = new Timestamp(time);
        status.setUploadTime(uploadTime);
        status.setStatusId(UUID.randomUUID());
        return statusRepository.save(status);
    }

    @Override
    public List<StatusEntity> retieveAllStatus() {
        List<StatusEntity> results = statusRepository.findAll();
        results.sort((e1, e2)->e1.getUploadTime().compareTo(e2.getUploadTime()));
        return results;
    }

    @Override
    public String deleteStatusById(UUID statusId) {
        statusRepository.deleteById(statusId);
        return "Status Deleted Successfully";
    }
}
