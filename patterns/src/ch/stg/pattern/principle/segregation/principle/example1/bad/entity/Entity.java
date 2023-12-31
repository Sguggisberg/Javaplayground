package ch.stg.pattern.principle.segregation.principle.example1.bad.entity;

//Base class for all entities
public abstract class Entity {
	
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
}
