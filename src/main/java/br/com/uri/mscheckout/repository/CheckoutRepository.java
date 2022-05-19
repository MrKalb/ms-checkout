package br.com.uri.mscheckout.repository;

import br.com.uri.mscheckout.entities.CheckoutEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckoutRepository extends JpaRepository<CheckoutEntity, Long> {
}
