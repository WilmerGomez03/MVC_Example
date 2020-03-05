package co.edu.icesi.ci.mvctutorial.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import co.edu.icesi.ci.mvctutorial.model.User;
import co.edu.icesi.ci.mvctutorial.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	public UserController(UserService service) {
		this.userService = service;
	}
	@GetMapping("/users/")
	public String listUsers(Model model) {
		model.addAttribute("users",userService.findAll());
		return "users/index";
	}
	@GetMapping("/users/")
	public String viewPag(Model view) {
		view.addAttribute("add",userService.getGenders());
		return "view/add";
	}
	@PostMapping("/users/add/")
	public String addUser(User user, Model model) {
		
		return "";
		
	}
}
