package company.roahn.inventoryBack.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "product_id")
    private UUID productId=UUID.randomUUID();

    private String productName;

    private String productDescription;

    private String productBrand;

    private Double productPrice;

    @ManyToOne
    @JoinColumn(name = "sub_category_id",nullable = false,foreignKey = @ForeignKey(name = "FK_PRODUCTS_SUBCATEGORY"))
    private SubCategory subCategory;

}
