package ch07.example.repairable;

public class SCV extends GroundUnit implements Repairable {
    SCV() {
        super(60);
        hitPoint = MAX_HP;
    }

    // 인자로 Repairable 타입을 받고 있기 때문에 Repairable에서 별도의 코드를 작성하지 않았지만
    // Repairable을 구현하고 있는 것만으로도 클래스들의 관계를 만들 수 있게 되었음
    void repair(Repairable r) {
        if (r instanceof Unit) {
            Unit u = (Unit)r;
            while(u.hitPoint != u.MAX_HP) {
                u.hitPoint++;
            }
            System.out.println(u.toString() + "의 수리가 끝났습니다.");
        }
    }
}
