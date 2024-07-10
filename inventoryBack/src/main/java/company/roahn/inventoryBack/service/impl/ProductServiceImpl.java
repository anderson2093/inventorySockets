package company.roahn.inventoryBack.service.impl;

import company.roahn.inventoryBack.models.Product;
import company.roahn.inventoryBack.repository.IGenericRepo;
import company.roahn.inventoryBack.repository.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ProductServiceImpl extends CRUDServiceImpl<Product, UUID> {

    @Autowired
    private IProductRepo repo;

    @Override
    protected IGenericRepo<Product, UUID> getRepo() {
        return repo;
    }
}
