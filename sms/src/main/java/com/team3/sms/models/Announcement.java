package com.team3.sms.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Announcement {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String Comments;
}
