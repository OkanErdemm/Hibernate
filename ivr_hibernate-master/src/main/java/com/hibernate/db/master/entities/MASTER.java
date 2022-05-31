package com.globalbilgi.hibernate.db.master.entities;

import javax.persistence.*;

import io.swagger.annotations.ApiModel;

@Entity
@Table(name = "MASTER", schema = "IVRREPORT")
public class MASTER {

	
	  public MASTER(String start_time, String end_time, String entry_point, String
	  ani, String dnis, String eduid, String was_ip, String session_id, String
	  menu_path, String error_code, String error_desc) {
	  
	  super();
	  
	  this.start_time = start_time; this.end_time = end_time; this.entry_point =
	  entry_point; this.ani = ani; this.dnis = dnis; this.eduid=eduid;
	  this.session_id = session_id; this.was_ip=was_ip; this.menu_path=menu_path;
	  this.error_code=error_code; this.error_desc=error_desc;
	  
	  
	  }
	  
	  
	  public MASTER() {
	  
	  }
	 

	@Id
	@Column(name = "START_TIME")
	public String start_time;

	@Column(name = "END_TIME")
	public String end_time;


	@Column(name = "ENTRY_POINT")
	public String entry_point;

	@Column(name = "ANI")
	public String ani;

	@Column(name = "DNIS")
	public String dnis;


	@Column(name = "EDUID")
	public String eduid;

	@Column(name = "SESSION_ID")
	public String session_id;
	
	@Column(name = "WAS_IP")
	public String was_ip;

	@Column(name = "MENU_PATH")
	public String menu_path;
	
	@Column(name = "ERROR_CODE")
	public String error_code;
	
	@Column(name = "ERROR_DESC")
	public String error_desc;

}
