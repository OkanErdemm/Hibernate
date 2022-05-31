package com.globalbilgi.hibernate.db.master.entities;

public class MasterTemp {


		public MasterTemp(String start_time, String end_time, String entry_point, String ani, String dnis, String eduid,
			String session_id, String was_ip, String menu_path, String error_code, String error_desc) {
		super();
		this.start_time = start_time;
		this.end_time = end_time;
		this.entry_point = entry_point;
		this.ani = ani;
		this.dnis = dnis;
		this.eduid = eduid;
		//this.session_id = session_id;
		this.session_id = session_id;
		this.was_ip = was_ip;
		this.menu_path = menu_path;
		this.error_code = error_code;
		this.error_desc = error_desc;
	}

		public MasterTemp() {
			
		}
		
		
		public String start_time;

		public String end_time;

		public String entry_point;

		public String ani;

		public String dnis;

		public String eduid;

		public 	String session_id;

		public 	String was_ip;

		public String menu_path;

		public String error_code;

		public String error_desc;
		
		
	
}
