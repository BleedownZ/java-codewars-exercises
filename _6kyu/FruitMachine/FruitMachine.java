package _6kyu.FruitMachine;

public class FruitMachine {
    public static void main(String[] args) {
        String[][] reels = {
                {"Wild","Star","Bell","Shell","Seven","Cherry","Bar","King","Queen","Jack"},
                {"Wild","Star","Bell","Shell","Seven","Cherry","Bar","King","Queen","Jack"},
                {"Wild","Star","Bell","Shell","Seven","Cherry","Bar","King","Queen","Jack"}
        };

        int[] spin = {5, 5, 5};
        int[] spin1 = {3, 3, 3};
        int[] spin2 = {4, 4, 4};
        System.out.println(fruit(reels,spin));//50 points
        System.out.println(fruit(reels,spin1));//70 points
        System.out.println(fruit(reels,spin2));//60 points

    }
    public static int fruit(final String[][] reels, final int[] spins) {
        int items = 0;
        int score = 0;
        for (String [] count: reels){
            items += count.length;
        }
        if (reels.length == 3 && items == 30 && spins.length == 3){
            //Created String array only with the spins
            String [] fruits= new String[3];
            int wild = 0;
            int fruit2 = 0;
            int fruit3 = 0;
            //To get the Fruits of spins
            for (int i = 0; i < spins.length ; i++){
                int number = spins[i];

                String fruit = reels[i][number];
                switch (fruit){
                    case "Wild":
                        fruits[i] = fruit;
                        wild++;
                        break;
                    case "Star", "Bell", "Shell", "Seven", "Cherry", "Bar", "King", "Queen", "Jack":
                        fruits[i] = fruit;
                        break;
                    default:
                        return 0;
                }
            }
            //There are two, three or two more wild (fruits)
            int noEqual = 0;
            String mostRepeat = "";
            for (int h = 0; h < fruits.length; h++){
                for (int g = 0; g < fruits.length; g++){

                    if (h != g) {

                        if (fruits[h].equals(fruits[g])) {
                            fruit2 = 1;
                            mostRepeat = fruits[h];
                        }else {
                            noEqual = 1;
                        }
                        if (fruit2 == 1 && fruit3 == 0 && noEqual == 0 && g == fruits.length-1) {
                            fruit3 = 1;
                            mostRepeat = fruits[g];
                        }
                    }
                }
            }

            boolean threeSame = fruit3 == 1 && noEqual == 0;
            boolean twoMoreWild = fruit2 == 1 && wild == 1;
            boolean twoSame = fruit2 == 1 && noEqual == 1;
            //Put score to fruits
            int baseScore;
            switch (mostRepeat) {
                case "Wild":
                    baseScore = 10;
                    break;
                case "Star":
                    baseScore = 9;
                    break;
                case "Bell":
                    baseScore = 8;
                    break;
                case "Shell":
                    baseScore = 7;
                    break;
                case "Seven":
                    baseScore = 6;
                    break;
                case "Cherry":
                    baseScore = 5;
                    break;
                case "Bar":
                    baseScore = 4;
                    break;
                case "King":
                    baseScore = 3;
                    break;
                case "Queen":
                    baseScore = 2;
                    break;
                case "Jack":
                    baseScore = 1;
                    break;
                default:
                    return 0;
            }
            //final score
            if (threeSame) {
                score = baseScore * 10;
            } else if (twoSame) {
                score = baseScore;
            }

            if (twoMoreWild) {
                if ("Wild".equals(mostRepeat)) {
                    score = 100;
                } else {
                    score *= 2;
                }
            }


        }else {
            return 0;
        }
        return score;
    }

}
