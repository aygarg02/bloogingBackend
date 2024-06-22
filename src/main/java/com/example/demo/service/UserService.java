package com.example.demo.service;

import java.util.List;

import com.example.demo.payload.ClientDTO;
public interface UserService {


ClientDTO createUser(ClientDTO client);

ClientDTO updateUser(ClientDTO client,Integer id);

ClientDTO getUserByID(Integer clientid);
List<ClientDTO> getAllUsers();
void deleteUser(Integer clientid);


}
