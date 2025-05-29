package com.softwareshinobi.apis.contactform;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ContactFormRepository extends JpaRepository<ContactForm, Long> {

    Optional<ContactForm> findByIdAllIgnoreCase(Long id);

}
