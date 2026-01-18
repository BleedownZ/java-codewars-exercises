package _5kyu.GreedIsGood;

public class Greed {
    public static void main(String[] args) {
        int [] dice1 = {2,2,4,1,2};
        int [] dice2 = {1,1,2,1,2};
        int [] dice3 = {4,4,4,1,1};
        System.out.println(greedy(dice1));
        System.out.println(greedy(dice2));
        System.out.println(greedy(dice3));
    }
    public static int greedy(int[] dice){
        int score = 0;
        int [] count = new int[6];
        //Count the repeat number the same number
        for (int number: dice){
            if (number >= 1 && number <= 6){
                count[number - 1]++;
            }else{
                System.out.println("Invalid number");
            }
        }
        for (int i = 0; i < count.length; i++){
            int sided = count[i];

            if (sided >= 3){
                //number 1 three times
                if (i == 0) {
                    score = score + 1000;
                }else{
                    //any number three times without the one
                    score = score + (i + 1) * 100;
                }
                sided = sided - 3;
            }
            //Sum to the score the rest the 1s and 5s
            if (i == 0){
                score = score + (sided * 100);
            }
            if(i == 4){
                score = score + sided * 50;
            }

        }
        return score;
    }
}
