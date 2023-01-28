package com.cjc.crud.main.ServiceI;

import java.util.List;

import com.cjc.crud.main.Model.Student;

public interface ServiceI {

	void save(Student stu);

	List getdata();

	void delete(int id);

	void update(Student stu);

}
