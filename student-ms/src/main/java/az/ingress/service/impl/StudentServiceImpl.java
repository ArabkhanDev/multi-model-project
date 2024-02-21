package az.ingress.service.impl;

import az.ingress.entity.Student;
import az.ingress.repository.StudentRepository;
import az.ingress.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public Integer increaseCount(){

        Student student = getStudent();
        student.setCount((student.getCount() != null ? student.getCount() : 0) + 1);
        studentRepository.save(student);
        return student.getCount();


    }


    private Student getStudent() {
        return studentRepository.findById(1L).orElseGet(() -> {
            Student student = new Student();
            student.setCount(0);
            return studentRepository.save(student);
        });
    }

}
