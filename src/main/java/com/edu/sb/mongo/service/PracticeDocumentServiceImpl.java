package com.edu.sb.mongo.service;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.edu.sb.mongo.model.PracticeDocument;
import com.edu.sb.mongo.model.TrainingDocument;
import com.edu.sb.mongo.repository.PracticeDocumentRepository;

@Service
public class PracticeDocumentServiceImpl implements PracticeDocumentService {
	
	private final PracticeDocumentRepository pracRepo;
	
	public PracticeDocumentServiceImpl(PracticeDocumentRepository pracRepo) {
		super();
		this.pracRepo = pracRepo;
	}


	Logger logger = LoggerFactory.getLogger(PracticeDocumentServiceImpl.class);
	

	@Override
	public void processDemoDocument(TrainingDocument document) {
		
		/*
		 * 1. I can fetch data from different collection/tables
		 * 2. I can call 3rd party micro service and get the data.
		 *  then supply to my model class.
		 * 3. apply business rules on the data fetched from db before send them to consumer or client.
		 
		 */
		logger.info("preparing to save doc to database ---{}", document.getName());
		PracticeDocument practiceDocument = new PracticeDocument();
		practiceDocument.setDocName(document.getName());
		practiceDocument.setDocLocation(document.getLocation());
		
		practiceDocument.setCreatedTimeStamp(LocalDateTime.now());
//		pracRepo.save(document);
		pracRepo.insert(practiceDocument);
//		pracRepo.find

	}

}
