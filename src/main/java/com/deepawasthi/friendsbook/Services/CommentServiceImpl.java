package com.deepawasthi.friendsbook.Services;

import com.deepawasthi.friendsbook.Entities.CommentEntity;
import com.deepawasthi.friendsbook.Repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class CommentServiceImpl implements CommentService{

    @Autowired
    CommentRepository commentRepository;

    @Override
    public CommentEntity createComment(CommentEntity comment) {
        Date date = new Date();
        long time = date.getTime();
        Timestamp commentTime = new Timestamp(time);
        comment.setCommentId(UUID.randomUUID());
        comment.setCommentTime(commentTime);
        return commentRepository.save(comment);
    }

    @Override
    public List<CommentEntity> getAllComments(UUID postId) {
        return commentRepository.findAllByPostId(postId);
    }

    @Override
    public String deleteCommentById(UUID commentId) {
        commentRepository.deleteById(commentId);
        return "Comment Deleted Successfully";
    }
}
