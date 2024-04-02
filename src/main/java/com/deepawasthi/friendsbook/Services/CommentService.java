package com.deepawasthi.friendsbook.Services;

import com.deepawasthi.friendsbook.Entities.CommentEntity;

import java.util.List;
import java.util.UUID;

public interface CommentService {
    public CommentEntity createComment(CommentEntity comment);
    public List<CommentEntity> getAllComments(UUID postId);
    public String deleteCommentById(UUID commentId);
}
