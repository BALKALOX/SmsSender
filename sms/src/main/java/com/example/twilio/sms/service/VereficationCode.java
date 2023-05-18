package com.example.twilio.sms.service;

import java.util.Random;

public class VereficationCode {
    public String generateCode(){
        return Integer.toString(new Random().nextInt(999999));
    }
}
