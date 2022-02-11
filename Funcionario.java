package study.javaproject;

import java.math.BigDecimal;
import java.sql.Date;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;

public class Funcionario extends Pessoa{
    
    private BigDecimal salario;
    private String funcao;
    


    public Funcionario(String nome,LocalDate dtNasc, BigDecimal salario, String funcao  ) {
        super(nome, dtNasc);
        this.salario = salario;
        this.funcao = funcao;
    }
    public Funcionario() {
        super();
    }


    public BigDecimal getSalario() {
        return this.salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public String getFuncao() {
        return this.funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    
    

    @Override
    public String toString() {
        LocalDate data0 = super.getDtNasc();
        java.util.Date data = Date.from(data0.atStartOfDay(ZoneId.systemDefault()).toInstant());
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        
        
        return super.getNome() + "      " +  formato.format(data) +"        " + NumberFormat.getCurrencyInstance().format(getSalario()) + "     " + getFuncao();
    }

    public String toStringSalarioMinimo() {
        LocalDate data0 = super.getDtNasc();
        java.util.Date data = Date.from(data0.atStartOfDay(ZoneId.systemDefault()).toInstant());
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        double bD = getSalario().doubleValue();
        double sal = bD/1212;
        
        return super.getNome() + "      " +  formato.format(data) +"        " + NumberFormat.getInstance().format(sal)+"  salários"  + "     " + getFuncao();
    }

}


