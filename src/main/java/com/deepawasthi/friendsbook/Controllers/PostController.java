package com.deepawasthi.friendsbook.Controllers;

import com.deepawasthi.friendsbook.Entities.PostEntity;
import com.deepawasthi.friendsbook.Services.PostServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/postService")
public class PostController {

    @Autowired
    PostServiceImpl postService;

    @PostMapping("/save")
    public List<PostEntity> submitPost(@RequestBody PostEntity post){
        return postService.submitPostToDb(post);
    }

    @GetMapping("/getPosts")
    public List<PostEntity> retrieveAllPosts(){
        List<PostEntity> results  = postService.retrieveAllPostsFromDb();
        results.sort((e1, e2)->e1.getTimestamp().compareTo(e2.getTimestamp()));
        return results;
    }

    @DeleteMapping("/delete/{postId}")
    public List<PostEntity> deletePost(@PathVariable("postId") UUID postId){
        return postService.deletePostFromDb(postId);
    }
}
