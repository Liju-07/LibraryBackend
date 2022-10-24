package com.nestdigital.BookLibrary.controller;


import com.nestdigital.BookLibrary.Dao.LibraryDao;
import com.nestdigital.BookLibrary.Model.LibraryModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.transaction.Transactional;
import java.util.List;

@RestController
public class LibraryController {

    @Autowired
    private LibraryDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public String bookadd(@RequestBody LibraryModel library)
    {
        System.out.println(library.toString());
        dao.save(library);
        return "{status:'success'}";
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<LibraryModel> viewbooks()
    {
        return (List<LibraryModel>)dao.findAll();
    }



    @Transactional
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/delete",consumes = "application/json",produces = "application/json")
    public String deletebook(@RequestBody  LibraryModel library)
    {
        dao.delete(library.getId());
        return "{status:'success'}";
    }


@CrossOrigin("*")
    @PostMapping(path = "/search",produces = "application/json",consumes = "application/json")
    public List<LibraryModel> searchBook(@RequestBody LibraryModel library)
    {

return (List<LibraryModel>) dao.search(library.getName());
    }
}
