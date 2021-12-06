package com.app.checkkro.repository;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import com.app.checkkro.entity.Tyre;

@Repository
public interface TyreRepository extends JpaRepository<Tyre, Integer> {

	@Modifying
	@Query(value = "delete from car_tyre_details where tyre_model_size = ?1 and tyre_company_name = ?2 and car_id = ?3", nativeQuery = true)
	void deleteCartyreDetails(String tyreSize, String tyreCompanyName, int carid);

}
