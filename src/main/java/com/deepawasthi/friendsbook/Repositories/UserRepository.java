package com.deepawasthi.friendsbook.Repositories;

import com.deepawasthi.friendsbook.Entities.UserEntity;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.List;
import java.util.UUID;

public interface UserRepository extends CassandraRepository<UserEntity, UUID> {

}
