import java.util.Random;

public class DotChaser {
    public static void main(String[] args) {
        int N = 200;

        if (args.length != 0) {
            N = Integer.parseInt(args[0]);
        }

        ThingList thingList = new ThingList(); 
        Random rand = new Random();
        int count = 0;

        while (true) {
            if (count % N == 0) {
                thingList.addThing(new TypeA(45, 50, 1, 'k'));
                thingList.addThing(new TypeB(55, 50, 1, 'o'));
                thingList.addThing(new TypeC(10, 10, 6, 'y'));  // wanted to make it green but it just shows black for me??
            }

            // print out the things so that the plotter can plot out the points
            if (count % 1 == 0) {
                thingList.printAll();
                System.out.println("done");
                System.out.flush();
            }

            thingList.moveAll(rand);
            count++;

        }
    }
}