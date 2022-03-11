package fr.epsi;

import fr.epsi.generators.GenerateAccueil;
import fr.epsi.generators.GenerateFicheEmploye;
import fr.epsi.tools.Parsing;

import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {

        List<String> listEmployes = Parsing.StaffParsing();

        for (int i = 0; i < listEmployes.size(); i++) {
            GenerateFicheEmploye.generateHtmlFileEmploye(listEmployes.get(i));
        }

        GenerateAccueil.generateHtmlFileAccueil();
    }
}
