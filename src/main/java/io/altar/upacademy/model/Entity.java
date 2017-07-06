package io.altar.upacademy.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Entity {

	@Id
	@GeneratedValue
	protected Integer entityId;

	public Integer getEntityId() {

		return entityId;
	}

	public void setEntityId(Integer entityId) {
		this.entityId = entityId;
	}

	public Entity() {
	}

}
