package gamepiece.admin.point.domain;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Point {
	

	private String itemCd;
	private String itemCate;
	private String itemName;
	private String itemImgurl;
	private String itemImgtype;
	private int itemPrice;
	private String admin_id;
	private Date reg_ymd;
	
}
