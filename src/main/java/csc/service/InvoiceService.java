package csc.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import csc.models.Customer;
import csc.models.Invoice;

public interface InvoiceService {
	
	Invoice findById(long id);
		
	void saveInvoice(Invoice invoice);
	
	void updateInvoice(Invoice invoice);
	
	void deleteInvoiceById(long id);

	Page<Invoice> findAllInvoice(Pageable pageable);
	
	Page<Invoice> findByIdCustomer(Customer idcustomer, Pageable pageable);
}