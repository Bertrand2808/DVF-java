package fr.esgi.dvf.repository;

import fr.esgi.dvf.business.Transactions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionsRepository extends JpaRepository<Transactions, Long>{
}
