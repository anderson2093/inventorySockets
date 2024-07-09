package company.roahn.inventoryBack.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "inventories")
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "inventory_id")
    private UUID inventoryId=UUID.randomUUID();

    private Integer inventoryStock;

    private String color;

    @ManyToOne
    @JoinColumn(name = "product_id",nullable = false,foreignKey = @ForeignKey(name = "FK_INVENTORIES_PRODUCT"))
    private Product product;

    @ManyToOne
    @JoinColumn(name = "subsidiary_id",nullable = false,foreignKey = @ForeignKey(name = "FK_INVENTORIES_SUBSIDIARY"))
    private Subsidiary subsidiary;

    @OneToMany(mappedBy = "inventory",cascade = {CascadeType.ALL},orphanRemoval = true,fetch = FetchType.EAGER)
    private Set<OrderDetail>orderDetails;

    @OneToMany(mappedBy = "inventory",cascade = {CascadeType.ALL},orphanRemoval = true,fetch = FetchType.EAGER)
    private List<Transaction>transactions;
}
