public class matic {
    public static void main(String[] args) {
        //make three sets of words to choose from.Add your own
        String[] wordListOne = {"24/7", "multi-Tier", "30,000 foot", "B-to-B", "Win-win", "ffront end", "web based", "smart", "six sigma", "critical path", "dynamic"};
        String[] wordListTwo = {"empowered", "sticky", "value-added", "orianted", "centric", "distributed", "clustered", "branded", "outside the box"
                , "positioned", "networked", "focused", "levereged", "targetted", "shared", "cooperative", "accelarated"};
        String[] wordListThree = {"process", "tipping", "solution", "architecture", "core-competency", "strategy", "mindshare", "portal", "space",
                "vision", "paradigm", "mission"};
        //find out how many words are in each
        int oneLength = wordListOne.length;
        int twoLenghth = wordListTwo.length;
        int threeLength = wordListThree.length;
        // generate three random numbers
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLenghth);
        int rand3 = (int) (Math.random() * threeLength);

        //Now we build a phrase

        String phrase = wordListOne[rand1] + "" + wordListTwo[rand2] + "" + wordListThree[rand3];

        //print out the phrase
        System.out.println("What we need is a " + phrase);
    }
}
