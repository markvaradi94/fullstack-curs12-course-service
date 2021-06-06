package ro.fasttrackit.curs12.course.service.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ro.fasttrackit.curs12.course.service.model.api.Course;
import ro.fasttrackit.curs12.course.service.service.CourseService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("courses")
@RequiredArgsConstructor
public class CourseController {
    private final CourseService service;

    @GetMapping
    public List<Course> findAllCourses() {
        return service.findAllCourses();
    }

    @GetMapping("{courseId}")
    public Course findCourse(@PathVariable String courseId) {
        return service.findCourse(courseId);
    }

    @PostMapping
    public Course addCourse(@Valid @RequestBody Course course) {
        return service.addCourse(course);
    }

    @DeleteMapping("{courseId}")
    public Course deleteCourse(@PathVariable String courseId) {
        return service.deleteCourse(courseId);
    }
}
