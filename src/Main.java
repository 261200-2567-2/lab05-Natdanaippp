// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Player.player p1=null;
        Player.player p2=null;
        boolean freeze1=false;
        boolean can_use_skill=false;
        int freeze1_count =0;
        boolean freeze2=false;
        int freeze2_count =0;
        int number_of_equip=0;
        String aaa="";
        int number=0;
        boolean gotitem=false;
        int playeritem =1;
        Player.accessories Shield = new Player.accessories("Shield",400,0,0);
        Player.accessories Sword = new Player.accessories("Sword",20,200,0);
        Player.accessories necklace = new Player.accessories("necklace",50,40,50);
        Player.accessories staff = new Player.accessories("staff",100,30,200);
        Player.accessories armor = new Player.accessories("armor",300,2,0);
        Player.accessories rings = new Player.accessories("rings",10,2,300);
        int count =3;
        Scanner s = new Scanner(System.in);
        while (count!=0){
            System.out.println("Player1 Mage or Warrior ");
            aaa=s.nextLine();
            if(aaa.equals("Mage")){
                p1= new Player.player_2(100,10,20);
                System.out.println("Player1 you are Mage");
                count=0;
            }
            else if(aaa.equals("Warrior")){
                p1= new Player.player_1(100,10);
                System.out.println("Player1 you are Warrior");
                count=0;
            }
            else {
                System.out.println("try again");
            }
        }
        count=3;
        while (count!=0){
            System.out.println("Player2 Mage or Warrior ");
            aaa=s.nextLine();
            if(aaa.equals("Mage")){
                p2= new Player.player_2(100,10,20);
                System.out.println("Player2 you are Mage");
                count=0;
            }
            else if(aaa.equals("Warrior")){
                p2= new Player.player_1(100,10);
                System.out.println("Player2 you are Warrior");
                count=0;
            }
            else {
                System.out.println("try again");
            }
        }
        count=0;
        //System.out.println(p1.check_class());
        // System.out.println(p2.check_class());
        while(p1.have_Hp()&&p2.have_Hp()){
            System.out.println(count);
            System.out.println("inventory");
            System.out.println("----------------------------------");
            Shield.Check_status();
            Sword.Check_status();
            necklace.Check_status();
            staff.Check_status();
            armor.Check_status();
            rings.Check_status();
            System.out.println("----------------------------------");
            while (!gotitem){
                System.out.println("Player1 what you want to equip/status");
                aaa=s.nextLine();
                if(aaa.equals("Shield")&& !p1.Haveitem("Shield")){
                    p1.equip(Shield,number_of_equip);
                    System.out.println("Player1 equipped Shield");
                    gotitem=true;
                }
                else if(aaa.equals("Sword")&& !p1.Haveitem("Sword")){
                    p1.equip(Sword,number_of_equip);
                    System.out.println("Player1 equipped Sword");
                    gotitem=true;
                }
                else if(aaa.equals("necklace")&& !p1.Haveitem("necklace")){
                    p1.equip(necklace,number_of_equip);
                    System.out.println("Player1 equipped necklace");
                    gotitem=true;
                }
                else if(aaa.equals("staff")&& !p1.Haveitem("staff")){
                    p1.equip(staff,number_of_equip);
                    System.out.println("Player1 equipped staff");
                    gotitem=true;
                }
                else if(aaa.equals("armor")&& !p1.Haveitem("armor")){
                    p1.equip(armor,number_of_equip);
                    System.out.println("Player1 equipped armor");
                    gotitem=true;
                }
                else if(aaa.equals("rings")&& !p1.Haveitem("ring")){
                    p1.equip(rings,number_of_equip);
                    System.out.println("Player1 equipped rings");
                    gotitem=true;
                }
                else if(aaa.equals("status")){
                    p1.Check_status();
                }
                else{
                    System.out.println("try again");
                }
            }
            gotitem=false;
            while (!gotitem){
                System.out.println("Player2 what you want to equip/status");
                aaa=s.nextLine();
                if(aaa.equals("Shield")&& !p2.Haveitem("Shield")){
                    p2.equip(Shield,number_of_equip);
                    System.out.println("Player2 equipped Shield");
                    gotitem=true;
                }
                else if(aaa.equals("Sword")&& !p2.Haveitem("Sword")){
                    p2.equip(Sword,number_of_equip);
                    System.out.println("Player2 equipped Sword");
                    gotitem=true;
                }
                else if(aaa.equals("necklace")&& !p2.Haveitem("necklace")){
                    p2.equip(necklace,number_of_equip);
                    System.out.println("Player1 equipped necklace");
                    gotitem=true;
                }
                else if(aaa.equals("staff")&& !p2.Haveitem("staff")){
                    p2.equip(staff,number_of_equip);
                    System.out.println("Player2 equipped staff");
                    gotitem=true;
                }
                else if(aaa.equals("armor")&& !p2.Haveitem("armor")){
                    p2.equip(armor,number_of_equip);
                    System.out.println("Player2 equipped armor");
                    gotitem=true;
                }
                else if(aaa.equals("rings")&& !p2.Haveitem("ring")){
                    p2.equip(rings,number_of_equip);
                    System.out.println("Player2 equipped rings");
                    gotitem=true;
                }
                else if(aaa.equals("status")){
                    p2.Check_status();
                }
                else{
                    System.out.println("try again");
                }
            }
            gotitem=false;
            if(count>=2){
                System.out.println("Player1");
                p1.Check_status();
                System.out.println("Player2");
                p2.Check_status();
                System.out.println("----------------------------");
                System.out.println("          FIGHT!!!          ");
                System.out.println("----------------------------");
                while (p1.have_Hp()&&p2.have_Hp()){
                    if(p1.check_class().equals("Warrior"))
                    {
                        if(freeze1){
                            System.out.println("You are frozen skip your turn");
                            freeze1_count+=1;
                            if(freeze1_count==2){
                                freeze1_count=0;
                                freeze1=false;
                            }
                        }
                        else{
                            System.out.println("What player1 want to do?(ATK,HeavyATK,HEAL)");
                            aaa=s.nextLine();
                            if(aaa.equals("ATK")){
                                System.out.print("Player2");
                                p2.gotATK(p1.atk());
                            }
                            if(aaa.equals("HEAL")){
                                p1.gotheal();
                            }
                            if(aaa.equals("HeavyATK")){
                                if (p1 instanceof Player.warrior warrior) {
                                    freeze1=warrior.heavy_atk();
                                    System.out.print("Player2");
                                    p2.gotATK(p1.atk()*2);
                                }
                            }
                        }

                    }
                    if(p1.check_class().equals("Mage")){
                        System.out.println("What player1 want to do?(ATK,Use_skill,HEAL)");
                        aaa=s.nextLine();
                        if(aaa.equals("ATK")){
                            System.out.print("Player2");
                            p2.gotATK(p1.atk());
                        }
                        if(aaa.equals("HEAL")){
                            p1.gotheal();
                        }
                        if(aaa.equals("Use_skill")){
                            if(p1 instanceof Player.mage mage){
                                System.out.print("How many mana you want to use?");
                                number= Integer.parseInt(s.nextLine());
                                can_use_skill=mage.useskill(number);
                                if(can_use_skill){
                                    System.out.print("Player2");
                                    p2.gotATK((number*3)+p1.atk());
                                }
                            }
                        }
                    }
                    if(!p2.have_Hp()){
                        System.out.println("Player1 won");
                        break;
                    }
                    if(p2.check_class().equals("Warrior"))
                    {
                        if(freeze2){
                            System.out.println("You are frozen skip your turn");
                            freeze2_count+=1;
                            if(freeze2_count==2){
                                freeze2_count=0;
                                freeze2=false;
                            }
                        }
                        else{
                            System.out.println("What player2 want to do?(ATK,heavyATK,HEAL)");
                            aaa=s.nextLine();
                            if(aaa.equals("ATK")){
                                System.out.print("Player1");
                                p1.gotATK(p2.atk());
                            }
                            if(aaa.equals("HEAL")){
                                p2.gotheal();
                            }
                            if(aaa.equals("HeavyATK")){
                                if (p2 instanceof Player.warrior warrior) {
                                    freeze2=warrior.heavy_atk();
                                    System.out.print("Player1");
                                    p1.gotATK(p2.atk()*2);
                                }
                            }
                        }

                    }
                    if(p2.check_class().equals("Mage")){
                        System.out.println("What player2 want to do?(ATK,Use_skill,HEAL)");
                        aaa=s.nextLine();
                        if(aaa.equals("ATK")){
                            System.out.print("Player1");
                            p1.gotATK(p2.atk());
                        }
                        if(aaa.equals("HEAL")){
                            p2.gotheal();
                        }
                        if(aaa.equals("Use_skill")){
                            if(p2 instanceof Player.mage mage){
                                System.out.print("How many mana you want to use?");
                                number= Integer.parseInt(s.nextLine());
                                can_use_skill=mage.useskill(number);
                                if(can_use_skill){
                                    System.out.print("Player1");
                                    p1.gotATK((number*3)+p2.atk());
                                }

                            }
                        }
                    }
                    if(!p1.have_Hp()){
                        System.out.println("Player2 won");
                        break;
                    }
                }


            }
            count++;
            number_of_equip++;
        }
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

    }
}