/*******************************************************************************
 * Copyright 2016 Tremolo Security, Inc.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package com.tremolosecurity.provisioning.objects;
// Generated Apr 7, 2016 3:31:46 PM by Hibernate Tools 4.3.1.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Users generated by hbm2java
 */
@Entity
@Table(name = "users")
public class Users implements java.io.Serializable {

	private int id;
	private String userKey;
	private Set<UserAttributes> userAttributeses = new HashSet<UserAttributes>(0);
	private Set<Workflows> workflowses = new HashSet<Workflows>(0);

	public Users() {
	}

	public Users(int id, String userKey) {
		this.id = id;
		this.userKey = userKey;
	}

	public Users(int id, String userKey, Set<UserAttributes> userAttributeses, Set<Workflows> workflowses) {
		this.id = id;
		this.userKey = userKey;
		this.userAttributeses = userAttributeses;
		this.workflowses = workflowses;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "userKey", nullable = false)
	public String getUserKey() {
		return this.userKey;
	}

	public void setUserKey(String userKey) {
		this.userKey = userKey;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "users")
	public Set<UserAttributes> getUserAttributeses() {
		return this.userAttributeses;
	}

	public void setUserAttributeses(Set<UserAttributes> userAttributeses) {
		this.userAttributeses = userAttributeses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "users")
	public Set<Workflows> getWorkflowses() {
		return this.workflowses;
	}

	public void setWorkflowses(Set<Workflows> workflowses) {
		this.workflowses = workflowses;
	}

}
