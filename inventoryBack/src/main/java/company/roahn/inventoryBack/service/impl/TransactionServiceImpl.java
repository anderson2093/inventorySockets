package company.roahn.inventoryBack.service.impl;

import company.roahn.inventoryBack.models.Transaction;
import company.roahn.inventoryBack.repository.IGenericRepo;
import company.roahn.inventoryBack.repository.ITransactionRepo;
import company.roahn.inventoryBack.service.ITransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class TransactionServiceImpl extends CRUDServiceImpl<Transaction, UUID> implements ITransactionService {

    @Autowired
    private ITransactionRepo repo;

    @Override
    protected IGenericRepo<Transaction, UUID> getRepo() {
        return repo;
    }
}
