package jp.co.gaban.spring_boot_crud_api.repository;

import jp.co.gaban.spring_boot_crud_api.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Created by takeuchidaiki on 2024/06/30
 */
public interface AppUserRepository extends JpaRepository<AppUser, Long> {
    Optional<AppUser> findByUsername(String username);
}
