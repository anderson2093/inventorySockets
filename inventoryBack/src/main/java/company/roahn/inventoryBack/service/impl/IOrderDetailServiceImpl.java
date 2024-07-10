package company.roahn.inventoryBack.service.impl;

import company.roahn.inventoryBack.models.OrderDetail;
import company.roahn.inventoryBack.repository.IGenericRepo;
import company.roahn.inventoryBack.repository.IOrderDetailRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class IOrderDetailServiceImpl extends CRUDServiceImpl<OrderDetail, UUID> {

    @Autowired
    private IOrderDetailRepo repo;

    @Override
    protected IGenericRepo<OrderDetail, UUID> getRepo() {
        return repo;
    }
}
