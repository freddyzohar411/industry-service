package com.avensys.rts.industryservice.controller;

import com.avensys.rts.industryservice.constant.MessageConstants;
import com.avensys.rts.industryservice.entity.IndustryEntity;
import com.avensys.rts.industryservice.payload.IndustryResponseDTO;
import com.avensys.rts.industryservice.service.IndustryServiceImpl;
import com.avensys.rts.industryservice.util.ResponseUtil;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/***
 * @author Koh He Xiang
 * This is the controller class for the Industry service
 */
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/api/industries")
public class IndustryController {

    private final Logger log = LoggerFactory.getLogger(IndustryController.class);
    private final IndustryServiceImpl industryService;
    private final MessageSource messageSource;

    public IndustryController(IndustryServiceImpl industryService, MessageSource messageSource) {
        this.industryService = industryService;
        this.messageSource = messageSource;
    }

    /**
     * Get industry by name in query parameter
     * @param name
     * @return Httpresponse
     */
    @GetMapping("")
    public ResponseEntity<Object> getIndustryByName(@Valid @RequestParam String name) {
        log.info("Get an industry by name : Controller ");
        IndustryResponseDTO industry = industryService.getIndustryByName(name);
        return ResponseUtil.generateSuccessResponse(industry, HttpStatus.OK, messageSource.getMessage(MessageConstants.MESSAGE_SUCCESS, null, LocaleContextHolder.getLocale()));
    }

    /**
     * Get all industries
     * @return Httpresponse
     */
    @GetMapping("/all")
    public ResponseEntity<Object> getAllIndustries() {
        log.info("Get all industries : Controller ");
        return ResponseUtil.generateSuccessResponse(industryService.getAllIndustries(), HttpStatus.OK, messageSource.getMessage(MessageConstants.MESSAGE_SUCCESS, null, LocaleContextHolder.getLocale()));
    }

    @GetMapping("/parent")
    public ResponseEntity<Object> getAllParentIndustries() {
        log.info("Get all parent industries : Controller ");
        return ResponseUtil.generateSuccessResponse(industryService.getAllParentIndustries(), HttpStatus.OK, messageSource.getMessage(MessageConstants.MESSAGE_SUCCESS, null, LocaleContextHolder.getLocale()));
    }

    @GetMapping("/{industryId}/sub")
    public ResponseEntity<Object> getAllSubIndustries(@PathVariable int industryId) {
        log.info("Get all sub industries : Controller ");
        return ResponseUtil.generateSuccessResponse(industryService.getAllSubIndustries(industryId), HttpStatus.OK, messageSource.getMessage(MessageConstants.MESSAGE_SUCCESS, null, LocaleContextHolder.getLocale()));
    }

}
