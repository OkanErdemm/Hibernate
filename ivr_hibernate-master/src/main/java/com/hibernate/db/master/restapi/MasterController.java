package com.globalbilgi.hibernate.db.master.restapi;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globalbilgi.hibernate.db.master.dao.IMasterDal;
import com.globalbilgi.hibernate.db.master.entities.MasterTemp;

@RestController

public class MasterController {
	
	IMasterDal masterDal;

	@Autowired
	public MasterController(IMasterDal masterDal) {
		this.masterDal = masterDal;
	}
	

	@RequestMapping(value = "/")
    public void redirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("./swagger-ui.html");
    }
    
	@GetMapping(path = "/api/logs",produces =MediaType.APPLICATION_JSON_VALUE)
	public List<MasterTemp> getAll(){
		return masterDal.getAll();
				}
	
	
}
