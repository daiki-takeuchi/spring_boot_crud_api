package jp.co.gaban.spring_boot_crud_api.repository;

import jp.co.gaban.spring_boot_crud_api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by takeuchidaiki on 2024/06/30
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
