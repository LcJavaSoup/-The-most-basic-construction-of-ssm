package com.LcJavaCoffee.controller;

import com.LcJavaCoffee.entity.Description;
import com.LcJavaCoffee.service.DescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("description")
public class DescriptionController {

    @Autowired
    private DescriptionService descriptionService;

    @RequestMapping("/infoByMV")
    public ModelAndView infoByMV() {
        Description description = descriptionService.getLastDescription();
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("description", description);
        return new ModelAndView("index", model);
    }
}
