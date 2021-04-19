package tech.itpark.proggerhub;

import tech.itpark.proggerhub.di.Container;
import tech.itpark.proggerhub.repository.UserRepository;
import tech.itpark.proggerhub.service.UserService;

public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        container.register(UserRepository.class, UserService.class);
        container.wire();
    }

}
