package company.roahn.inventoryBack.service.impl;


import company.roahn.inventoryBack.repository.IGenericRepo;
import company.roahn.inventoryBack.service.ICRUDService;
import jakarta.transaction.Transactional;

import java.util.List;

public abstract class CRUDServiceImpl<T, ID> implements ICRUDService<T, ID> {

    protected abstract IGenericRepo<T, ID> getRepo();

    @Transactional
    @Override
    public T save(T t) {
        return getRepo().save(t);
    }

    @Transactional
    @Override
    public T update(T t) {
        return getRepo().save(t);
    }

    @Override
    public T findById(ID id) {
        return null;
    }

    @Override
    public List<T> findAll() {
        return getRepo().findAll();
    }

    @Transactional
    @Override
    public void delete(ID id) {
        getRepo().deleteById(id);

    }
}
