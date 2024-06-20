package com.brenimcode.workshopmongo.dto;

import java.io.Serializable;
import java.util.Date;

public class CommentDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String id;
	private Date date;
	private AuthorDTO authorDTO;
	
	public CommentDTO() {
		
	}

	public CommentDTO(String id, Date date, AuthorDTO authorDTO) {
		super();
		this.id = id;
		this.date = date;
		this.authorDTO = authorDTO;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public AuthorDTO getAuthorDTO() {
		return authorDTO;
	}

	public void setAuthorDTO(AuthorDTO authorDTO) {
		this.authorDTO = authorDTO;
	}
	
}
