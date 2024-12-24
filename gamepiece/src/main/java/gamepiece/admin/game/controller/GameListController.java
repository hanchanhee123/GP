package gamepiece.admin.game.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/game")
public class GameListController {

	@GetMapping("/gameList")
	public String gameListView(Model model) {
		model.addAttribute("title", "게임목록");
		return "admin/game/gameList";
	}
}
