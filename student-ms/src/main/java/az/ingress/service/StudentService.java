package az.ingress.service;

import az.ingress.entity.Student;
import az.ingress.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;



public interface StudentService {

    Integer increaseCount();

}
