package uz.pdp.market.service;

import uz.pdp.market.repository.AbstractRepository;

/**
 * @author Husanov Asliddin Tue,15:26,29/03/22
 */
public abstract class AbstractRegisterService<
        R extends AbstractRepository> {
    private final R repository;

    protected AbstractRegisterService(R repository) {
        this.repository = repository;
    }
}
