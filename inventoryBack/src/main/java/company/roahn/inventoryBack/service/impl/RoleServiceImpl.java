package company.roahn.inventoryBack.service.impl;

import company.roahn.inventoryBack.models.Role;
import company.roahn.inventoryBack.repository.IGenericRepo;
import company.roahn.inventoryBack.repository.IRoleRepo;
import company.roahn.inventoryBack.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class RoleServiceImpl extends CRUDServiceImpl<Role, UUID> implements IRoleService {

    @Autowired
    private IRoleRepo repo;

    @Override
    protected IGenericRepo<Role, UUID> getRepo() {
        return repo;
    }
}
