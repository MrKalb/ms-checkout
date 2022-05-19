package br.com.uri.mscheckout.entities;

import lombok.Data;
import org.hibernate.annotations.Generated;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "checkout")
@Data
public class CheckoutEntity implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String orderId;

    private String productId;

}
