package socket;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class ProverbServer {

    private static final Map<String, String> proverbios = new HashMap<>();

    static {
        proverbios.put("Quem não arrisca,", "não petisca.");
        proverbios.put("Água mole em pedra dura,", "tanto bate até que fura.");
        proverbios.put("Em casa de ferreiro,", "espeto de pau.");
        proverbios.put("Mais vale um pássaro na mão", "do que dois a voar.");
        proverbios.put("Depressa e bem,", "não há quem.");
        proverbios.put("Quem semeia ventos,", "colhe tempestades.");
    }

    private String primeiraParte;
    private String segundaParte;

    public String getPrimeiraParte() {
        String[] chaves = proverbios.keySet().toArray(new String[0]);
        primeiraParte = chaves[new Random().nextInt(chaves.length)];
        segundaParte = proverbios.get(primeiraParte);
        return primeiraParte;
    }

    public boolean verificarResposta(String resposta) {
        return resposta.trim().equalsIgnoreCase(segundaParte.trim());
    }

    public String getSegundaParte() {
        return segundaParte;
    }
}