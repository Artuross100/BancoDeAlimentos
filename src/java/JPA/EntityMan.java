package JPA;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public final class EntityMan {

    private static EntityManagerFactory enf = Persistence.createEntityManagerFactory("BancoAlimentosDiocesisPU");

    public EntityMan() {
    }

    public static EntityManagerFactory getInstance() {
        return enf;
    }

}
