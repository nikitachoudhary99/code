package com.univ.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.univ.daoimpl.CourseDaoImpl;
import com.univ.pojo.Course;

@Controller
public class CourseController {

    private CourseDaoImpl daoimpl;

    @Autowired
    public void setDaoimpl(CourseDaoImpl daoimpl) {
        this.daoimpl = daoimpl;
    }

    // 🏠 Home Page
    @GetMapping("/home")
    public String home() {
        return "home";
    }

    // 📄 Add / Update / Delete Page
    @GetMapping("/amdcourse")
    public String amdCourse(Model m) {
        Course c = new Course();
        m.addAttribute("courseObj", c);
        return "amdcourse";
    }

    // ➕ Add | ✏️ Update | ❌ Delete
    @PostMapping("/saveCourse")
    public String saveCourse(@ModelAttribute("courseObj") Course c,
                             @RequestParam("b1") String op,
                             Model m) {
        if (op.equals("Add Course")) {
            if (daoimpl.addCourse(c))
                m.addAttribute("msg", "✅ Course Added Successfully");
            else
                m.addAttribute("msg", "❌ Course Could Not Be Added");
        }
        if (op.equals("Update Course")) {
            if (daoimpl.updateCourse(c))
                m.addAttribute("msg", "✅ Course Updated Successfully");
            else
                m.addAttribute("msg", "❌ Course Could Not Be Updated");
        }
        if (op.equals("Delete Course")) {
            if (daoimpl.deleteCourse(c))
                m.addAttribute("msg", "✅ Course Deleted Successfully");
            else
                m.addAttribute("msg", "❌ Course Could Not Be Deleted");
        }

        Course c1 = new Course();
        m.addAttribute("courseObj", c1);
        return "amdcourse";
    }

    // 📋 List all courses
    @GetMapping("/listcourse")
    public String getAllCourses(Model m) {
        List<Course> lst = daoimpl.getAllCourses();
        m.addAttribute("allcourse", lst);
        return "listcourse";
    }

    // 🔍 Search page
    @GetMapping("/searchcourse")
    public String searchCourse(Model m) {
        List<Course> lst = daoimpl.getAllCourses();
        m.addAttribute("allcourse", lst);
        return "searchcourse";	
    }

    // 🔎 Get Course by ID and forward to update page
    @PostMapping("/getCourse")
    public String getCourse(@RequestParam("s1") String cid, Model m) {
        int id = Integer.parseInt(cid);
        Course c = daoimpl.searchCourse(id);
        m.addAttribute("course", c);
        return "upgradecourse";
    }

    // ✏️ Update existing course
    @PostMapping("/upgradecourse")
    public String upgradeCourse(Course c, Model m) {
        if (daoimpl.updateCourse(c))
            m.addAttribute("msg", "✅ Course Updated Successfully");
        else
            m.addAttribute("msg", "❌ Course Could Not Be Updated");

        return "upgradecourse";
    }
}
