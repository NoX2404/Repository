public class Weapons {
    int atk, critRate, accuracy;

    Weapons(int a, int b, int c){
        this.atk = a;
        this.critRate = b;
        this.accuracy = c;
    }
        Weapons sword = new Weapons(150, 40, 50);
        Weapons dagger = new Weapons(70, 100, 60);
        Weapons bow = new Weapons(100, 80, 70);
        Weapons MythSword = new Weapons(200, 60, 60);
        Weapons gun = new Weapons(160, 30, 75);
}
