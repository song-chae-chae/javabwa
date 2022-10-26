package ch07.example.repairable;

public class RepairableTest {
    public static void main(String[] args) {
        Tank tank = new Tank();
        Dropship dropship = new Dropship();
        
        Marine marine = new Marine();
        SCV scv = new SCV();
        
        scv.repair(tank);
        scv.repair(dropship);
        // scv.repair(marine); -> error marine은 Repairable을 구현하고 있지 않기 때문에 인자로 쓸 수 없음
    }
}
