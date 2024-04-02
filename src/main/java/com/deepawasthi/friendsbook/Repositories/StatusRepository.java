package com.deepawasthi.friendsbook.Repositories;

import com.deepawasthi.friendsbook.Entities.StatusEntity;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface StatusRepository extends CassandraRepository<StatusEntity, UUID> {

}
