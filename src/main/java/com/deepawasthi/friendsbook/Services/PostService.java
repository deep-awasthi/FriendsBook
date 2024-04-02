package com.deepawasthi.friendsbook.Services;

import com.deepawasthi.friendsbook.Entities.PostEntity;

import java.util.List;
import java.util.UUID;

public interface PostService {

    public List<PostEntity> submitPostToDb(PostEntity post);
    public List<PostEntity> retrieveAllPostsFromDb();
    public List<PostEntity> deletePostFromDb(UUID postId);
}
