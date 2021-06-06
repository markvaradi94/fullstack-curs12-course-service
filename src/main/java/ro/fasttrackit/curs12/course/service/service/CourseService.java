package ro.fasttrackit.curs12.course.service.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ro.fasttrackit.curs12.course.service.exceptions.CourseNotFoundException;
import ro.fasttrackit.curs12.course.service.model.api.Course;
import ro.fasttrackit.curs12.course.service.model.entity.CourseEntity;
import ro.fasttrackit.curs12.course.service.model.mapper.CourseMapper;
import ro.fasttrackit.curs12.course.service.repository.CourseRepository;

import java.util.List;

import static java.util.Collections.unmodifiableList;

@Service
@RequiredArgsConstructor
public class CourseService {
    private final CourseMapper mapper;
    private final CourseRepository courseRepository;

    public List<Course> findAllCourses() {
        return mapper.toApi(
                unmodifiableList(courseRepository.findAll())
        );
    }

    public Course findCourse(String courseId) {
        return mapper.toApi(getOrThrow(courseId));
    }

    public Course addCourse(Course newCourse) {
        return mapper.toApi(
                courseRepository.save(
                        mapper.toEntity(newCourse)
                )
        );
    }

    public Course deleteCourse(String courseId) {
        CourseEntity courseToDelete = getOrThrow(courseId);
        courseRepository.delete(courseToDelete);
        return mapper.toApi(courseToDelete);
    }

    private CourseEntity getOrThrow(String courseId) {
        return courseRepository.findById(courseId)
                .orElseThrow(() -> new CourseNotFoundException("Could not find course"));
    }
}
