package kg.easy.apiadminservice.services.impl;

import kg.easy.apiadminservice.microservices.login_service.LoginServiceProxy;
import kg.easy.apiadminservice.models.SessionInfo;
import kg.easy.apiadminservice.models.User;
import kg.easy.apiadminservice.services.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SessionServiceImpl implements SessionService {

    @Autowired
    private LoginServiceProxy loginServiceProxy;


    @Override
    public SessionInfo auth(String login, String password) {
        return loginServiceProxy.auth(login, password);
    }

    @Override
    public User getUserByToken(String token) {
        return loginServiceProxy.checkSession(token);
    }
}
