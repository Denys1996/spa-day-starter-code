package org.launchcode.spaday.data;
import org.launchcode.spaday.models.User;

import java.util.ArrayList;
import java.util.HashMap;

public class UserData {

    ArrayList<User> users = new ArrayList<>();

    public void add(User user) {
        users.add(user);
    }

    public ArrayList<User> getAll() {
        return this.users;
    }

    public User getById(String id) {
        for(int i=0; i< users.size(); i ++) {
            if (users.get(i).getId().equals(String.valueOf(id))) {
                return users.get(i);
            }
        }
    return null;
    }
}
