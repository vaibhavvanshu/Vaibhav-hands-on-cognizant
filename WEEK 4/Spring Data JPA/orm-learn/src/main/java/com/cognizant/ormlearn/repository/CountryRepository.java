package com.cognizant.ormlearn.repository;
import com.cognizant.ormlearn.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author ivek5
 **/
/**
 * Repository interface for Country entity.
 * JpaRepository provides CRUD operations.
 */
@Repository
public interface CountryRepository extends JpaRepository<Country, String> {

}