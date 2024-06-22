package com.example.demo.controller;

import java.net.http.HttpRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.payload.ClientDTO;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("api/users")
public class Controller {
    
 @Autowired
 private UserService userService;

 @PostMapping("/")
 public ResponseEntity<ClientDTO> createClient(@RequestBody ClientDTO clientDto){
  ClientDTO dto=userService.createUser(clientDto);
return new ResponseEntity<>(dto,HttpStatus.CREATED);


 }
 @PutMapping("/{userId}")
 public ResponseEntity<ClientDTO> update(@RequestBody ClientDTO clientDto,@PathVariable Integer userId){
  ClientDTO cli=this.userService.updateUser(clientDto,userId);
  // System.out.println(cli());
  return new ResponseEntity<>(cli,HttpStatus.ACCEPTED);

 }
 @GetMapping("/")
 public ResponseEntity<ClientDTO> getClient( @RequestParam("id") Integer id){
  
  return new ResponseEntity<>(userService.getUserByID(id),HttpStatus.OK);
 }  
 






}
