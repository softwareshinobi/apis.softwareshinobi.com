package com.softwareshinobi.apis.contactform;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("customer/contact")
public class ContactFormController {

    @Autowired
    ContactFormService contactFormService;

    public ContactFormController() {

        System.out.println("## ");
        System.out.println("## init > Contact Form API");
        System.out.println("## ");

    }

    @GetMapping("")
    public List<ContactForm> findAll() {

        System.out.println("enter > findAll");

        List<ContactForm> contactFormList = this.contactFormService.findAll();

        System.out.println("contactFormList / ");

        System.out.println(contactFormList);

        System.out.println("exit < findAll");

        return contactFormList;

    }

    @PutMapping("")
    ContactForm createContactForm(@RequestBody ContactForm contactForm) {

        System.out.println("enter > createContactForm");

        System.out.println("contactForm / " + contactForm);

        return this.contactFormService.save(contactForm);

    }

    @GetMapping("{id}")
    ContactForm findById(@PathVariable Long id) {

        return this.contactFormService.findById(id);

    }

}
