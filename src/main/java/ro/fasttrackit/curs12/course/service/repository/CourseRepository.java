package ro.fasttrackit.curs12.course.service.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import ro.fasttrackit.curs12.course.service.model.entity.CourseEntity;

public interface CourseRepository extends MongoRepository<CourseEntity, String> {
}
