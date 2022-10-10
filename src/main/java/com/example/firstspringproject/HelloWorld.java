package com.example.firstspringproject;

import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("HelloWorld")
public class HelloWorld {

    @GetMapping
    public String getHello(){
        return "Hello World";
    }
    @GetMapping("marc")
    public String getName(@RequestParam String name){
        return "Mein Name ist: " + name;
    }

    @PostMapping
    public int getLength(@RequestBody String body){
        return body.length();
    }

    @GetMapping(path = "{id}")
    public String getId (@PathVariable String id){
        return id;
    }
}
