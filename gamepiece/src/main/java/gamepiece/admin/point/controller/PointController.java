package gamepiece.admin.point.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import gamepiece.admin.point.service.PointService;


@Controller
@RequestMapping("/point")
public class PointController {
	
	private final PointService pointService;
	
	public PointController(PointService pointService) {
		this.pointService = pointService;
	}
	
	
	@GetMapping("/List")
	public String pointListView(Model model) {
		
		model.addAttribute("pointList", pointService.findAll());
		
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
