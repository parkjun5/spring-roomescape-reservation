package roomescape.domain;

import roomescape.entity.User;

import java.util.Optional;

public class UserJdbcRepository implements UserRepository {

    private final JdbcTemplate jdbcTemplate;



    @Override
    public User save(User user) {

        return null;
    }

    @Override
    public Optional<Long> findIdByEmail(String email) {
        return Optional.empty();
    }

    @Override
    public Optional<User> findByEmailAndPassword(String email, String password) {
        return Optional.empty();
    }
}
