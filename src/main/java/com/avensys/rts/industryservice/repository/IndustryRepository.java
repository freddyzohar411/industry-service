package com.avensys.rts.industryservice.repository;

import com.avensys.rts.industryservice.entity.IndustryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

/**
 * author: Koh He Xiang
 * This is the repository class for the Industry table in the database
 */
public interface IndustryRepository extends JpaRepository<IndustryEntity, Integer> {
    Optional<IndustryEntity> findByName(String name);

    @Query("SELECT i FROM IndustryEntity i WHERE i.parentIndustry IS NULL")
    List<IndustryEntity> findAllParentIndustries();

    @Query("SELECT i FROM IndustryEntity i WHERE i.parentIndustry IS NOT NULL")
    List<IndustryEntity> findAllSubIndustries();

    @Query("SELECT i FROM IndustryEntity i WHERE i.parentIndustry = ?1")
    List<IndustryEntity> findAllSubIndustriesByParentIndustry(IndustryEntity parentIndustry);
}
