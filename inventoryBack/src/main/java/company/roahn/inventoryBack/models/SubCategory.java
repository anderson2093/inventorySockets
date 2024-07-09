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
@Table(name = "sub_categories")
public class SubCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "sub_category_id")
    private UUID subCategoryId=UUID.randomUUID();

    private String subCategoryName;

    @ManyToOne
    @JoinColumn(name = "category_id",nullable = false,foreignKey = @ForeignKey(name = "FK_SUBCATEGORIES_CATEGORY"))
    private Category category;
}
