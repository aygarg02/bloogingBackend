package com.example.demo.service.imple;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.exception.*;
import com.example.demo.model.Client;
import com.example.demo.payload.ClientDTO;
import com.example.demo.repo.Userrepo;
import com.example.demo.service.*;

import org.springframework.stereotype.Service;

@Service// import com.example.demo.model.Client;
public class ClientService implements UserService {

@Autowired
private Userrepo repo;

    @Override
    public ClientDTO createUser(ClientDTO clientDto) {
     Client client=this.convetToClient(clientDto);
        Client clientSaved=this.repo.save(client);
        // System.out.println(clientSaved.getId()+"this is the client saved "+clientSaved.getName());
        return this.convetToClientDto(clientSaved);
    





       
    }

    @Override
    public ClientDTO updateUser(ClientDTO clientDto, Integer id) {
       Client client=repo.findById(id)
                             .orElseThrow(()->new ResourceNotFoundException("Client","id",id));
            client.setAbout(clientDto.getAbout());
            System.out.println(clientDto.getName()+" this is the name fo the ");
            client.setName(clientDto.getName());
            System.out.println(client.getName()+" "+client.getClass());
            client.setEmail(clientDto.getEmail());
            client.setPassword(clientDto.getPassword());
            client = repo.save(client);
            ClientDTO clientD=convetToClientDto(client)
            ;return clientD;
           


    }

    @Override
    public ClientDTO getUserByID(Integer clientid) {
        Client cli=repo.findById(clientid).orElseThrow(()->new ResourceNotFoundException("Client","id",clientid));
        ClientDTO clientDT=convetToClientDto(cli);
        return clientDT;
    }
     

    @Override
    public List<ClientDTO> getAllUsers() {
List<Client> list=repo.findAll();
List<ClientDTO> Dtolist=new ArrayList<ClientDTO>();
for(Client cli:list){
    Dtolist.add(convetToClientDto(cli));
}
return Dtolist;
    }

    @Override
    public void deleteUser(Integer clientid) {
// this is pending i have to do it ;
    }

    private  ClientDTO 
    convetToClientDto(Client client){


        ClientDTO clientDto=new ClientDTO();
        System.out.println(client.getId());
        clientDto.setId(client.getId());
        clientDto.setName(client.getName());    
        clientDto.setEmail(client.getEmail());
        clientDto.setPassword(client.getPassword());
        clientDto.setAbout(client.getAbout());
        return clientDto;

        
    }
    private  Client convetToClient(ClientDTO clientDto){


        Client client=new Client();
        client.setName(clientDto.getName());    
        // client.setId(clientDto.getId());
        client.setPassword(clientDto.getPassword());
        client.setEmail(clientDto.getEmail());
        client.setAbout(clientDto.getAbout());
        return client;

        
    }}

