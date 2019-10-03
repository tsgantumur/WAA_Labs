package mum.edu.service;

import java.util.HashMap;

public interface UserService {
    public String getUser(String name);
    public String getPassword(String pass);
    public HashMap<String, String> getAll();
}
