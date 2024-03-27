package Experiment;

public class Test5 {
    public static void main(String[] args) {

        String[][] table = {
                {"Agumon", "AA", "Candlemon", "DA", "Betamon", "IA"},
                {"Biyomon", "AB", "Crabmon", "DB", "DemiDevimon", "IB"},
                {"ClearAgumon", "AC", "Elecmon", "DC", "Dokunemon", "IC"},
                {"Gomamon", "AD", "Floramon", "DD", "Gazimon", "ID"},
                {"Penguinmon", "AE", "Gabumon", "DE", "Gizamon", "IE"},
                {"SnowAgumon", "AF", "Gotsumon", "DF", "Goburimon", "IF"},
                {"Tapirmon", "AG", "Palmon", "DG", "Hagurumon", "IG"},
                {"Tentomon", "AH", "Patamon", "DH", "Kunemon", "IH"},
                {"ToyAgumon", "AI", "", "Mushroomon", "II"},
                {"Veemon", "AJ", "", "Otamamon", "IJ"},
                {"", "", "", "SnowGoburimon", "IK"},
                {"", "", "", "Syakomon", "IL"},
                {"", "", "", "Tsukaimon", "IM"}
        };

        System.out.println("+-------------+----+-----------+----+---------------+----+");
        for (int i = 0; i < table.length; i++)
        {
            System.out.print("| ");
            for (int j = 0; j < table[i].length; j++)
            {
                if (!table[i][j].isEmpty())
                {
                    System.out.print(table[i][j]);
                }
                System.out.print(" | ");
            }
            System.out.println();
            if (i < table.length - 1)
            {
                System.out.println("+-------------+----+-----------+----+---------------+----+");
            }
        }
        System.out.println("+-------------+----+-----------+----+---------------+----+");
    }
}

