package com.projectmanager.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.projectmanager.collection.Task;

/**
 * 
 * @author Sathiya
 *
 */
public interface TaskDao extends MongoRepository<Task, String> {

}
