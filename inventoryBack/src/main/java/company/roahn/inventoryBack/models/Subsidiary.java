package company.roahn.inventoryBack.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "subsidiaries")
public class Subsidiary {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID subsidiaryId=UUID.randomUUID();

    private String subsidiaryName;

    private String subsidiaryAddress;

    @OneToMany(mappedBy = "subsidiary",cascade = {CascadeType.ALL},orphanRemoval = true,fetch = FetchType.EAGER)
    private Set<Inventory>inventories;
}
