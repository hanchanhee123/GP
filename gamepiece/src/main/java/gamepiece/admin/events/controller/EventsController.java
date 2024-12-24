package gamepiece.admin.events.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/events")
public class EventsController {
	
	@GetMapping("/eventsList")
	public String getEventsList(Model model) {
		
		model.addAttribute("title", "이벤트목록");
		
		return "admin/events/eventsList";
	}
	
	@GetMapping("/addEvents")
	public String AddEvents(Model model) {
		
		model.addAttribute("title", "이벤트목록 추가");
		
		return "admin/events/addEvents";
	}
	
	@GetMapping("/modifyEvents")
	public String ModifyEvents(Model model) {
		
		model.addAttribute("title", "이벤트목록 수정");
		
		return "admin/events/modifyEvents";
	}
	
	@GetMapping("/removeEvents")
	public String RemoveEvents(Model model) {
		
		model.addAttribute("title", "이벤트목록 삭제");
		
		return "admin/events/removeEvents";
	}
	
	@GetMapping("/eventsWinnerList")
	public String getWinnerList(Model model) {
		
		model.addAttribute("title", "이벤트당첨자 목록");
		
		return "admin/events/eventsWinnerList";
	}
	
	@GetMapping("/addEventsWinner")
	public String addWinner(Model model) {
		
		model.addAttribute("title", "이벤트당첨자 추가");
		
		return "admin/events/addEventsWinner";
	}

	@GetMapping("/modifyEventsWinner")
	public String modifyWinner(Model model) {
		
		model.addAttribute("title", "이벤트당첨자 수정");
		
		return "admin/events/modifyEventsWinner";
	}

	@GetMapping("/removeEventsWinner")
	public String removeWinner(Model model) {
		
		model.addAttribute("title", "이벤트당첨자 삭제");
		
		return "admin/events/removeEventsWinner";
	}
}

