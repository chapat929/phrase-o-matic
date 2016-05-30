public class Main {
    public static void main(String[] args) {
        String[] wordListOne = {"24/7", "multi-Tier"};
        String[] wordListTwo = {"empowered", "sticky"};
        String[] wordListThree = {"process", "tipping-point"};

        int listOneLength = wordListOne.length;
        int listTwoLength = wordListTwo.length;
        int listThreeLength = wordListThree.length;

        int rand1 = (int) (Math.random() * listOneLength);
        int rand2 = (int) (Math.random() * listTwoLength);
        int rand3 = (int) (Math.random() * listThreeLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        System.out.println("What we need is a " + phrase);
    }
}
