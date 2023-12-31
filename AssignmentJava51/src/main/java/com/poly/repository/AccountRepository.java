package com.poly.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.poly.entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer>{
	Account findByUsernameAndPassword(String username, String password);
	Account findByUsername(String username);
	Page<Account> findAllByActive(boolean active, Pageable pageable);
}
