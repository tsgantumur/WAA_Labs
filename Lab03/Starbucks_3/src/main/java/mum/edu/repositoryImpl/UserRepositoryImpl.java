package mum.edu.repositoryImpl;

import mum.edu.repository.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class UserRepositoryImpl implements UserRepository {

    private static HashMap<String, String> users = new HashMap<String, String>();

    public UserRepositoryImpl() {
        users.put("Dave", "111");
        users.put("Steve", "222");
        users.put("Ralph", "333");
    }

    public String getUser(String name) {
        for(String key : users.keySet()) {
            if(name.equals(key)) {
                return key;
            }
        }

        return null;
    }

    public String getPassword(String pass) {
        for(String val : users.values()) {
            if(pass.equals(val)) {
                return val;
            }
        }

        return null;
    }

    public HashMap<String, String> getAll() {
        return users;
    }
}
