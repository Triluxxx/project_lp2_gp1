/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package upeu.edu.pe.lp2.infrastructure.entity.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import upeu.edu.pe.lp2.app.repository.ProductRepository;
import upeu.edu.pe.lp2.app.repository.StockRepository;
import upeu.edu.pe.lp2.app.service.ProductService;
import upeu.edu.pe.lp2.app.service.StockService;
import upeu.edu.pe.lp2.app.service.UploadFile;

/**
 *
 * @author Usuario
 */
@Configuration
public class BeanConfiguration {

    @Bean
    public ProductService productService(ProductRepository productRepository, UploadFile uploadfile) {
        return new ProductService(productRepository);
    }

    @Bean
    public StockService stockService(StockRepository stockRepository) {
        return new StockService(stockRepository);
    }

    @Bean
    public UploadFile uploadFile() {
        return new UploadFile();
    }
}
