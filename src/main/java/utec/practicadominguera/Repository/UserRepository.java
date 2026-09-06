package utec.practicadominguera.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import utec.practicadominguera.Model.User;

public interface UserRepository extends JpaRepository<User,String> {

}
