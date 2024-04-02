package com.deepawasthi.friendsbook.Controllers;

import com.deepawasthi.friendsbook.Entities.StatusEntity;
import com.deepawasthi.friendsbook.Services.StatusServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/statusService")
public class StatusController {

    @Autowired
    StatusServiceImpl statusService;

    @PostMapping("/save")
    public StatusEntity createStatus(@RequestBody StatusEntity status){
        return statusService.createStatus(status);
    }

    @GetMapping("/allStatus")
    public List<StatusEntity> getAllStatus(){
        return statusService.retieveAllStatus();
    }

    @DeleteMapping("/delete/{statusId}")
    public String deleteStatusById(@PathVariable("statusId") UUID statusId){
        return statusService.deleteStatusById(statusId);
    }
}
