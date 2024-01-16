package br.com.matheus.restfulSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.matheus.restfulSpring.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{
}
