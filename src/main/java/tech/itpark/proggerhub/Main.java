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

        // DZone -> var best practices
        // new RedisConnection(url);
        // new Cache(/*redisConnect*/)
        final var repository = new UserRepository(/* datasource/connection, cache */); // ctrl + alt + v
        final var service = new UserService(repository);
        // service.register(...);
    }
}
