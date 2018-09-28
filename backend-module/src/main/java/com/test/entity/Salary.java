package com.test.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Salary implements Serializable {
	
	public Salary() {
	}

	/**
	 * constructeur.
	 * @param id
	 * @param name
	 */
	public Salary(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	/**
	 * UID.
	 */
	private static final long serialVersionUID = 5794315919692502658L;

	/**
	 * id du salarie.
	 */
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Integer id;

	@Column
	private String name;

	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
}
