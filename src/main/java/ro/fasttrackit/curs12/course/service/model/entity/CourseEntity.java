package ro.fasttrackit.curs12.course.service.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;

@Data
@Builder
@Document(collection = "courses")
@NoArgsConstructor
@AllArgsConstructor
public class CourseEntity {
    @Id
    private String id = ObjectId.get().toHexString();

    @NotNull
    private String discipline;

    @NotNull
    private String description;
}
