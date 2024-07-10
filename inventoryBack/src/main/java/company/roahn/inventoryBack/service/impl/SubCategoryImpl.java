package company.roahn.inventoryBack.service.impl;

import company.roahn.inventoryBack.models.SubCategory;
import company.roahn.inventoryBack.repository.IGenericRepo;
import company.roahn.inventoryBack.repository.ISubCategoryRepo;
import company.roahn.inventoryBack.service.ISubCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class SubCategoryImpl extends CRUDServiceImpl<SubCategory, UUID> implements ISubCategoryService {

    @Autowired
    private ISubCategoryRepo repo;

    @Override
    protected IGenericRepo<SubCategory, UUID> getRepo() {
        return repo;
    }
}
