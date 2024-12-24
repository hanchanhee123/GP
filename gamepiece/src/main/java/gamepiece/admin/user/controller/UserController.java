package gamepiece.admin.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/user")
public class UserController {

	@GetMapping("/userList")
	public String getAllUserInfo(Model model) {
		
		model.addAttribute("title", "회원목록");
		
		return "admin/user/userList";
	}
	
	@GetMapping("/removeUserList")
	public String getRemoveUserInfo(Model model) {
		
		model.addAttribute("title", "탈퇴 회원목록");
		
		return "admin/user/userRemove";
	}
	
	@GetMapping("/dormancyUserList")
	public String getDormancyUserInfo(Model model) {
		
		model.addAttribute("title", "휴면 회원목록");
		
		return "admin/user/userDormancy";
	}
	
	@GetMapping("/userLoginlog")
	public String getUserLoginLog(Model model) {
		
		model.addAttribute("title", "회원 로그인 기록 조회");
		
		return "admin/user/userLoginlog";
	}
}
