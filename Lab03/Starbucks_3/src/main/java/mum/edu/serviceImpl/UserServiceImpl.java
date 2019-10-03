package mum.edu.serviceImpl;

import mum.edu.repository.UserRepository;
import mum.edu.service.AdviceService;
import mum.edu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    public String getUser(String name) {
        return userRepository.getUser(name);
    }

    public String getPassword(String pass) {
        return userRepository.getPassword(pass);
    }

    public HashMap<String, String> getAll() {
        return userRepository.getAll();
    }
}
