package com.example.diego.myapplication;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Diego on 02/09/2015.
 */
public class VooRepository {



    public List<Voo> getVoosDisponiveis(String origem, String destino)
    {
        List<Voo> voos = getVoos();

        List<Voo> voosDisponiveis = new ArrayList<Voo>();

        for( Voo voo : voos) {
            if(voo.getOrigem().equals(origem) && voo.getDestino().equals(destino))
            {
                voosDisponiveis.add(voo);
            }
        }

        return voosDisponiveis;
    }


    public List<Voo> getVoos() {
        List<Voo> voos = new ArrayList<Voo>();

        Voo voo1 = new Voo(001,"São Paulo", "Rio de Janeiro", "10/10/2015");
        voos.add(voo1);

        Voo voo2 = new Voo(002,"São Paulo", "Rio de Janeiro", "11/10/2015");
        voos.add(voo2);

        Voo voo3 = new Voo(003,"São Paulo", "Rio de Janeiro", "12/10/2015");
        voos.add(voo3);

        Voo voo4 = new Voo(004,"Rio de Janeiro", "São Paulo", "10/10/2015");
        voos.add(voo4);

        Voo voo5 = new Voo(005,"Rio de Janeiro", "São Paulo", "11/10/2015");
        voos.add(voo5);

        Voo voo6 = new Voo(006,"Rio de Janeiro", "São Paulo", "12/10/2015");
        voos.add(voo6);

        Voo voo7 = new Voo(007,"São Paulo", "Bahia", "11/10/2015");
        voos.add(voo7);

        Voo voo8 = new Voo(1542,"Bahia", "Porto Alegre", "13/10/2015");
        voos.add(voo8);

        Voo voo9 = new Voo(0123,"Bahia", "Porto Alegre", "12/10/2015");
        voos.add(voo9);

        Voo voo10 = new Voo(321,"Porto Alegre", "Rio de Janeiro", "10/10/2015");
        voos.add(voo10);

        Voo voo11 = new Voo(36012,"Porto Alegre", "São Paulo", "13/10/2015");
        voos.add(voo11);

        Voo voo12 = new Voo(1213,"Florianópolis", "Goias", "10/10/2015");
        voos.add(voo12);

        Voo voo13 = new Voo(9534,"Florianópolis", "Rio de Janeiro", "10/10/2015");
        voos.add(voo13);

        Voo voo14 = new Voo(4656,"Florianópolis", "Bahia", "10/10/2015");
        voos.add(voo14);

        return voos;

    }
}
