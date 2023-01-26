package de.neuefische.teachermangement;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( "/Api/Teachers")

public class TeacherControlleApi {


    public class TeacherController{
        @PostMapping
        public Teacher create (@RequestBody Teacher teacher){
            return teacher;
        }
    }
}
