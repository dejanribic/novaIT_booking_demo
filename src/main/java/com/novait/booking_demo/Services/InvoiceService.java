package com.novait.booking_demo.Services;

import com.novait.booking_demo.Beans.Invoice;
import com.novait.booking_demo.Repositories.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
@Service
public class InvoiceService {

    private InvoiceRepository invoiceRepository;

    @Autowired
    public InvoiceService(InvoiceRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    public List<Invoice> getAllInvoices() {
        List<Invoice> invoices = new ArrayList<>();
        invoiceRepository.findAll().forEach(invoices::add);
        return invoices;
    }

    public void updateStatus(Integer status, Long id) {
        Invoice invoiceToChange = invoiceRepository.findByInvoiceId(id);
        invoiceToChange.setStatus(status);
        invoiceRepository.save(invoiceToChange);
    }

    public void listAllInvoices() {
        List<Invoice> invoices = new ArrayList<>();
        invoiceRepository.findAll().forEach(invoices::add);
        for (Invoice invoice : invoices) {
            System.out.println(invoice.toString());
        }
    }
}
