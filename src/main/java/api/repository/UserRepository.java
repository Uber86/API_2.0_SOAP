package api.repository;

import api.model.User;

@Repository
public interface UserRepository extends JpaRepository <User, Long {
}
