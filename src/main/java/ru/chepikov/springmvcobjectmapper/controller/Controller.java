package ru.chepikov.springmvcobjectmapper.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.chepikov.springmvcobjectmapper.entity.Customer;
import ru.chepikov.springmvcobjectmapper.entity.Product;
import ru.chepikov.springmvcobjectmapper.repository.CustomerRepository;
import ru.chepikov.springmvcobjectmapper.repository.OrderRepository;
import ru.chepikov.springmvcobjectmapper.repository.ProductRepository;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    ObjectMapper objectMapper;

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    ProductRepository productRepository;

    @GetMapping("/customers")
    public String getAllCustomers() throws JsonProcessingException {
        List<Customer> list = customerRepository.findAll();
        return objectMapper.writeValueAsString(list);
    }

    @GetMapping("/products")
    public String getAllProducts() throws JsonProcessingException{
        List<Product> list = productRepository.findAll();
        return objectMapper.writeValueAsString(list);
    }

    @GetMapping("/products/{productId}")
    public String getAllProducts(@PathVariable Long productId) throws JsonProcessingException {
        Product product = productRepository.findById(productId).orElse(null);
        return objectMapper.writeValueAsString(product);
    }

    @PostMapping("/products/create")
    public String createProduct(@RequestBody String productJson) throws JsonProcessingException {
        Product saveProduct = productRepository.save(objectMapper.readValue(productJson, Product.class));
        return objectMapper.writeValueAsString(saveProduct);
    }

    @PutMapping("/products/update/{productId}")
    public Product updateProduct(@PathVariable Long productId, @RequestBody Product product) {
        product.setProductId(productId);
        return productRepository.save(product);
    }

    @DeleteMapping("/products/delete/{productId}")
    public void deleteProduct(@PathVariable Long productId) {
        productRepository.deleteById(productId);
    }
}
