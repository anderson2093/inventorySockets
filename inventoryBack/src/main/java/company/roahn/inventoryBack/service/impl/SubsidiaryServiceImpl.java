package company.roahn.inventoryBack.service.impl;

import company.roahn.inventoryBack.models.Subsidiary;
import company.roahn.inventoryBack.repository.IGenericRepo;
import company.roahn.inventoryBack.repository.ISubsidiaryRepo;
import company.roahn.inventoryBack.service.ISubsidiaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class SubsidiaryServiceImpl extends CRUDServiceImpl<Subsidiary, UUID> implements ISubsidiaryService {

    @Autowired
    private ISubsidiaryRepo repo;

    @Override
    protected IGenericRepo<Subsidiary, UUID> getRepo() {
        return repo;
    }
}
