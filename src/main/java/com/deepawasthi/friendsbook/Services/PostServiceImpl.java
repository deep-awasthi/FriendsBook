package com.deepawasthi.friendsbook.Services;

import com.deepawasthi.friendsbook.Entities.PostEntity;
import com.deepawasthi.friendsbook.Repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    PostRepository postRepository;

    @Override
    public List<PostEntity> submitPostToDb(PostEntity post) {
        Date date = new Date();
        long time = date.getTime();
        Timestamp timestamp = new Timestamp(time);
        post.setPostId(UUID.randomUUID());
        post.setLikes(0);
        post.setTimestamp(timestamp);

        postRepository.save(post);

        List<PostEntity> results = postRepository.findAll();
        return results;
    }

    @Override
    public List<PostEntity> retrieveAllPostsFromDb() {
        List<PostEntity> results = postRepository.findAll();
        return results;
    }

    @Override
    public List<PostEntity> deletePostFromDb(UUID postId) {
        postRepository.deleteById(postId);
        return postRepository.findAll();
    }
}
