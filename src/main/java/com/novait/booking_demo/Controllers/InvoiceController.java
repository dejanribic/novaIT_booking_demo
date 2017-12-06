package com.novait.booking_demo.Controllers;

import com.novait.booking_demo.Beans.Invoice;
import com.novait.booking_demo.Services.InvoiceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InvoiceController {

    private final Logger logger = LoggerFactory.getLogger(InvoiceController.class);

    private final InvoiceService invoiceService;

    @Autowired
    public InvoiceController(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }

    @RequestMapping("/invoices")
    public List<Invoice> getAllInvoices() {
        logger.info("\nTest: getting all invoices!\t");
        return invoiceService.getAllInvoices();
    }

    @RequestMapping(method = RequestMethod.PUT, value ="/invoices/{id}")
    public void updateInvoiceStatus(@RequestBody Integer status, @PathVariable Long id) {
        invoiceService.updateStatus(status, id);
    }

}