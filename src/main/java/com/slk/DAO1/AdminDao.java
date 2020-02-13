package com.slk.DAO1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import com.slk.model1.Admin;

@Repository
public interface AdminDao {
	public void addJob(Admin emp);


}
