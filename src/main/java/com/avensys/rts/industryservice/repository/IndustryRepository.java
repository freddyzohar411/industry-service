package com.avensys.rts.industryservice.repository;

import com.avensys.rts.industryservice.entity.IndustryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * author: Koh He Xiang
 * This is the repository class for the Industry table in the database
 */
public interface IndustryRepository extends JpaRepository<IndustryEntity, Long> {
    Optional<IndustryEntity> findByName(String name);
}
