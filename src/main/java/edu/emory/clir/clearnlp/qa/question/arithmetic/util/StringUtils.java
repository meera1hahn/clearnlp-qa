package edu.emory.clir.clearnlp.qa.question.arithmetic.util;

import edu.emory.clir.clearnlp.qa.structure.SemanticType;

public class StringUtils {
    public static SemanticType extractSemanticRelation(String label)
    {
        if (label == null || label.isEmpty()) return null;

        String relation = "";

        if (label.contains("-"))
        {
            relation = label.split("-")[1];
        }
        else if (label.contains("="))
        {
            relation = label.split("=")[0];
        }
        else
        {
            relation = label;
        }

        switch (relation)
        {
            case "A0":
                return SemanticType.A0;
            case "A1":
                return SemanticType.A1;
            case "A2":
                return SemanticType.A2;
            case "A3":
                return SemanticType.A3;
            case "A4":
                return SemanticType.A4;
            case "num":
                return SemanticType.num;
            default:
                return null;
        }
    }
}