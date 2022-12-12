public class Equipment {
    int hp,def,buff;
    Equipment(int a, int b){
        this.hp=a;
        this.def=b;
    }
    Equipment(int z){
        this.buff=z;
    }
        Equipment armour1 = new Equipment(500,150);
        Equipment armour2 = new Equipment(200,400);
        Equipment armour3 = new Equipment(300,300);
        Equipment heal = new Equipment(300);
        Equipment amplify = new Equipment(250);
        Equipment fortify = new Equipment(250);
        Equipment precision = new Equipment(30);
    public static int turbulance(){
        int a= (int)(Math.random()*3)+3;
        return a;
    }
}


