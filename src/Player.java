public class Player {
    public interface player {
        void Check_status();
        boolean have_Hp();
        int atk();
        void gotATK(int gotATK);
        void equip(accessories accessories_01,int num);
        String check_class();
        boolean Haveitem(String name);
        void gotheal();
    }
    public  interface warrior extends player {
        boolean heavy_atk();
    }
    public  interface mage extends player {
        boolean useskill(int useskill);
    }
    public  interface accessorise_all{
        void Check_status();
    }
    /*public  interface accessorise_warrior extends accessorise_all {
        void Boots_warrior();
    }
    public  interface accessorise_mage extends accessorise_all {
        void Boots_mage();
    }*/
    public static class accessories implements  accessorise_all {
        private String name ;
        private int Hp;
        private int atk;
        private int mana=0;
        public accessories(String name,int Hp, int atk, int mana) {
            this.name = name;
            this.Hp = Hp;
            this.atk = atk;
            this.mana = mana;
        }

        public void Check_status(){
            System.out.println(name+" HP: +"+Hp+" ATK: +"+atk+" MANA: +"+mana);
        }
    }
    public static class player_1 implements warrior {
        private int Max_Hp=100;
        private int Hp=100;
        private int atk=10;
        private int mana=0;
        private int Max_mana=0;
        private accessories[] name_accessories =new accessories[3];
        public player_1(int Max_Hp, int atk) {
            this.Max_Hp = Max_Hp;
            Hp = this.Max_Hp;
            this.atk = atk;
            mana=0;
        }
        public void Check_status(){
            System.out.println("class warrior");
            System.out.println("HP: "+Hp+"/"+Max_Hp);
            System.out.println("ATK: "+atk);
        }
        public int atk(){
            return atk ;
        }
        public boolean heavy_atk(){
            System.out.println("Use HeavyATK");
            return true;
        }
        public boolean have_Hp(){
            return Hp>0;
        }
        public void equip(accessories accessories_01,int num){
            this.Max_Hp+=accessories_01.Hp;
            Hp=Max_Hp;
            this.atk+=accessories_01.atk;
            this.Max_mana+=accessories_01.mana;
            mana=Max_mana;
            name_accessories[num]=accessories_01;
        }
        public String check_class(){
            return "Warrior";
        }
        public boolean Haveitem(String name){
            for(int i =0; i<3;i++){
                if(name_accessories[i] != null && name_accessories[i].name.equals(name)){
                    return true;
                }
            }
            return false;
        }
        public void gotATK(int gotATK){
            Hp-=gotATK;
            System.out.println(" got ATK HP-"+gotATK+" Hp"+Hp+"/"+Max_Hp);
        }
        public void gotheal(){
            Hp+=200;
            mana+=50;
            if(Hp>=Max_Hp){
                Hp=Max_Hp;
            }
            if(mana>=Max_mana){
                mana=Max_mana;
            }
            System.out.println("Got Heal!!!");
            System.out.println("+200HP HP: "+Hp+"/"+Max_Hp);
            System.out.println("+50mana Mana: "+mana+"/"+Max_mana);
        }
    }
    public static class player_2 implements mage {
        private int Hp=100;
        private int Max_Hp=100;
        private int atk=10;
        private int mana=20;
        private int Max_mana=20;
        private accessories[] name_accessories =new accessories[3];
        public player_2(int Max_Hp, int atk,int mana) {
            this.Max_Hp = Max_Hp;
            Hp = this.Max_Hp;
            this.atk = atk;
            this.mana = mana;
        }
        public void Check_status(){
            System.out.println("class mage");
            System.out.println("HP: "+Hp+"/"+Max_Hp);
            System.out.println("atk: "+atk);
            System.out.println("mana: "+mana);
        }
        public int atk(){
            return atk ;
        }
        public boolean useskill(int useskill){
            if(useskill>mana){
                System.out.println("You don't have mana to use skill");
                return false;
            }
            else{
                System.out.println("Use skill do damage "+((useskill*3)+atk));
                mana-=useskill;
                if(mana<0){
                    mana=0;
                }
                return true;
            }
        }
        public boolean have_Hp(){
            return Hp>0;
        }
        public void equip(accessories accessories_01,int num){
            this.Max_Hp+=accessories_01.Hp;
            Hp=Max_Hp;
            this.atk+=accessories_01.atk;
            this.Max_mana+=accessories_01.mana;
            mana=Max_mana;
            name_accessories[num]=accessories_01;
        }
        public String check_class(){
            return "Mage";
        }
        public boolean Haveitem(String name){
            for(int i =0; i<3;i++){
                if(name_accessories[i] != null && name_accessories[i].name.equals(name)){
                    return true;
                }
            }
            return false;
        }
        public void gotATK(int gotATK){
            Hp-=gotATK;
            System.out.println(" got ATK HP-"+gotATK+" Hp"+Hp+"/"+Max_Hp);
        }
        public void gotheal(){
            Hp+=200;
            mana+=50;
            if(Hp>=Max_Hp){
                Hp=Max_Hp;
            }
            if(mana>=Max_mana){
                mana=Max_mana;
            }
            System.out.println("Got Heal!!!");
            System.out.println("+200HP HP: "+Hp+"/"+Max_Hp);
            System.out.println("+50mana Mana: "+mana+"/"+Max_mana);
        }
    }
}
