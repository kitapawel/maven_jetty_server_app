package io.github.mat3e;

import java.util.Optional;

public class LangRepository {
    Optional<Lang> findByID(Integer id){
        var session = HibernateUtil.getSessionFactory().openSession();
        var transaction = session.beginTransaction();
        var result = session.get(Lang.class, id);
        transaction.commit();
        session.close();
        return Optional.ofNullable(result);
    }
}
