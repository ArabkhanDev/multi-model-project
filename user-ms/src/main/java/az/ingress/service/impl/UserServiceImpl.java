package az.ingress.service.impl;

import az.ingress.entity.User;
import az.ingress.repository.UserRepository;
import az.ingress.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public Integer increaseCount(){

        User user = getStudent();
        user.setCount((user.getCount() != null ? user.getCount() : 0) + 1);
        userRepository.save(user);
        return user.getCount();


    }


    private User getStudent() {
        return userRepository.findById(1L).orElseGet(() -> {
            User user = new User();
            user.setCount(0);
            return userRepository.save(user);
        });
    }

}
