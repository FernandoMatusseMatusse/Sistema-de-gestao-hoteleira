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
@Table(name ="funcionario")
public class Funcionario implements Serializable{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)       
protected int id;  
     @Column
  protected String nome;
    @Column
protected String sexo;
    @Column
protected String telefone;
    @Column
protected String morada;
    @Column
protected String documento_Identificacao;
    @Column
protected String numero_Documento;
    @Column
 protected String data_Nascimento;
        @Column
 protected String cargo;
    @Column
 protected double salario;
    @Column
  protected String usuario;
    @Column
 protected String senha;

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
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the morada
     */
    public String getMorada() {
        return morada;
    }

    /**
     * @param morada the morada to set
     */
    public void setMorada(String morada) {
        this.morada = morada;
    }

    /**
     * @return the documento_Identificacao
     */
    public String getDocumento_Identificacao() {
        return documento_Identificacao;
    }

    /**
     * @param documento_Identificacao the documento_Identificacao to set
     */
    public void setDocumento_Identificacao(String documento_Identificacao) {
        this.documento_Identificacao = documento_Identificacao;
    }

    /**
     * @return the numero_Documento
     */
    public String getNumero_Documento() {
        return numero_Documento;
    }

    /**
     * @param numero_Documento the numero_Documento to set
     */
    public void setNumero_Documento(String numero_Documento) {
        this.numero_Documento = numero_Documento;
    }

    /**
     * @return the data_Nascimento
     */
    public String getData_Nascimento() {
        return data_Nascimento;
    }

    /**
     * @param data_Nascimento the data_Nascimento to set
     */
    public void setData_Nascimento(String data_Nascimento) {
        this.data_Nascimento = data_Nascimento;
    }

    /**
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }
  
    
    
    
}
