package com.astro.library;

import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring
// into a Bean called Book
// CRUD refers Create, Read, Update, Delete
public interface BookRepository extends CrudRepository<Book, Integer> {

}
