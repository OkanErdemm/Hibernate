package com.globalbilgi.hibernate.db.master.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.globalbilgi.hibernate.db.master.entities.MASTER;
import com.globalbilgi.hibernate.db.master.entities.MasterTemp;

@Repository
public class HibernateMasterDal implements IMasterDal {

	private EntityManager entitiyManager;
	List<MasterTemp> masterTempList;
	List<MASTER> master;

	@Autowired
	public HibernateMasterDal(EntityManager entitiyManager) {
		this.entitiyManager = entitiyManager;
	}

	@Override
	@Transactional
	public List<MasterTemp> getAll() {
		masterTempList = new ArrayList<>();
		Session session = entitiyManager.unwrap(Session.class);
		master = session.createQuery(
				"from MASTER where start_time >sysdate-1/12 and was_ip='172.20.27.70'order by start_time desc",
				MASTER.class).getResultList();

		add(master);
		return masterTempList;
	}

	public void add(List<MASTER> master) {
		master = this.master;

		for (MASTER master2 : master) {

			MasterTemp masterTemp = new MasterTemp();
			masterTemp.ani = master2.ani;
			masterTemp.dnis = master2.dnis;
			masterTemp.eduid = master2.eduid;
			masterTemp.end_time = master2.end_time;
			masterTemp.entry_point = master2.entry_point;
			masterTemp.error_code = master2.error_code;
			masterTemp.error_desc = master2.error_desc;
			masterTemp.menu_path = master2.menu_path;
			masterTemp.session_id = "http://172.20.27.70:9080/LogReader/" + master2.session_id;
			masterTemp.start_time = master2.start_time;
			masterTemp.was_ip = master2.was_ip;

			masterTempList.add(masterTemp);
		}

	}
}
