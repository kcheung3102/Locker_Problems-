public class Main {

    public static void main(String[] args) {
	//initial array that has all the lockers closed
        boolean[] lockers = new boolean[101];
        //first locker and opens every locker
        for(int i = 1; i < lockers.length; i++) {
            lockers[i] = true;
        }
        //
        for(int i = 1; i < lockers.length;i++) {
            for(int j = 1;j < lockers.length; j+= i) {
                lockers[j] = !lockers[j];
            }
        }
        for(int i = 1; i < lockers.length;i++) {
                System.out.println("locker " + i + " is " + (lockers[i] ? "open" : "closed"));
        }

    }
}
