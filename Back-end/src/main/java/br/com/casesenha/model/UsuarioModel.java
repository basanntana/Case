package br.com.casesenha.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import jakarta.validation.constraints.*;
import lombok.Data;


@Entity
@Table(name = "tb_usuario")
public class UsuarioModel {

    @Id
    @GeneratedValue
    private Long id;

    @NotBlank(message = "Nome não informado")
    @Size(min = 5, max = 100, message = "O atributo nome deve conter no mínimo 05 e no máximo 100 caracteres")
    private String nome;

    @Email(message = "E-mail inválido")//Validação de email com anotação
    @NotBlank(message = "E-mail não informado")
    private String usuario;

    @NotBlank(message = "Senha não informada") // Dado não pode ficar nulo no Banco de Dados
    @Size(min = 9)//mínimo 9 caracteres no Banco de Dados
    @Pattern(regexp = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{9,13}$", message = "Ao menos um dígito")
    //Validação de caractéres com expressão regular

    private String senha;



}
