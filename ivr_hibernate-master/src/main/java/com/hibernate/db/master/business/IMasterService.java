package com.globalbilgi.hibernate.db.master.business;

import java.util.List;

import com.globalbilgi.hibernate.db.master.entities.MASTER;
import com.globalbilgi.hibernate.db.master.entities.MasterTemp;

public interface IMasterService {
		
	List<MasterTemp> getAll();
	

}
