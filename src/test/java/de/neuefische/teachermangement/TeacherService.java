package de.neuefische.teachermangement;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TeacherService {
    public final TeacherRepository teacherRepository;
    public Teacher create (Teacher teacher){
        return teacherRepository.save(teacher);
    }
}
