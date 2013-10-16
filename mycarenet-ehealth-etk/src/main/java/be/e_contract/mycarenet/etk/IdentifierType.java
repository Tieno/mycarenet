/*
 * Java MyCareNet Project.
 * Copyright (C) 2013 Frank Cornelis.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License version
 * 3.0 as published by the Free Software Foundation.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, see 
 * http://www.gnu.org/licenses/.
 */

package be.e_contract.mycarenet.etk;

/**
 * Enumeration of the different identifier types recognized by the eHealth
 * Encryption Token Key web service.
 * 
 * @author Frank Cornelis
 * 
 */
public enum IdentifierType {

	NIHII("NIHII"),

	NIHII_HOSPITAL("NIHII-HOSPITAL"),

	CBE("CBE"),

	NIHII_PHARMACY("NIHII-PHARMACY"),

	SSIN("SSIN");

	private final String value;

	private IdentifierType(String value) {
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}
}