package Users;

import java.util.Optional;

public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void register(String username, String password) {
        Optional <User> foundUser = userRepository.find(username);
        if(foundUser.isPresent()){
            throw new IllegalArgumentException("Users.User with " + username + " alerdy exists");
        }

        if(!User.isUsernameValid(username)){
            throw new IllegalArgumentException(username +
                    " Vallid username should have a lenght between " +
                    User.MIN_USERNAME_LENGTH + " and " + User.MAX_USERNAME_LENGTH);
        }

        User user = new User(username, password);
        userRepository.add(user);
    }
}
