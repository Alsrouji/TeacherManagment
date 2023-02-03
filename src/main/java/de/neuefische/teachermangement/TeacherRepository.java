package de.neuefische.teachermangement;
import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface TeacherRepository extends MongoRepository<Teacher, String> {
}








