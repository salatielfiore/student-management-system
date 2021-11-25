package br.com.fiore.sms.controller;

import org.springframework.ui.Model;

public class ControllerHelper {
	
	public static void textTitle(Model model, String textTitle) {
		model.addAttribute("textTitle", textTitle);
	}
	

}
