package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.poly.model.Product;
import com.poly.model.giatri;

@Controller
public class dovecontroller {	
	String tinh = null;
	String ngay = null;
	String daySoInput = null;

	@RequestMapping("/dosoxo")
	public String home(Product giai, ModelMap model) {
		// Lấy list 
		if (tinh != null && ngay != null) {
			model.addAttribute("tinh", tinh);
			model.addAttribute("ngay", ngay);
			tinh = null;
			ngay = null;
		}

		System.out.println(daySoInput);
		giatri giatri = splitString();
		if (giai.getTinh() != null && giai.getNgay() != null) {
			
			if (daySoInput != null && giatri != null) {
				 
				if (giai.getGiaidb().contains(giatri.getNum6())) {
					model.addAttribute("message", "Chúc mừng bạn đã trúng giải đặc biệt!");
					System.out.println("chúng đặc biệt!");
				} else if (giai.getGiai1().contains(giatri.getNum5())){
					model.addAttribute("message", "Chúc mừng bạn đã trúng giải nhất!");
					System.out.println("chúng nhất!");
				} else if (giai.getGiai2().contains(giatri.getNum5())){
					model.addAttribute("message", "Chúc mừng bạn đã trúng giải nhì!");
					System.out.println("chúng giải nhì!");
				} else if (giai.getGiai3().contains(giatri.getNum5())){
					model.addAttribute("message", "Chúc mừng bạn đã trúng giải ba!");
					System.out.println("chúng giải ba!");
				} else if (giai.getGiai4().contains(giatri.getNum5())){
					model.addAttribute("message", "Chúc mừng bạn đã trúng giải bốn!");
					System.out.println("chúng giải bốn!");
				} else if (giai.getGiai5().contains(giatri.getNum4())){
					model.addAttribute("message", "Chúc mừng bạn đã trúng giải năm!");
					System.out.println("chúng giải năm!");
				} else if (giai.getGiai6().contains(giatri.getNum4())){
					model.addAttribute("message", "Chúc mừng bạn đã trúng giải sáu!");
					System.out.println("chúng giải sáu!");
				} else if (giai.getGiai7().contains(giatri.getNum3())){
					model.addAttribute("message", "Chúc mừng bạn đã trúng giải bảy!");
					System.out.println("chúng giải bảy!");
				} else if (giai.getGiai8().contains(giatri.getNum2())){
					model.addAttribute("message", "Chúc mừng bạn đã trúng giải tám!");
					System.out.println("chúng giải tám!");
				} else {
					model.addAttribute("message", "Chúc bạn may mắn lần sau!");
					System.out.println("Chúc bạn may mắn lần sau!");
				}
			}
		}
		return "index";
	}

	@RequestMapping("/Result")
	public String Posted(Product giai, @RequestParam String chontinh, @RequestParam String chonngay,
			@RequestParam String mave) {
		tinh = "/" + chontinh;
		ngay = "/" + chonngay;
		daySoInput = mave;
		return "redirect:/dosoxo";
	}

	public giatri splitString() {
		if (daySoInput != null) {
			giatri giatri = new giatri();
			giatri.setNum6(daySoInput);
			giatri.setNum5(daySoInput.substring(1));
			giatri.setNum4(daySoInput.substring(2));
			giatri.setNum3(daySoInput.substring(3));
			giatri.setNum2(daySoInput.substring(4));
			return giatri;
		}
		return null;
	}
}
