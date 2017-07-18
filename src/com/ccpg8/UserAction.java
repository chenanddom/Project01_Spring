package com.ccpg8;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by lenovo on 2017/7/18.
 */
@Controller("userActionId")
public class UserAction {
    @Autowired
private UserService userService;
    public void executeAction(User user){
        userService.registerUser(user);
    }
}
