package product.domain;

import product.domain.*;
import product.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class ProductChanged extends AbstractEvent {

    private Long id;
    private String name;
    private Integer stock;

    public ProductChanged(Product aggregate){
        super(aggregate);
    }
    public ProductChanged(){
        super();
    }
}
