package company.roahn.inventoryBack.service.impl;

import company.roahn.inventoryBack.models.Order;
import company.roahn.inventoryBack.repository.IGenericRepo;
import company.roahn.inventoryBack.repository.IOrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class IOrderServiceImpl extends CRUDServiceImpl<Order, UUID> {

    @Autowired
    private IOrderRepo repo;

    @Override
    protected IGenericRepo<Order, UUID> getRepo() {
        return repo;
    }
}
