package ch.stg.pattern.principle.segregation.principle.example1.bad.service;

import java.util.List;

import ch.stg.pattern.principle.segregation.principle.example1.bad.entity.Entity;



//common interface to be implemented by all persistence services. 
public interface PersistenceService<T extends Entity> {

	public void save(T entity);
	
	public void delete(T entity);
	
	public T findById(Long id);
	
	public List<T> findByName(String name);
}
