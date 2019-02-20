package com.librarymanagement.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.librarymanagement.model.Library;

@Repository
public interface LibraryManagementRepository extends CrudRepository<Library, Integer> {

}
