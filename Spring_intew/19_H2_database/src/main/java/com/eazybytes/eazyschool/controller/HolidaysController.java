package com.eazybytes.eazyschool.controller;

import ch.qos.logback.core.CoreConstants;
import com.eazybytes.eazyschool.model.Holiday;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


@Controller
public class HolidaysController {

    @GetMapping("/holidays/{display}")
    public String displayHolidays(@PathVariable String display, Model model) {
        if(null != display && display.equals("all")){
            model.addAttribute("festival",true);
            model.addAttribute("federal",true);
        }else if(null != display && display.equals("federal")){
            model.addAttribute("federal",true);
        }else if(null != display && display.equals("festival")){
            model.addAttribute("festival",true);
        }
        List<Holiday> holidays = Arrays.asList(
                new Holiday(" Jan 1 ","New Year's Day", Holiday.Type.FESTIVAL),
                new Holiday(" Oct 31 ","Halloween", Holiday.Type.FESTIVAL),
                new Holiday(" Nov 24 ","Thanksgiving Day", Holiday.Type.FESTIVAL),
                new Holiday(" Dec 25 ","Christmas", Holiday.Type.FESTIVAL),
                new Holiday(" Jan 17 ","Martin Luther King Jr. Day", Holiday.Type.FEDERAL),
                new Holiday(" July 4 ","Independence Day", Holiday.Type.FEDERAL),
                new Holiday(" Sep 5 ","Labor Day", Holiday.Type.FEDERAL),
                new Holiday(" Nov 11 ","Veterans Day", Holiday.Type.FEDERAL)
        );
//        List<Holiday> holidays = new ArrayList<>();
//        holidays.add(new Holiday(" Jan 1 ","New Year's Day", Holiday.Type.FESTIVAL));
//        holidays.add(new Holiday( "Nov 24 ","Thanksgiving Day", Holiday.Type.FESTIVAL));

        Holiday.Type types[] = Holiday.Type.values();
        for (Holiday.Type type : types) {

            model.addAttribute(type.toString(),
                     (holidays.stream().filter(s -> s.getType().equals(type)).collect(Collectors.toList())) );
        }
        return "holidays.html";
    }
}