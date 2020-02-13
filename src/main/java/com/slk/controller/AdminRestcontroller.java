package com.slk.controller;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.slk.DAO1.AdminDaoimpl;
import com.slk.model1.Admin;

import ch.qos.logback.core.net.SyslogOutputStream;

@RestController
@Repository
@CrossOrigin(origins = "http://localhost:4200")
public class AdminRestcontroller {
	@Autowired
	AdminDaoimpl adminDaoimpl= new AdminDaoimpl();
	@PostMapping("/post/Admin_job")
	public ResponseEntity addManager(@RequestBody Admin admin) {
		System.out.println("function inside the controller");
		adminDaoimpl.addJob(admin);
		return new ResponseEntity(admin, HttpStatus.OK);
	}
	
}
	
	


