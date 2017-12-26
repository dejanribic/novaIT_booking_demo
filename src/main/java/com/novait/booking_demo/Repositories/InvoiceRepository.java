package com.novait.booking_demo.Repositories;

import com.novait.booking_demo.Models.Entities.Invoice;
import org.springframework.data.repository.CrudRepository;

public interface InvoiceRepository extends CrudRepository<Invoice, Long> {
    Invoice findByInvoiceId(Long id);
}