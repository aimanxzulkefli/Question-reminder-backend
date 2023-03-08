package com.portfolio.proiv.Services;

import com.portfolio.proiv.Models.Questions;
import com.portfolio.proiv.Repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@Service
public class QuestionsServicesImpl implements QuestionsServices{

    private Repository repository;

    @Autowired
    public QuestionsServicesImpl(Repository repository) {
        this.repository = repository;
    }

    @Override
    public Questions createQuestion(Questions question) {
        return repository.save(question);
    }

    @Override
    public List<Questions> questionsList() {
        return repository.findAll();
    }

    @Override
    public void deleteQuestion(Long id) {
        repository.deleteById(id);
    }
}
