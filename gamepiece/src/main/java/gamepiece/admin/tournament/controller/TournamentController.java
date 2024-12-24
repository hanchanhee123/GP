package gamepiece.admin.tournament.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/tournament")
public class TournamentController {
	@GetMapping("/tournamentList")
	public String getTournamentList(Model model) {
		
		model.addAttribute("title", "대회리스트");
		
		return "/admin/tournament/tournament_list";	
	}
}
