package com.romellpineda.displaydate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Date;

@Controller
public class HomeyController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	
//	public String index(Model model) {
//		model.addAttribute("dojoName", "Burbank");
//		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String date(Model model) {
		Date d1 = new Date();
		model.addAttribute("date", d1);
		return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String time(Model model) {
		Date t1 = new Date();
		model.addAttribute("time", t1);
		return "time.jsp";
	}
}
