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
@Table(name = "ocupacao")
public class Ocupacao implements Serializable {
    @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)       
    protected int id;
    @Column
 protected String Quarto;
@Column
   protected Funcionario nomeFuncionario;
@Column
 protected String nomeHospede;
@Column
 protected String dataReserva;
@Column
 protected String dataEntrada;
@Column
 protected String dataSaida;
@Column
 protected String consumo;
@Column
 protected double qtdConsumo;
@Column
 protected double precoConsumo;
@Column
 protected String anexo;
@Column
 protected double qtdAnexo;
@Column
 protected double precoAnexo;
@Column
 protected String estado;
@Column
 protected double precoTotal;
@Column
 protected double precoQuarto;

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
     * @return the Quarto
     */
    public String getQuarto() {
        return Quarto;
    }

    /**
     * @param Quarto the Quarto to set
     */
    public void setQuarto(String Quarto) {
        this.Quarto = Quarto;
    }

    /**
     * @return the nomeFuncionario
     */
    public Funcionario getNomeFuncionario() {
        return nomeFuncionario;
    }

    /**
     * @param nomeFuncionario the nomeFuncionario to set
     */
    public void setNomeFuncionario(Funcionario nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    /**
     * @return the nomeHospede
     */
    public String getNomeHospede() {
        return nomeHospede;
    }

    /**
     * @param nomeHospede the nomeHospede to set
     */
    public void setNomeHospede(String nomeHospede) {
        this.nomeHospede = nomeHospede;
    }

    /**
     * @return the dataReserva
     */
    public String getDataReserva() {
        return dataReserva;
    }

    /**
     * @param dataReserva the dataReserva to set
     */
    public void setDataReserva(String dataReserva) {
        this.dataReserva = dataReserva;
    }

    /**
     * @return the dataEntrada
     */
    public String getDataEntrada() {
        return dataEntrada;
    }

    /**
     * @param dataEntrada the dataEntrada to set
     */
    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    /**
     * @return the dataSaida
     */
    public String getDataSaida() {
        return dataSaida;
    }

    /**
     * @param dataSaida the dataSaida to set
     */
    public void setDataSaida(String dataSaida) {
        this.dataSaida = dataSaida;
    }

    /**
     * @return the consumo
     */
    public String getConsumo() {
        return consumo;
    }

    /**
     * @param consumo the consumo to set
     */
    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }

    /**
     * @return the qtdConsumo
     */
    public double getQtdConsumo() {
        return qtdConsumo;
    }

    /**
     * @param qtdConsumo the qtdConsumo to set
     */
    public void setQtdConsumo(double qtdConsumo) {
        this.qtdConsumo = qtdConsumo;
    }

    /**
     * @return the precoConsumo
     */
    public double getPrecoConsumo() {
        return precoConsumo;
    }

    /**
     * @param precoConsumo the precoConsumo to set
     */
    public void setPrecoConsumo(double precoConsumo) {
        this.precoConsumo = precoConsumo;
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
     * @return the qtdAnexo
     */
    public double getQtdAnexo() {
        return qtdAnexo;
    }

    /**
     * @param qtdAnexo the qtdAnexo to set
     */
    public void setQtdAnexo(double qtdAnexo) {
        this.qtdAnexo = qtdAnexo;
    }

    /**
     * @return the precoAnexo
     */
    public double getPrecoAnexo() {
        return precoAnexo;
    }

    /**
     * @param precoAnexo the precoAnexo to set
     */
    public void setPrecoAnexo(double precoAnexo) {
        this.precoAnexo = precoAnexo;
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
     * @return the precoTotal
     */
    public double getPrecoTotal() {
        return precoTotal;
    }

    /**
     * @param precoTotal the precoTotal to set
     */
    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }

    /**
     * @return the precoQuarto
     */
    public double getPrecoQuarto() {
        return precoQuarto;
    }

    /**
     * @param precoQuarto the precoQuarto to set
     */
    public void setPrecoQuarto(double precoQuarto) {
        this.precoQuarto = precoQuarto;
    }
    
}
