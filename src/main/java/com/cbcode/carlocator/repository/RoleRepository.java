package com.cbcode.carlocator.repository;

import com.cbcode.carlocator.enums.RoleName;
import com.cbcode.carlocator.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByRoleName(RoleName roleName);
}
