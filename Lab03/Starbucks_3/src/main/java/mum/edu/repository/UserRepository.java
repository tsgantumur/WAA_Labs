package mum.edu.repository;

import java.util.HashMap;

public interface UserRepository {

    public String getUser(String name);
    public String getPassword(String pass);
    public HashMap<String, String> getAll();
}
