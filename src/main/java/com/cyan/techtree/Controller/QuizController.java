package com.cyan.techtree.Controller;

import com.cyan.techtree.Quiz.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    private OptionsService optionsService;
    private QuestionsService questionsService;
    private QuizService quizService;

    @Autowired
    public QuizController(OptionsService optionsService, QuestionsService questionsService, QuizService quizService) {
        this.optionsService = optionsService;
        this.questionsService = questionsService;
        this.quizService = quizService;
    }

    @GetMapping("/options")
    public List<Options> getAllOptions() {
        return optionsService.getAllOptions();
    }

    @GetMapping("/questions")
    public List<Questions> getAllQuestions() {
        return questionsService.getAllQuestions();
    }

    @GetMapping("/quizzes")
    public List<QuizDTO> getAllQuiz() {
        return quizService.getAllQuiz();
    }
}