package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringManipulationService {

	@GetMapping("/isStrEqual")
	public boolean isStrEqual(String a, String b) {
		return a.equals(b);
	}
	
	@GetMapping("/getLength")
	public int getLength(String a) {
		return a.length();
	}
	
	@GetMapping("/concatStr")
	public String concatStr(String a, String b) {
		return a.concat(b);
	}
}
