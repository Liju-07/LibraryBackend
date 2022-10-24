package com.nestdigital.BookLibrary.Dao;

import com.nestdigital.BookLibrary.Model.LibraryModel;
import org.springframework.data.repository.CrudRepository;

public interface LibraryDao extends CrudRepository<LibraryModel,Integer> {
}
