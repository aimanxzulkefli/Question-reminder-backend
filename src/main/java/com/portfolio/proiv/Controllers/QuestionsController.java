package com.portfolio.proiv.Controllers;

import com.portfolio.proiv.Models.Questions;
import com.portfolio.proiv.Services.QuestionsServices;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/questions")
public class QuestionsController {


    private QuestionsServices questionsServices;

    @Autowired
    public QuestionsController(QuestionsServices questionsServices) {
        this.questionsServices = questionsServices;
    }

    @CrossOrigin
    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Questions> createQuestion(@Valid @RequestBody Questions question){
        return new ResponseEntity<>(questionsServices.createQuestion(question), HttpStatus.CREATED);
    }

    @CrossOrigin
    @GetMapping("/list")
    public ResponseEntity<List<Questions>> questionsList(){
        return new ResponseEntity<>(questionsServices.questionsList(),HttpStatus.OK);
    }

    @DeleteMapping("/{id}/delete")
    public  ResponseEntity<String> deleteQuestion(@PathVariable("id") Long id){
        questionsServices.deleteQuestion(id);
        return new ResponseEntity<>("Question deleted successfully",HttpStatus.OK);
    }
}
