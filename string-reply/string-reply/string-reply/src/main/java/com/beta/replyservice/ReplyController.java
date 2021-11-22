package com.beta.replyservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import java.security.*;

@RestController
public class ReplyController {

	@GetMapping("/reply")
	public ReplyMessage replying() {
		return new ReplyMessage("Message is empty");
	}

	@GetMapping("/reply/{message}")
	public ReplyMessage replying(@PathVariable String message) {
		short code = 0;
		String rules = message.split("-")[0];
		String msg = message.split("-")[1];
		for (int i = 0; i < rules.length(); i++) {
			char rule = rules.charAt(i);
			if (rule == '1') {
				code=200;
				msg = reverse(msg);
			} else if (rule == '2') {
				code=200;
				msg = encodeMD5(msg);
			} else {
				code=400;
				msg = "Invalid input";
				break;
			}
		}
		return new ReplyMessage(code,msg);
	}

	private String reverse(String input) {
		StringBuffer stringBuffer = new StringBuffer(input);
		return stringBuffer.reverse().toString();

	}

	private String encodeMD5(String input) {
		byte[] theMD5digest = null;
		try {
			byte[] bytesOfMessage = input.getBytes("UTF-8");
			MessageDigest md = MessageDigest.getInstance("MD5");
			theMD5digest = md.digest(bytesOfMessage);
			return bytesToHex(theMD5digest);
		} catch (Exception e) {
		}
		return new String(theMD5digest);
	}

	private String bytesToHex(byte[] bytes) {
		char[] hexArray = "0123456789abcdef".toCharArray();
		char[] hexChars = new char[bytes.length * 2];
		for (int j = 0; j < bytes.length; j++) {
			int v = bytes[j] & 0xFF;
			hexChars[j * 2] = hexArray[v >>> 4];
			hexChars[j * 2 + 1] = hexArray[v & 0x0F];
		}
		return new String(hexChars);
	}
}
