package com.iviberberi.app.ws.io.repositories;

import com.iviberberi.app.ws.io.entity.PasswordResetTokenEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PasswordResetTokenRepository extends CrudRepository<PasswordResetTokenEntity,Long> {
    PasswordResetTokenEntity findByToken(String token);
}
