package com.portfolio.proiv.Services;

import com.portfolio.proiv.Models.Questions;
import com.portfolio.proiv.Repository.Repository;

import java.util.List;

public interface QuestionsServices {

    Questions createQuestion(Questions question);

    List<Questions> questionsList();

    void deleteQuestion(Long id);
}
