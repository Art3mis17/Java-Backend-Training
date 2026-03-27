package org.example.hr.controller;

import java.time.DayOfWeek;
import java.time.LocalDate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HRController {

    // Very basic rule: Saturday/Sunday are holidays
    @GetMapping("/hr/isHoliday")
    public boolean isHoliday(@RequestParam String date) {
        LocalDate d = LocalDate.parse(date); // format: yyyy-MM-dd
        DayOfWeek day = d.getDayOfWeek();
        return day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY;
    }
}
