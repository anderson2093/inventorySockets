package company.roahn.inventoryBack.service.impl;

import company.roahn.inventoryBack.models.Inventory;
import company.roahn.inventoryBack.repository.IGenericRepo;
import company.roahn.inventoryBack.repository.IInventoryRepo;
import company.roahn.inventoryBack.service.IInventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class InventoryServiceImpl extends CRUDServiceImpl<Inventory, UUID> implements IInventoryService {

    @Autowired
    private IInventoryRepo repo;

    @Override
    protected IGenericRepo<Inventory, UUID> getRepo() {
        return repo;
    }
}
