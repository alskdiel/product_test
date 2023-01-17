package product.domain;

import product.domain.ProductChanged;
import product.ProductApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Product_table")
@Data

public class Product  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String name;
    
    
    
    
    
    private Integer stock;

    @PostPersist
    public void onPostPersist(){


        ProductChanged productChanged = new ProductChanged(this);
        productChanged.publishAfterCommit();

    }

    public static ProductRepository repository(){
        ProductRepository productRepository = ProductApplication.applicationContext.getBean(ProductRepository.class);
        return productRepository;
    }






}
