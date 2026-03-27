package org.example.it.controller;

import org.example.it.consumer.HRRestConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ITController {

    @Autowired
    private HRRestConsumer hrRestConsumer;

    @GetMapping(value = "/it/applyLeave", produces = "text/html")
    public String applyLeave(@RequestParam String employee, @RequestParam String date) {
        boolean holiday = hrRestConsumer.isHoliday(date);

        if (holiday) {
            return "<h2>Leave Approved</h2><p>Employee: " + employee + "</p><p>Date: " + date + "</p>"
                    + "<p>Reason: HR marked it as holiday.</p>";
        }

        return "<h2>Leave Rejected</h2><p>Employee: " + employee + "</p><p>Date: " + date + "</p>"
                + "<p>Reason: HR says it is a working day.</p>";
    }
}

