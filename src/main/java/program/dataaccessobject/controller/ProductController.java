package program.dataaccessobject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import program.dataaccessobject.repository.ProductRepository;

@RestController
public class ProductController {


    private final ProductRepository productRepository;


    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    @GetMapping("/products/fetch-product")
    public String fetchProduct(@RequestParam String name) {
        return productRepository.getProductName(name);
    }
}
