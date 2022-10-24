package com.nestdigital.BookLibrary.Dao;

import com.nestdigital.BookLibrary.Model.LibraryModel;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LibraryDao extends CrudRepository<LibraryModel,Integer> {

@Modifying
    @Query(value = "DELETE FROM `books` WHERE `id`=:id",nativeQuery = true)
    void delete(Integer id);


@Query(value = "SELECT * FROM `books` WHERE `name` LIKE concat('%',:book,'%')",nativeQuery = true)
List<LibraryModel> search(String book);
}
