package com.avensys.rts.industryservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/***
 * @author Koh He Xiang
 * This is the entity class for the industry table in the database
 */
@Entity
@Table(name = "industry")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class IndustryEntity {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name", length = 50, unique = true )
    private String name;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "parent_industry_id" , referencedColumnName = "id")
    private IndustryEntity parentIndustry;

    public IndustryEntity(String name, IndustryEntity parentIndustry) {
        this.name = name;
        this.parentIndustry = parentIndustry;
    }
}
