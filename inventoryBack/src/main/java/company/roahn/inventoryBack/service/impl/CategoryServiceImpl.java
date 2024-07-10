package company.roahn.inventoryBack.service.impl;

import company.roahn.inventoryBack.models.Category;
import company.roahn.inventoryBack.repository.ICategoryRepo;
import company.roahn.inventoryBack.repository.IGenericRepo;
import company.roahn.inventoryBack.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CategoryServiceImpl extends CRUDServiceImpl<Category, UUID> implements ICategoryService {

    @Autowired
    private ICategoryRepo repo;

    @Override
    protected IGenericRepo<Category, UUID> getRepo() {
        return repo;
    }
}
