package net.javaguides.springboot.repository;

import net.javaguides.springboot.entity.Wikimedia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WikiRepository extends JpaRepository<Wikimedia, Long> {

}
