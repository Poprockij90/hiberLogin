package hibernet;

import hibernet.entity.UserHibernetUser;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.Query;

@Component
@Transactional
public class UserDaoImpl implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void create(UserHibernetUser user) {
    sessionFactory.getCurrentSession().save(user);
    }

    @Override
    public UserHibernetUser read(int id) {
        return sessionFactory.getCurrentSession().get(UserHibernetUser.class, id);
    }


    @Override
    public void update(UserHibernetUser user) {
    sessionFactory.getCurrentSession().update(user);
    }

    @Override
    public void delete(UserHibernetUser user) {
        sessionFactory.getCurrentSession().delete(user);

    }

    @Override
    public UserHibernetUser getUserByLogin(String first) {
        //указываем класс и его поля
        //то есть поиск по обьктам по полям
        String userHQL = "FROM UserHibCl WHERE first = :key";
        Query query = sessionFactory.getCurrentSession().createQuery(userHQL);
        query.setParameter("key", first);

        return (UserHibernetUser) ((org.hibernate.query.Query) query).uniqueResult();
    }
}
