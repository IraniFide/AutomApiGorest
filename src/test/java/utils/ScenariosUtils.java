package utils;

import io.cucumber.java.Scenario;

import java.util.HashMap;
import java.util.Map;

public class ScenariosUtils {

    private static Map<Long, Scenario> repository = new HashMap<>();

    public static void add(Scenario scenario) {                           //para adcionar cenario
        if(get()== null)repository.put(getId(), scenario);

    }
    public static void remove(){                                          //para remover cenario
        if (get() !=null)
            repository.remove(getId());

    }
    public static Scenario get(){
        return repository.get(getId());

    }
    public static Long getId() {
        return Thread.currentThread().getId();                           //para capturar o ID do cenario

    }
    public static void addText(String texto){                     //para logar no cenario, passar infor
        get().log(texto);
    }

}
