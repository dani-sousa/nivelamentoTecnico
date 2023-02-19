package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ArquivosUtils {
    // static diz que nada que esta dentro do metodo será alterado
    public static String getPropriedade(String propriedade) throws IOException {
        Properties propriedades = new Properties();
        propriedades.load(new FileInputStream("src/main/resources/application.properties"));
        return propriedades.getProperty(propriedade);
    }
}
