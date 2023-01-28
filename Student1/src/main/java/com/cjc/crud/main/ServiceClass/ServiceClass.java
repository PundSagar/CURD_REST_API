package com.cjc.crud.main.ServiceClass;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.crud.main.Model.Student;
import com.cjc.crud.main.Rep.Rep;
import com.cjc.crud.main.ServiceI.ServiceI;

@Service
public class ServiceClass implements ServiceI {

	@Autowired
	Rep rep;

	@Override
	public void save(Student stu) {
		rep.save(stu);
		
	}

	@Override
	public List getdata() {
		List list=(List)rep.findAll();
		return list;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		rep.deleteById(id);
		
	}

	@Override
	public void update(Student stu) {
		// TODO Auto-generated method stub
		rep.save(stu);
	}
}
