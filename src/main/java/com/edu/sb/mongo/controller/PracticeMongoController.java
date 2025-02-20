package com.edu.sb.mongo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.edu.sb.mongo.model.TrainingDocument;
import com.edu.sb.mongo.service.PracticeDocumentService;


@RestController
public class PracticeMongoController {
	
	Logger logger = LoggerFactory.getLogger(PracticeMongoController.class);
	
	private final PracticeDocumentService service;
	
	public PracticeMongoController(PracticeDocumentService service) {
		this.service = service;
	}

	@PostMapping("/insert-record")
	public void processDemoDoc(@RequestBody TrainingDocument document) {
		
		logger.info("processing doc   {} ",document.getName() );
		service.processDemoDocument(document);
	}

}
