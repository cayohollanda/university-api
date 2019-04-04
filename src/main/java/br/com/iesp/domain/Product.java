package br.com.iesp.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

/**
 * @author Cayo Hollanda
 * 
 */
@Entity
@Table(name="tb_product")
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column
    private String description;

    @Column
    private String code;

    @Column
    private double value;

    public Product (){}

    public Product(Long id, String description, String code, double value){
        super();
        this.id = id;
        this.description = description;
        this.code = code;
        this.value = value;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getCode(){
        return code;
    }

    public void setCode(String code){
        this.code = code;
    }

    public double getValue(){
        return value;
    }

    public void setValue(double value){
        this.value = value;
    }

}