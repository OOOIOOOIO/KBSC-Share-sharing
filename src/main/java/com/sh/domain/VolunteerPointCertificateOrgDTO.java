package com.sh.domain;

import lombok.Data;

@Data
public class VolunteerPointCertificateOrgDTO {
	private int certificate_num; // auto increment
	private String certificate_code;
	private String v_date;
	private int v_point;
	private int v_board_num;
	private String u_sys_id;
	private String v_sys_id;
	private int vo_com_num;
}
