package gamepiece.admin.point.domain;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Point {


	private String ps_cd;
	private String ps_cate_cd;
	private String ps_nm;
	private String img_url;
	private String img_type;
	private int ps_price;
	private String admin_id;
	private Date reg_ymd;
	
}
