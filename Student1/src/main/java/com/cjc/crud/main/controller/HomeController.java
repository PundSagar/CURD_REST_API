package com.cjc.crud.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.crud.main.Model.Student;
import com.cjc.crud.main.ServiceI.ServiceI;

@RestController
public class HomeController 
{
	@Autowired
	ServiceI ser;

	@PostMapping("/Insert")
	public String savedata(@RequestBody Student stu)
	{
		ser.save(stu);
		return "Insert data successfully";
	}
	
	@GetMapping("/Select")
	public List getdata()
	{
		List list=ser.getdata();
		return list;
	}
	
	@DeleteMapping("/Delete/{id}")
	public String delete(@PathVariable("id") int id)
	{
		ser.delete(id);
		return "delete data";
	}
	
	@PutMapping("/Update")
	public String updateData(@RequestBody Student stu)
	{
		ser.update(stu);
		return "your data updated";
	}
}
