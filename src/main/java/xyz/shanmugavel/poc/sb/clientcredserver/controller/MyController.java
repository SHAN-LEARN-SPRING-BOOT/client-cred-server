package xyz.shanmugavel.poc.sb.clientcredserver.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api/v1/test")
public class MyController {


    @GetMapping("/read")
     @PreAuthorize("hasAuthority('SCOPE_sb_read_scope')")
    public String readContent() {
        return "Hello .. you have access to make READ API calls";
    }
    

    @GetMapping("/write")
    @PreAuthorize("hasAuthority('SCOPE_sb_write_scope')")
    public String writeContent() {
        return "Hello .. you have access to WRITE API calls";
    }
}
