package com.example.repo;

import javax.transaction.Transactional;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.InvoiceHeader;



@Repository
@Transactional
public interface InvoiceHeaderRepo extends JpaRepository< InvoiceHeader , Integer >
{
	List<InvoiceHeader > findAll();
}