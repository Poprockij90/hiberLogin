package hibernet;

import hibernet.entity.UserHibernetUser;
import org.springframework.stereotype.Component;


public interface UserDao {
    void create(UserHibernetUser user);
    UserHibernetUser read(int id);
    void update (UserHibernetUser user);
    void delete (UserHibernetUser user);
    UserHibernetUser getUserByLogin(String first);
}
