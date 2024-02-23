package com.avensys.rts.industryservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/***
 * @author Koh He Xiang This is the entity class for the industry table in the
 *         database
 */
@Entity
@Table(name = "industry")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class IndustryEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "name", length = 50, unique = true)
	private String name;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "parent_industry_id", referencedColumnName = "id")
	private IndustryEntity parentIndustry;

	public IndustryEntity(String name, IndustryEntity parentIndustry) {
		this.name = name;
		this.parentIndustry = parentIndustry;
	}
}
