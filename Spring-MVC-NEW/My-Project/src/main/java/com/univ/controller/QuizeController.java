
	package com.univ.controller;

	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.*;

	import com.univ.dao.QuizeDao;
	import com.univ.pojo.Quize;

	@Controller
	@RequestMapping("/quiz")
	public class QuizeController {

	    @Autowired
	    private QuizeDao quizeDao;

	    // ✅ Show all quizzes
	    @GetMapping("/list")
	    public String listQuizzes(Model model) {
	        List<Quize> quizzes = quizeDao.getAllQuizzes();
	        model.addAttribute("quizzes", quizzes);
	        return "quiz-list"; // --> quiz-list.jsp page
	    }

	    // ✅ Show form to add new quiz
	    @GetMapping("/add")
	    public String showAddForm(Model model) {
	        model.addAttribute("quiz", new Quize());
	        return "quiz-form"; // --> quiz-form.jsp page
	    }

	    // ✅ Save new quiz
	    @PostMapping("/save")
	    public String saveQuiz(@ModelAttribute("quiz") Quize quiz) {
	        quizeDao.saveQuiz(quiz);
	        return "redirect:/quiz/list";
	    }

	    // ✅ Show form for updating existing quiz
	    @GetMapping("/edit/{id}")
	    public String showEditForm(@PathVariable("id") int id, Model model) {
	        Quize quiz = quizeDao.getQuizById(id);
	        model.addAttribute("quiz", quiz);
	        return "quiz-form"; // reuse same JSP for edit
	    }

	    // ✅ Update quiz
	    @PostMapping("/update")
	    public String updateQuiz(@ModelAttribute("quiz") Quize quiz) {
	        quizeDao.updateQuiz(quiz);
	        return "redirect:/quiz/list";
	    }

	    // ✅ Delete quiz
	    @GetMapping("/delete/{id}")
	    public String deleteQuiz(@PathVariable("id") int id) {
	        quizeDao.deleteQuiz(id);
	        return "redirect:/quiz/list";
	    }
	

}
