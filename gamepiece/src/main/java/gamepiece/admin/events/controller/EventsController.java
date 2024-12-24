package gamepiece.admin.events.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/events")
public class EventsController {
	
	@GetMapping("/memberList")
	public String memberListView(Model model) {
		
		model.addAttribute("title", "이벤트목록");
		
		return "admin/events/eventsList";
	}
	
}
