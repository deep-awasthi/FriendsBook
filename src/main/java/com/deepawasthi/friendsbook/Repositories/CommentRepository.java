package com.deepawasthi.friendsbook.Repositories;

import com.deepawasthi.friendsbook.Entities.CommentEntity;
import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.List;
import java.util.UUID;

public interface CommentRepository extends CassandraRepository<CommentEntity, UUID> {

    @AllowFiltering
    List<CommentEntity> findAllByPostId(UUID postId);
}
