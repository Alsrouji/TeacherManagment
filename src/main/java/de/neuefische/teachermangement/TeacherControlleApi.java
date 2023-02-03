package de.neuefische.teachermangement;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping( "/api/teachers")

public class TeacherControlleApi {
private final TeacherService teacherService;
@GetMapping
   public List<Teacher> getTeachers() {
    return teacherService.getTeachers();
}

        @PostMapping
        public Teacher create (@RequestBody Teacher teacher){
            return teacherService.create(teacher);

        }



}
