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
@Table(name = "quarto")
public class Quarto implements Serializable{
    
    @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)       
    protected int id;
    @Column
   protected String numero;
@Column
   protected String descricao;
@Column
   protected String categoria;
@Column
   protected Double precoDiario;
@Column
   protected String estado;
@Column
   protected String tipoQuarto;

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
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * @return the precoDiario
     */
    public Double getPrecoDiario() {
        return precoDiario;
    }

    /**
     * @param precoDiario the precoDiario to set
     */
    public void setPrecoDiario(Double precoDiario) {
        this.precoDiario = precoDiario;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the tipoQuarto
     */
    public String getTipoQuarto() {
        return tipoQuarto;
    }

    /**
     * @param tipoQuarto the tipoQuarto to set
     */
    public void setTipoQuarto(String tipoQuarto) {
        this.tipoQuarto = tipoQuarto;
    }
}
