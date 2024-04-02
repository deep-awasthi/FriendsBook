package com.deepawasthi.friendsbook.Repositories;

import com.deepawasthi.friendsbook.Entities.PostEntity;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface PostRepository extends CassandraRepository<PostEntity, UUID> {

}
