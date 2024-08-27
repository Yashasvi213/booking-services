package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "subject")
public class Subject {
	@Id
	private int id;
	private String sub_code;
	private String sub_name;
	private String status;
	
	@DBRef
	private SubjectCategory sub_category;
	@DBRef
	private Department department;
	
}
