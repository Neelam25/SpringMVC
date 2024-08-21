package springmvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import springmvc.model.User;


@Component
public class UserDao {

     @Autowired
     private JdbcTemplate jdbcTemplate;

    public int saveUser(User user) {
        String query = "insert into user values(?,?,?,?)";
       return this.jdbcTemplate.update(query,user.getUserName(),user.getEmail(),user.getPassword());
    }
}
