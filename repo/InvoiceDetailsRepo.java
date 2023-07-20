package com.example.repo;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.InvoiceDetails;


@Repository
@Transactional
public interface InvoiceDetailsRepo extends JpaRepository< InvoiceDetails , Integer >
{
	List<InvoiceDetails > findAll();

	Optional<List<InvoiceDetails>> findAllByinvoicedetailsid(int invoiceId);

}

