/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package upeu.edu.pe.lp2.infrastructure.entity.adapter;

import java.util.Optional;
import org.springframework.stereotype.Repository;
import upeu.edu.pe.lp2.app.repository.UserRepository;
import upeu.edu.pe.lp2.infrastructure.entity.UserEntity;

/**
 *
 * @author Usuario
 */
@Repository
public class UserRepositoryImpl implements UserRepository {

    private final UserCrudRepository userCrudRepository;

    public UserRepositoryImpl(UserCrudRepository userCrudRepository) {
        this.userCrudRepository = userCrudRepository;

    }

    @Override
    public  Iterable<UserEntity> getUserEntity() {
        return userCrudRepository.findAll();
    }

    @Override
    public Optional<UserEntity> findById(Integer id) {
        return userCrudRepository.findById(id);
    }

    @Override
    public UserEntity save(UserEntity usuario) {
       return userCrudRepository.save(usuario);
	}

    @Override
    public Optional<UserEntity> findByEmail(String email) {
    return userCrudRepository.findByEmail(email);

    }

}
