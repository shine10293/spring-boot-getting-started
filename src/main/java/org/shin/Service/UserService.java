package org.shin.Service;

import org.shin.Dao.UserDao;
import org.shin.Domain.User;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    final UserDao userDao;

    private UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public Optional<User> getUserById(String id) {
        return userDao.findById(id);
    }
}
