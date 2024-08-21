package springmvc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import springmvc.dao.UserDao;
import springmvc.model.User;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;
    public int createUser(User user) {
       return userDao.saveUser(user);
    }
}
