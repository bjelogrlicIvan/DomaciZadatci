package zadaca13;

public class Test {
    public static void main(String[] args) {
        Planina p1 = new Planina("Trebevic", 2000);
        Planina p2 = new Planina("Jahorina", 1500);
        Planina p3 = new Planina("Igman", 1800);

        Planinar planinar = new Planinar(1900, 20.5);
        planinar.popniSe(p1);
        planinar.popniSe(p2);
        planinar.popniSe(p3);

        System.out.println(planinar);
    }
}
