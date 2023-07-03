package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling// chay ngam
public class TestSchedule {

    @Autowired
    private TestService testService;

    // spring booot
    // dat lich => cron job => cron expression => menh de
   // @Scheduled(fixedDelay = 2000)// dien thoi gian mong muon => tinh theo milis giay
    @Scheduled(cron = "* * 1 6 * ?")
    public void batLichDay() {
        try {
            testService.baoThuc();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
