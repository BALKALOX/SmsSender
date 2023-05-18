package com.example.twilio.sms.controller;

import com.example.twilio.sms.service.VereficationCode;
import org.springframework.stereotype.Service;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Service
@RestController
@RequestMapping("/sms")
public class SmsController {
	private final String accountSid = "AC3d10eae8192003aa7bcac03e7c5a2375";
	private final String authToken = "b7efcb40cc536f89904f74ab5f1b6311";
	private final String twilioNumber ="+15747667107";
	@GetMapping("/send")
	public String sendSMS() {
		Twilio.init(accountSid,
				authToken);
		Message.creator(new PhoneNumber("+380973968615"),
				new PhoneNumber(twilioNumber),"Ваш верифікаційний код:"
						+new VereficationCode().generateCode()
				+". Нікому не давайте його. Нехай щастить:)"/*"Здоров 📞"*/).create();
		return "Смс успішно надіслано!";
	}
}
