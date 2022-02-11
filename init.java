


import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;


public class init {
    public static void main(String[] args) {


        ArrayList<Funcionario> lista = new ArrayList<Funcionario>();



        lista.add(new Funcionario("Maria",LocalDate.of(2000, 10, 18), new BigDecimal(2009.44),"Operador"));
        lista.add(new Funcionario("João",LocalDate.of(1990, 5, 12), new BigDecimal(2284.38),"Operador"));
        lista.add(new Funcionario("Caio",LocalDate.of(1961, 5, 2), new BigDecimal(9836.14),"Coordenador"));
        lista.add(new Funcionario("Miguel",LocalDate.of(1988, 10, 14), new BigDecimal(19119.88),"Diretor"));
        lista.add(new Funcionario("Alice",LocalDate.of(1995, 1, 5), new BigDecimal(2234.68),"Recepcionista"));
        lista.add(new Funcionario("Heitor",LocalDate.of(1999, 11, 19), new BigDecimal(1582.72),"Operador"));
        lista.add(new Funcionario("Arthur",LocalDate.of(1993, 3, 31), new BigDecimal(4071.84),"Contador"));
        lista.add(new Funcionario("Laura",LocalDate.of(1994, 7, 8), new BigDecimal(3017.45),"Gerente"));
        lista.add(new Funcionario("Heloísa",LocalDate.of(2003, 5, 24), new BigDecimal(1606.85),"Eletricista"));
        lista.add(new Funcionario("Helena",LocalDate.of(1996, 9, 2), new BigDecimal(2799.93),"Gerente"));



        System.out.println("Nome     Data Nascimento     Salário     Função");
        for (Funcionario funcionario : lista) {
            System.out.println(funcionario.toString());
        }

        for (Funcionario funcionario : lista) {
            if (funcionario.getNome()=="João") {
                lista.remove(funcionario);
                break;
            }
        }
        System.out.println("");System.out.println("");

        for (Funcionario funcionario : lista) {
            System.out.println(funcionario.toString());
        }

        for (Funcionario funcionario : lista) {
            double calc = funcionario.getSalario().doubleValue();
            double result = (calc/100)*110;
            funcionario.setSalario(new BigDecimal(result));
        }
        System.out.println("");System.out.println("");

        for (Funcionario funcionario : lista) {
            System.out.println(funcionario.toString());
        }

        System.out.println("");System.out.println("");

        String func = "";
        ArrayList<String> grupos = new ArrayList<String>();

        HashMap<String, ArrayList<Funcionario>> listaAgrupada = new HashMap<String, ArrayList<Funcionario>>();
        for (Funcionario funcionario : lista) {
            if (grupos.size()==0) {
                grupos.add(funcionario.getFuncao());
            } else {
                if (!grupos.contains(funcionario.getFuncao())){
                    grupos.add(funcionario.getFuncao());
                }
            }
        }

        System.out.println("   ");

        for (String g : grupos) {
            ArrayList<Funcionario> temp = new ArrayList<Funcionario>();
            for (Funcionario funcionario : lista) {
                if (g==funcionario.getFuncao()) {
                    temp.add(funcionario);
                }
            }

            listaAgrupada.put(g, temp);
        }
        System.out.println("   ");
        System.out.println(" agrupado  ");

        for (String key : listaAgrupada.keySet()) {
            System.out.println(key);
            System.out.println(listaAgrupada.get(key));
            System.out.println(" ");
        }

        System.out.println(" agrupado  ");
        System.out.println("   ");

        for (Funcionario funcionario : lista) {

            if (funcionario.getDtNasc().getMonthValue()==10 ||  funcionario.getDtNasc().getMonthValue()==12 ){
                System.out.println(funcionario.toString());
            }

        }

        System.out.println("");System.out.println("");
        int age = 0;
        Funcionario temp = new Funcionario("",LocalDate.of(2022, 02, 10),new BigDecimal(0.0),"");
        for (Funcionario funcionario : lista) {
            if (funcionario.getDtNasc().isBefore(temp.getDtNasc())) {
                temp = funcionario;
            }


        }
        System.out.println(temp.toString());
        System.out.println("");System.out.println("");
        Period period = Period.between(temp.getDtNasc(), LocalDate.now());
        System.out.println(temp.getNome()+" "+period.getYears());

        System.out.println("");System.out.println("");
        Collections.sort(lista, (Funcionario s1, Funcionario s2) ->{
            return s1.getNome().compareToIgnoreCase(s2.getNome());
        });

        for (Funcionario funcionario : lista) {

            System.out.println(funcionario.toString());

        }

        double total =0;
        for (Funcionario funcionario : lista) {

            total += funcionario.getSalario().doubleValue();

        }
        System.out.println("Total de folha de pagamento: " + total);


        System.out.println("");System.out.println("");



        for (Funcionario funcionario : lista) {

            System.out.println(funcionario.toStringSalarioMinimo());

        }
    }



}