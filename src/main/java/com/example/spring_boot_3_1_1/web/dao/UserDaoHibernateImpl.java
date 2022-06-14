package com.example.spring_boot_3_1_1.web.dao;

import com.example.spring_boot_3_1_1.web.model.User;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoHibernateImpl implements UserDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void saveUser(User user) {
        entityManager.persist(user);
    }

    @Override
    public void removeUserById(long id) {
        entityManager.remove(getUserById(id));

    }

    @Override
    public void updateUser(User user) {
        entityManager.merge(user);
    }

    public List<User> getAllUsers() {
        return entityManager.createQuery("select u from User u", User.class).getResultList();
    }

    public User getUserById(long id) {
        return entityManager.find(User.class, id);
    }
}
