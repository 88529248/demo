package com.example.demo.thymeleaf;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

@Controller
public class ThymeleafController {

    @RequestMapping(value= "/index")
    public String index() {
        ModelMap modelMap = new ModelMap();
        modelMap.addAttribute("name", "想吃火锅");
        return "index";
    }

    @RequestMapping(value= "/resolver")
    public String  resolver() {
        ClassLoaderTemplateResolver resolver = new ClassLoaderTemplateResolver();
        resolver.setPrefix("templates/");
        resolver.setSuffix(".html");
        TemplateEngine engine = new TemplateEngine();
        engine.setTemplateResolver(resolver);
        Context context = new Context();
        context.setVariable("name","想吃火锅啦啦啦");
        return engine.process("index", context);
    }

}
