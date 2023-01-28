package com.cjc.crud.main.Rep;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.crud.main.Model.Student;

@Repository
public interface Rep extends CrudRepository<Student, Serializable>{

}
