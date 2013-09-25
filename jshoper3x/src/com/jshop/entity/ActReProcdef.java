package com.jshop.entity;

// Generated 2013-9-25 20:51:42 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * ActReProcdef generated by hbm2java
 */
@Entity
@Table(name = "act_re_procdef", catalog = "jshoper3", uniqueConstraints = @UniqueConstraint(columnNames = {
		"KEY_", "VERSION_" }))
public class ActReProcdef implements java.io.Serializable {

	private String id;
	private Integer rev;
	private String category;
	private String name;
	private String key;
	private int version;
	private String deploymentId;
	private String resourceName;
	private String dgrmResourceName;
	private String description;
	private Byte hasStartFormKey;
	private Integer suspensionState;
	private Set<ActRuTask> actRuTasks = new HashSet<ActRuTask>(0);
	private Set<ActRuIdentitylink> actRuIdentitylinks = new HashSet<ActRuIdentitylink>(
			0);
	private Set<ActRuExecution> actRuExecutions = new HashSet<ActRuExecution>(0);

	public ActReProcdef() {
	}

	public ActReProcdef(String id, String key, int version) {
		this.id = id;
		this.key = key;
		this.version = version;
	}

	public ActReProcdef(String id, Integer rev, String category, String name,
			String key, int version, String deploymentId, String resourceName,
			String dgrmResourceName, String description, Byte hasStartFormKey,
			Integer suspensionState, Set<ActRuTask> actRuTasks,
			Set<ActRuIdentitylink> actRuIdentitylinks,
			Set<ActRuExecution> actRuExecutions) {
		this.id = id;
		this.rev = rev;
		this.category = category;
		this.name = name;
		this.key = key;
		this.version = version;
		this.deploymentId = deploymentId;
		this.resourceName = resourceName;
		this.dgrmResourceName = dgrmResourceName;
		this.description = description;
		this.hasStartFormKey = hasStartFormKey;
		this.suspensionState = suspensionState;
		this.actRuTasks = actRuTasks;
		this.actRuIdentitylinks = actRuIdentitylinks;
		this.actRuExecutions = actRuExecutions;
	}

	@Id
	@Column(name = "ID_", unique = true, nullable = false, length = 64)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "REV_")
	public Integer getRev() {
		return this.rev;
	}

	public void setRev(Integer rev) {
		this.rev = rev;
	}

	@Column(name = "CATEGORY_")
	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Column(name = "NAME_")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "KEY_", nullable = false)
	public String getKey() {
		return this.key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	@Column(name = "VERSION_", nullable = false)
	public int getVersion() {
		return this.version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	@Column(name = "DEPLOYMENT_ID_", length = 64)
	public String getDeploymentId() {
		return this.deploymentId;
	}

	public void setDeploymentId(String deploymentId) {
		this.deploymentId = deploymentId;
	}

	@Column(name = "RESOURCE_NAME_", length = 4000)
	public String getResourceName() {
		return this.resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	@Column(name = "DGRM_RESOURCE_NAME_", length = 4000)
	public String getDgrmResourceName() {
		return this.dgrmResourceName;
	}

	public void setDgrmResourceName(String dgrmResourceName) {
		this.dgrmResourceName = dgrmResourceName;
	}

	@Column(name = "DESCRIPTION_", length = 4000)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "HAS_START_FORM_KEY_")
	public Byte getHasStartFormKey() {
		return this.hasStartFormKey;
	}

	public void setHasStartFormKey(Byte hasStartFormKey) {
		this.hasStartFormKey = hasStartFormKey;
	}

	@Column(name = "SUSPENSION_STATE_")
	public Integer getSuspensionState() {
		return this.suspensionState;
	}

	public void setSuspensionState(Integer suspensionState) {
		this.suspensionState = suspensionState;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "actReProcdef")
	public Set<ActRuTask> getActRuTasks() {
		return this.actRuTasks;
	}

	public void setActRuTasks(Set<ActRuTask> actRuTasks) {
		this.actRuTasks = actRuTasks;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "actReProcdef")
	public Set<ActRuIdentitylink> getActRuIdentitylinks() {
		return this.actRuIdentitylinks;
	}

	public void setActRuIdentitylinks(Set<ActRuIdentitylink> actRuIdentitylinks) {
		this.actRuIdentitylinks = actRuIdentitylinks;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "actReProcdef")
	public Set<ActRuExecution> getActRuExecutions() {
		return this.actRuExecutions;
	}

	public void setActRuExecutions(Set<ActRuExecution> actRuExecutions) {
		this.actRuExecutions = actRuExecutions;
	}

}
