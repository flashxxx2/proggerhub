package tech.itpark.proggerhub;

import tech.itpark.proggerhub.repository.UserRepository;
import tech.itpark.proggerhub.service.UserService;

public class Main {
    // psvm + Tab -> main
    public static void main(String[] args) {
        // TODO: MVP -> Minimal Valuable Product
        // videos
        // users/owners <-> consumers
        // Domain Model -> предметная область

        // 0. Plain Java (manual)
        // 1. Dependency Lookup

        // DZone -> var best practices
        // new RedisConnection(url);
        // new Cache(/*redisConnect*/)
        // cls/clazz = UserRepository.class
        // new clazz();
        final var repository = new UserRepository(/* datasource/connection, cache */); // ctrl + alt + v
        final var service = new UserService();
        // service.register(...);

        // Class - class, объекты, представляющие собой классы, загруженные в память JVM
        // 1. Читать
        // 2. Создавать
        // 3. Вызывать
    }
}
