package de.neuefische.teachermangement;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
@RequiredArgsConstructor
public class TeacherService {

    public final TeacherRepository teacherRepository;
    public List<Teacher> getTeachers(){
        return teacherRepository.findAll();
    }
    public Teacher create (Teacher teacher){
        return teacherRepository.save(teacher);
    }
}
