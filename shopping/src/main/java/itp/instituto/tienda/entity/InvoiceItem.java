package itp.instituto.tienda.entity;

import lombok.Data;


import javax.persistence.*;


@Entity
@Data
@Table(name = "tbl_invoice_items")
public class InvoiceItem  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double quantity;
    private Double  price;

    @Column(name = "product_id")
    private Long productId;


    @Transient
    private Double subTotal;



    public InvoiceItem(){
        this.quantity=(double) 0;
        this.price=(double) 0;

    }
}
