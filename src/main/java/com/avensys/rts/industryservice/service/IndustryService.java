package com.avensys.rts.industryservice.service;

import com.avensys.rts.industryservice.payload.IndustryResponseDTO;

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
}
