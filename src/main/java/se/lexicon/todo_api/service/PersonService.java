package se.lexicon.todo_api.service;

import org.springframework.stereotype.Service;
import se.lexicon.todo_api.dto.PersonDto;

import java.util.List;

public interface PersonService {
    List<PersonDto> findAll();

    PersonDto findById(Long id);
    PersonDto create(PersonDto personDto);
    void delete(Long id);
}
