package com.avensys.rts.industryservice.service;

import com.avensys.rts.industryservice.payload.IndustryResponseDTO;

import java.util.List;

/**
 * @author Koh He Xiang
 * This interface is used to declare methods for AccountService
 */
public interface IndustryService {
    /**
     * This method is used to get industry by name
     * @param name
     * @return
     */
    IndustryResponseDTO getIndustryByName(String name);

    /**
     * This method is used to get all industries
     * @return
     */
    List<IndustryResponseDTO> getAllIndustries();

    /**
     * This method is used to get all parent industries
     * @return
     */
    List<IndustryResponseDTO> getAllParentIndustries();

    /**
     * This method is used to get all sub industries
     * @return
     */
    List<IndustryResponseDTO> getAllSubIndustries(int industryId);
}
