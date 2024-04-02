package com.deepawasthi.friendsbook.Controllers;

import com.deepawasthi.friendsbook.Entities.CommentEntity;
import com.deepawasthi.friendsbook.Services.CommentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/commentService")
public class CommentController {

    @Autowired
    CommentServiceImpl commentService;

    @PostMapping("/save")
    public CommentEntity createComment(@RequestBody CommentEntity comment){
        return commentService.createComment(comment);
    }

    @GetMapping("/getAllComment/{postId}")
    public List<CommentEntity> getAllComments(@PathVariable("postId") UUID postId){
        return commentService.getAllComments(postId);
    }

    @DeleteMapping("/delete/{commentId}")
    public String deleteComment(@PathVariable("commentId") UUID commentId){
        return commentService.deleteCommentById(commentId);
    }
}
