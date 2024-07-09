package company.roahn.inventoryBack.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "inventory_details")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "transaction_id")
    private UUID transactionId=UUID.randomUUID();

    @Enumerated(EnumType.STRING)
    private TransactionType inventoryTransaction;

    private Integer transactionQuantity;

    private Instant transactionDate;

    @ManyToOne
    @JoinColumn(name = "inventory_id",nullable = false,foreignKey = @ForeignKey(name = "FK_TRANSACTIONS_INVENTORY"))
    private Inventory inventory;
}
