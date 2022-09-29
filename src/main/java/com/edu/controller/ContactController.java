package com.edu.controller;

import com.edu.dto.ContactDto;
import com.edu.service.ContactService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Slf4j
@RestController
public class ContactController {

    private ContactService contactService;

    @Autowired
    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping({"/contacts", "/index"})
    public List<ContactDto> listContacts() {
        return contactService.listContact();
    }

    @PostMapping(value = "/contacts")
    public String addContact(
            @Valid
            @RequestBody
            ContactDto contactDto) {
        contactService.addContact(contactDto);
        return ""; // TODO
    }

    @DeleteMapping("/contacts/{contactId}")
    public String deleteContact(
            @PathVariable("contactId")
            Integer contactId) {
        contactService.removeContact(contactId);
        return ""; // TODO
    }
}
