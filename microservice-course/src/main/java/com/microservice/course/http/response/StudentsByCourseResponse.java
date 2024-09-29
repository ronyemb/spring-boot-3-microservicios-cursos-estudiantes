package com.microservice.course.http.response;

import java.util.List;
import com.microservice.course.dto.StudentDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentsByCourseResponse {

    private String courseName;
    private String teacher;
    private List<StudentDTO> StudentDTOList;


}
