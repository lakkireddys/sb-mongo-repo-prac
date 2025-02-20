package com.edu.sb.mongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.edu.sb.mongo.model.PracticeDocument;

@Repository
public interface PracticeDocumentRepository extends MongoRepository<PracticeDocument, Long> {
	
	List<PracticeDocument> findByDocName(String docName);
	
	List<PracticeDocument> findByDocNameAndDocLocation(String docName, String docLocation);

}
