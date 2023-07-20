
package com.example.repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.entity.State;



@Repository
@Transactional
public interface StateRepository extends JpaRepository<State,Integer>{

	@Modifying
	@Query("update State state set state.stateName = :name where state.stateId = :id")
	void update(@Param("name") String name, @Param("id") int id);

	
	
}
