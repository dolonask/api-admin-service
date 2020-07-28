package kg.easy.apiadminservice.services;

import kg.easy.apiadminservice.models.SessionInfo;
import kg.easy.apiadminservice.models.User;

public interface SessionService {

    SessionInfo auth(String login, String password);
    User getUserByToken(String token);
}
