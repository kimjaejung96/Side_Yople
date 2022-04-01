package com.map.mutual.side.world.repository;

import com.map.mutual.side.auth.repository.dsl.WorldUserMappingRepoDSL;
import com.map.mutual.side.world.repository.dsl.WorldUserMappingRepoDSL;
import com.map.mutual.side.world.model.entity.WorldUserMappingEntity;
import com.map.mutual.side.world.model.keys.WorldUserMappingEntityKeys;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface WorldUserMappingRepo extends JpaRepository<WorldUserMappingEntity, WorldUserMappingEntityKeys>, WorldUserMappingRepoDSL {
    Optional<WorldUserMappingEntity> findByWorldIdAndAndUserSuid(Long worldId, String userSuid);
    List<WorldUserMappingEntity> findByUserSuid(String userSuid);
    Optional<WorldUserMappingEntity> findByWorldIdAndUserSuid(Long worldId, String userSuid);
}