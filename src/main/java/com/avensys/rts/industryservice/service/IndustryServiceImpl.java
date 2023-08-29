package com.avensys.rts.industryservice.service;

import com.avensys.rts.industryservice.entity.IndustryEntity;
import com.avensys.rts.industryservice.payload.IndustryResponseDTO;
import com.avensys.rts.industryservice.repository.IndustryRepository;
import jakarta.persistence.EntityNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author Koh He Xiang
 * This class is used to implement the IndustryService interface and perform CRUD operations
 */
@Service
public class IndustryServiceImpl implements IndustryService {

    private final Logger log = LoggerFactory.getLogger(IndustryServiceImpl.class);
    private final IndustryRepository industryRepository;

    public IndustryServiceImpl(IndustryRepository industryRepository) {
        this.industryRepository = industryRepository;
    }

    /**
     * This method is used to get industry by name
     * @param name
     * @return
     */
    @Override
    public IndustryResponseDTO getIndustryByName(String name) {
        IndustryEntity industry = industryRepository.findByName(name).orElseThrow(
                () -> new EntityNotFoundException("Industry with name " + name + " not found")
        );
        log.info("Industry found : Service");
        return toIndustryResponseDTO(industry);
    }

    /**
     * Internal method to convert IndustryEntity to IndustryResponseDTO
     * @param industry
     * @return
     */
    private IndustryResponseDTO toIndustryResponseDTO(IndustryEntity industry){
        IndustryResponseDTO industryResponse = new IndustryResponseDTO();
        industryResponse.setId(industry.getId());
        industryResponse.setName(industry.getName());
        industryResponse.setIndustry(industry);
        return industryResponse;
    }


}
