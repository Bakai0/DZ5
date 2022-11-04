public class Main {




    public static void main(String[] args) {
        createHeroes();




        BOSS boss = new BOSS();
        boss.setBossProtection("beat");
        boss.setBossDamage(100);
        boss.setBossHealth(300);
        System.out.println("BossHealth" + " " + boss.getBossHealth() + " " + "BossDamage" + boss.getBossDamage() + " " +
                "BossProtection" + " " + boss.getBossProtection());
    }
    public static HERO[] createHeroes (){
    HERO mechnik = new HERO(50,100);
    HERO mag = new HERO(20,120);
    HERO tank = new HERO(60,200);

        HERO[]createHeroes = {mechnik,mag,tank};
        for (int i = 0; i < createHeroes.length ; i++) {
            System.out.println(createHeroes[i].getHeroDamage() +" "+ createHeroes[i].getHeroHealth());

        }

        return createHeroes;








    }
}







//    Добавить метод в классе Main который называется createHeroes, в теле метода
//    необходимо создать 3х героев с помощью класса Hero, используя при этом разные
//        варианты конструкторов (либо первый либо второй). Затем поместить созданные
//        экземпляры героев в массив и вернуть его с помощью команды return, как
//        возвращаемый результат метода createHeroes.
//        ● Затем вызвать этот метод в методе main и распечатать информацию о всех героях
//        массива через цикл.