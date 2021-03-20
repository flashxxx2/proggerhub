package tech.itpark.proggerhub.service;

import tech.itpark.proggerhub.dl.ServiceRegistry;
import tech.itpark.proggerhub.exception.UnmetDependencyException;
import tech.itpark.proggerhub.repository.UserRepository;

public class UserService {
    private final UserRepository repository;

    public UserService() {
        // 1. гвоздями прибито к ServiceRegistry
        // 2. замучаешься тестировать
        repository = (UserRepository) ServiceRegistry
                .getInstance()
                .lookupOptional(UserRepository.class)
                .orElseThrow(() ->
                        new UnmetDependencyException(
                                UserRepository.class.getName()
                        )
                );
    }
}
