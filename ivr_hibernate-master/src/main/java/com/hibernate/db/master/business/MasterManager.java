/*
 * package com.globalbilgi.hibernate.db.master.business;
 * 
 * import java.util.List;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Service; import
 * org.springframework.transaction.annotation.Transactional;
 * 
 * import com.globalbilgi.hibernate.db.master.dao.IMasterDal; import
 * com.globalbilgi.hibernate.db.master.entities.MASTER; import
 * com.globalbilgi.hibernate.db.master.entities.MasterTemp;
 * 
 * import oracle.net.aso.m;
 * 
 * @Service public class MasterManager implements IMasterService {
 * 
 * private IMasterDal masterDal;
 * 
 * 
 * @Autowired public MasterManager(IMasterDal masterDal) { this.masterDal =
 * masterDal; }
 * 
 * @Override
 * 
 * @Transactional public List<MASTER> getAll() { return this.masterDal.getAll();
 * }
 * 
 * 
 * }
 */