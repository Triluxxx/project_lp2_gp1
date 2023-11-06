/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package upeu.edu.pe.lp2.infrastructure.entity.adapter;

import org.springframework.data.repository.CrudRepository;
import upeu.edu.pe.lp2.infrastructure.entity.ProductEntity;
import upeu.edu.pe.lp2.infrastructure.entity.UserEntity;

/**
 *
 * @author Usuario
 */
public interface ProductCrudRepository extends CrudRepository <ProductEntity, Integer>{
    Iterable<ProductEntity> findProductsByUser (UserEntity user);
    
}
