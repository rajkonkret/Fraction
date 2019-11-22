public class Nwd {

    public void nwd(int firstN, int secondN) {

        while (firstN != secondN) {
            if (firstN > secondN) {
                firstN -= secondN;
                //System.out.println(firstN);
            } else {
                secondN -= firstN;
                //System.out.println(secondN);
            }
        }
        System.out.println("wynosi: " + firstN);
    }

}
