package ru.sadco.test.medicCalendar.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalendarController {
    @RequestMapping(value={"/", "/calendar"}, method = RequestMethod.GET)
    public ModelAndView calendar(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("main/calendar");
        return modelAndView;
    }
}
