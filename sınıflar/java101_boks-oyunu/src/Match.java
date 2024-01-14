public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void run() {
        if (isCheck()) {
            int i = 1;
            while (this.f1.health > 0 && this.f2.health > 0) {
                do {
                    System.out.println(STR."===== \{i}. ROUND =====");
                    i++;
                } while (isWin());

                if(isStarter()) {
                    System.out.println("Rounda " + this.f1.name + " başlar.");
                    this.f2.health = this.f1.hit(this.f2);
                    if (isWin()) {
                        break;
                    }
                    this.f1.health = this.f2.hit(this.f1);
                    if (isWin()) {
                        break;
                    }
                } else {
                    System.out.println("Rounda " + this.f2.name + " başlar.");
                    this.f1.health = this.f2.hit(this.f1);
                    if (isWin()) {
                        break;
                    }
                    this.f2.health = this.f1.hit(this.f2);
                    if (isWin()) {
                        break;
                    }
                }

                System.out.println(STR."\{this.f1.name} Sağlık : \{this.f1.health}");
                System.out.println(STR."\{this.f2.name} Sağlık : \{this.f2.health}");
            }
        } else {
            System.out.println("Sporcuların sıkletleri uyuşmuyor.");
        }
    }

    boolean isCheck() {
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    boolean isWin() {
        if (this.f1.health == 0) {
            System.out.println(STR."\{this.f1.name} Sağlık : \{this.f1.health}");
            System.out.println(STR."\{this.f2.name} Sağlık : \{this.f2.health}");
            System.out.println(STR."\{this.f2.name} kazandı !");
            return true;
        }

        if (this.f2.health == 0) {
            System.out.println(STR."\{this.f1.name} Sağlık : \{this.f1.health}");
            System.out.println(STR."\{this.f2.name} Sağlık : \{this.f2.health}");
            System.out.println(STR."\{this.f1.name} kazandı !");
            return true;
        }

        return false;
    }

    boolean isStarter(){
        double randomNumber = Math.random() * 100;
        return randomNumber > 50;
    }
}
