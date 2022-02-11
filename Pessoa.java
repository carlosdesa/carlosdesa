package study.javaproject;

import java.time.LocalDate;

public class Pessoa {
    
    private String nome;
    private LocalDate dtNasc;
    
    public Pessoa() {
    }
    public Pessoa(String nome, LocalDate dtNasc) {
        this.nome = nome;
        this.dtNasc = dtNasc;
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDtNasc() {
        return this.dtNasc;
    }

    public void setDtNasc(LocalDate dtNasc) {
        this.dtNasc = dtNasc;
    }

}
    
