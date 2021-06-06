package ro.fasttrackit.curs12.course.service.bootstrap;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ro.fasttrackit.curs12.course.service.model.api.Course;
import ro.fasttrackit.curs12.course.service.service.CourseService;

@Component
@RequiredArgsConstructor
public class DataLoader implements CommandLineRunner {
    private final CourseService service;

    @Override
    public void run(String... args) throws Exception {
//        service.addCourse(Course.builder()
//                .discipline("Physics")
//                .description("101 - Beginners")
//                .build());
//        service.addCourse(Course.builder()
//                .discipline("Mathematics")
//                .description("201 - Intermediate")
//                .build());
//        service.addCourse(Course.builder()
//                .discipline("Astronomy")
//                .description("301 - Advanced")
//                .build());
//        service.addCourse(Course.builder()
//                .discipline("Chemistry")
//                .description("101 - Beginners")
//                .build());
    }
}
