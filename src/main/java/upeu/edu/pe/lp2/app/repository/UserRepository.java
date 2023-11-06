/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package upeu.edu.pe.lp2.app.repository;

import java.util.Optional;
import upeu.edu.pe.lp2.infrastructure.entity.UserEntity;

/**
 *
 * @author Usuario
 */
public interface UserRepository {
     Iterable<UserEntity> getUserEntity();
	Optional<UserEntity> findById(Integer id);
	UserEntity save (UserEntity usuario);
	Optional<UserEntity> findByEmail(String email);
}
