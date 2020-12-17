package tpe;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class VisorMazo {

    public static void cargarMazo(String jsonFile, Mazo mazo) {
        //URL url = getClass().getResource(jsonFile);
        File jsonInputFile = new File(jsonFile);
        InputStream is;
        try {
            is = new FileInputStream(jsonInputFile);
            // Creo el objeto JsonReader de Json.
            JsonReader reader = Json.createReader(is);
            // Obtenemos el JsonObject a partir del JsonReader.
            JsonArray cartas = (JsonArray) reader.readObject().getJsonArray("cartas");
            for (JsonObject carta : cartas.getValuesAs(JsonObject.class)) {
                String nombreCarta = carta.getString("nombre");
                Carta nuevaCarta = new Carta(nombreCarta);
                JsonObject atributos = (JsonObject) carta.getJsonObject("atributos");
                String atributosStr = "";
                for (String nombreAtributo:atributos.keySet()) {
                    atributosStr = atributosStr + nombreAtributo + ": " +
                            atributos.getInt(nombreAtributo) + "; ";
                    Atributo nuevoAtributo = new Atributo(nombreAtributo, atributos.getInt(nombreAtributo));
                    nuevaCarta.addAtributo(nuevoAtributo);
                }
                mazo.addCarta(nuevaCarta);
             //   System.out.println(nombreCarta+"\t\t\t"+atributosStr);
            }

            reader.close();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}

