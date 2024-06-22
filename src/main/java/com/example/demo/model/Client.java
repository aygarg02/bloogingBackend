package com.example.demo.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Setter;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity




@NoArgsConstructor
@Getter
@Setter
@Table(name="client")
public class Client {
    @Id
private int id;
private String  name;
private String email;
private String password;
private String about;    
}
