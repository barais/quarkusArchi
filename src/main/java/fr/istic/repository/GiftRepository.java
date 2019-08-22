package fr.istic.repository;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import fr.istic.domain.Gift;
import fr.istic.dto.GiftDTO;
import fr.istic.mapper.GiftMapper;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class GiftRepository implements PanacheRepository<Gift> {

   // put your custom logic here as instance methods


   public Gift findByName(String name){
     return find("name", name).firstResult();
   }

   public void deleteStefs(){
     delete("name", "Stef");
  }
}