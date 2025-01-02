package gamepiece.admin.event.domain;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Event {

	private String ev_cd;
	private String ev_nm;
	private String ev_contents;
	private Date ev_start_ymd;
	private Date ev_end_ymd;
	private int ev_winners_num;
	private String admin_id;
	private Date reg_ymd;
	private String ev_img;
	private String evp_no;
	private String id;
	private Date ev_participate_ymd;
	private String ev_agreement;

}


















