package com.softwareshinobi.apis.contactform;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
@Transactional(rollbackOn = {SQLException.class})
public class ContactFormService {

    ContactFormRepository projectRepository;

    @Autowired
    public ContactFormService(ContactFormRepository contactFormRepository) {

        this.projectRepository = contactFormRepository;

    }

    public ContactForm save(ContactForm contactForm) {

        return this.projectRepository.save(contactForm);

    }

    public List<ContactForm> findAll() {

        return this.projectRepository.findAll();

    }

    public ContactForm findById(Long id) {

        return this.projectRepository.findById(id).orElse(null);

    }

    public void delete(Long id) {

        this.projectRepository.deleteById(id);

    }

}
