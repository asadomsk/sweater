package com.example.sweater.repos;
import org.springframework.data.repository.CrudRepository;

import com.example.sweater.domain.Message;

public interface MessageRepos extends CrudRepository<Message, Integer> {

}
