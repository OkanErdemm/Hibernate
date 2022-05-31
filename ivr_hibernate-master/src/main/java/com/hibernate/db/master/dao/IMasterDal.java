package com.globalbilgi.hibernate.db.master.dao;

import java.util.List;

import com.globalbilgi.hibernate.db.master.entities.MASTER;
import com.globalbilgi.hibernate.db.master.entities.MasterTemp;

public interface IMasterDal {

	List<MasterTemp> getAll();
	

}
