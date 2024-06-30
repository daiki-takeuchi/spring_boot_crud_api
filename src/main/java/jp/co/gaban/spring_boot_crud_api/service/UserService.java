package jp.co.gaban.spring_boot_crud_api.service;

import jp.co.gaban.spring_boot_crud_api.model.User;
import jp.co.gaban.spring_boot_crud_api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

/**
 * Created by takeuchidaiki on 2024/06/30
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public User createUser(User user) {
        user.setCreatedAt(LocalDateTime.now());
        user.setUpdatedAt(LocalDateTime.now());
        return userRepository.save(user);
    }

    public User updateUser(Long id, User userDetails) {
        User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
        user.setUserName(userDetails.getUserName());
        user.setMail(userDetails.getMail());
        user.setPassword(userDetails.getPassword());
        user.setJob(userDetails.getJob());
        user.setSelfIntroduction(userDetails.getSelfIntroduction());
        user.setUpdatedAt(LocalDateTime.now());
        user.setUpdatedUser(userDetails.getUpdatedUser());
        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
