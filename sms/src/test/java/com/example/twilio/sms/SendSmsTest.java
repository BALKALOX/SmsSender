package com.example.twilio.sms;

import com.example.twilio.sms.controller.SmsController;
import org.junit.jupiter.api.Test;

public class SendSmsTest {
    private final SmsController service = new SmsController();
    private final String phoneNumber = "+380973968615";

    @Test
    public void sendSmsTest(){
        service.sendSMS();
    }
}
