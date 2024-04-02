package com.deepawasthi.friendsbook.Repositories;

import com.deepawasthi.friendsbook.Entities.StatusEntity;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.UUID;

public interface StatusRepository extends CassandraRepository<StatusEntity, UUID> {

}
