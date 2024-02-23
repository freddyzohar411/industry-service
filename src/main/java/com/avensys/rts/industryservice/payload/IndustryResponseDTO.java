package com.avensys.rts.industryservice.payload;

import com.avensys.rts.industryservice.entity.IndustryEntity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * author: Koh He Xiang This is the DTO class for the Industry response
 */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class IndustryResponseDTO {
	private int id;
	private String name;
	private IndustryEntity industry;
}
