package gamepiece.admin.point.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/point")
public class PointController {

	@GetMapping("/List")
	public String pointListView(Model model) {
		
		model.addAttribute("List", "아이템 목록");
		
		return "admin/points/pointshopList";
	}
	@GetMapping("/Detail")
	public String pointDetail(Model model) {
		
		model.addAttribute("title", "상세보기");
		
		return "admin/points/pointshopdetail";
	}
	@GetMapping("/Add")
	public String pointAdd(Model model) {
		
		model.addAttribute("title", "상세보기");
		
		return "admin/points/pointshopadd";
	}

}	
