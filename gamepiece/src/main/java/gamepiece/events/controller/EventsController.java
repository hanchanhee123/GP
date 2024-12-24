package gamepiece.events.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EventsController {
	
	@GetMapping("/memberList")
	public String memberListView(Model model) {
		
		model.addAttribute("title", "이벤트목록");
		
		return "admin/events/eventsList";
	}
	
}
