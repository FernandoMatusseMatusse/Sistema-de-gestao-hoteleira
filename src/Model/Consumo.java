/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author FMatusse
 */

@Entity
@Table(name = "consumo")
public class Consumo  implements Serializable {
    @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)       
    protected int id;
   
    @Column
    protected String anexo;
   @Column
    protected double preco;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the anexo
     */
    public String getAnexo() {
        return anexo;
    }

    /**
     * @param anexo the anexo to set
     */
    public void setAnexo(String anexo) {
        this.anexo = anexo;
    }

    /**
     * @return the preco
     */
    public double getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }
}
