package com.chiraw.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "game")
public class Game {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "game_id")
	private int id;
	@Column
	@NotEmpty
	private String name;
	@Column
    private String alternativeName;

	/**
	* Returns value of id
	* @return
	*/
	public int getId() {
		return id;
	}

	/**
	* Sets new value of id
	* @param
	*/
	public void setId(int id) {
		this.id = id;
	}

	/**
	* Returns value of name
	* @return
	*/
	public String getName() {
		return name;
	}

	/**
	* Sets new value of name
	* @param
	*/
	public void setName(String name) {
		this.name = name;
	}

	/**
	* Returns value of alternativeName
	* @return
	*/
	public String getAlternativeName() {
		return alternativeName;
	}

	/**
	* Sets new value of alternativeName
	* @param
	*/
	public void setAlternativeName(String alternativeName) {
		this.alternativeName = alternativeName;
	}
}
