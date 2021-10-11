package api;

import model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

public class UserApiImpl implements UserApiDelegate{

    @Override
    public ResponseEntity<User> getUserDetailsById(Long userId) {
        User user = new User();
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<User> saveUser(User user) {
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
}
