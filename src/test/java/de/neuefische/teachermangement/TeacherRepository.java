package de.neuefische.teachermangement;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.events.Event;

import java.util.HashMap;
import java.util.Map;



@Repository
public class TeacherRepository {
    private static String valuoOf;
    private final Map<String,Teacher> teachers = new HashMap<>();
    private String Id;

    public Teacher save (Teacher teacher){
        String Id = nextId();
        teacher.setId(Id);
        teachers.put(Id,teacher);
        return teacher;
    }

    private String nextId() {
        return Id;

    }


}





