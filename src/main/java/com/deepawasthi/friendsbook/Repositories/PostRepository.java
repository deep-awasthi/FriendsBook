package com.deepawasthi.friendsbook.Repositories;

import com.deepawasthi.friendsbook.Entities.PostEntity;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.List;
import java.util.UUID;

public interface PostRepository extends CassandraRepository<PostEntity, UUID> {

}
