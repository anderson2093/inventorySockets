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
@Table(name = "order_details")
public class OrderDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "order_detail_id")
    private UUID orderDetailId=UUID.randomUUID();

    private Integer orderDetailQuantity;

    @ManyToOne
    @JoinColumn(name = "order_id",nullable = false,foreignKey = @ForeignKey(name = "FK_ORDERDETAILS_ORDER"))
    private Order order;

    @ManyToOne
    @JoinColumn(name = "inventory_id",nullable = false,foreignKey = @ForeignKey(name = "FK_ORDERDETAILS_INVENTORY"))
    private Inventory inventory;
}
