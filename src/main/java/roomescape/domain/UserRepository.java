package roomescape.domain;

import roomescape.entity.User;

import java.util.Optional;

public interface UserRepository {
    User save(User user);
    Optional<Long> findIdByEmail(String email);
    Optional<User> findByEmailAndPassword(String email, String password);
}
