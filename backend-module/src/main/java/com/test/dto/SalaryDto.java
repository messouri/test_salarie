package com.test.dto;

import java.io.Serializable;

public class SalaryDto implements Serializable {

	public SalaryDto() {
		super();
	}

	/**
	 * constructeur with fields
	 * @param name
	 * @param id
	 */
	public SalaryDto(String name, Integer id) {
		super();
		this.name = name;
		this.id = id;
	}

	/**
	 * UID.
	 */
	private static final long serialVersionUID = -5020541220345941160L;

	/**
	 * name of salary.
	 */
	private String name;

	/**
	 * id of salary.
	 */
	private Integer id;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the id
	 */
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
}
