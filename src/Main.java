import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Person mari = new Person("Мари");
        mari.goes("стала взбираться");
        mari.goes("пролезла");
        mari.look("увидела");
        mari.goes("очутилась");
        LollipopMeadow lollipopMeadow = new LollipopMeadow("вкусно пахнующий");
        lollipopMeadow.propertyLollipop.add("ярко сияющие камни");
        lollipopMeadow.propertyLollipop.add("драгоценные камни");

        Person nutcracker = new Person("Щелкунчик");
        nutcracker.say("Мы на Леденцовом лугу и сейчас пройдем вон через те ворота");

        mari.look("заметила");
        Gate gate = new Gate();
        gate.notInMaterials.add("белый мрамор");
        gate.notInMaterials.add("шоколадный мрамор");
        gate.notInMaterials.add("розовый мрамор");
        gate.materials.add("обсахаренный миндаль");
        gate.materials.add("изюм");
        nutcracker.say("объяснил");
        gate.name = "Миндально-Изюмные";
        gate.otherName = "Ворота обжор-студентов";

        Monkeys monkeys = new Monkeys("Маленькая", "В красной курточке", 6);
        monkeys.sits("сидят на воротах");
        monkeys.play("янычарский марш");
        mari.goes("шла под музыку");
        Floor floor = new Floor("мраморный, сделанный из разноцветных леденцов");

        Fragrance fragrance = new Fragrance();
        Forest forest = new Forest("Чудесгый");
        fragrance.blowing("Доносятся из леса");
    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String goes (String goes) {
        return goes;
    }

    public String look (String look) {
        return look;
    }

    public String say (String says){
        return says;
    }
}

class Lollipop {
    List <String> propertyLollipop = new ArrayList<>();
}

class LollipopMeadow extends Lollipop {
    List<Lollipop> lollipopMeadow = new ArrayList<>();
    private String property;
    Gate gate;

    public LollipopMeadow(String property) {
        this.property = property;
    }
}

class Gate {
    String name;
    String otherName;
    List<String> notInMaterials = new ArrayList<>();
    List<String> materials = new ArrayList<>();
}

class Monkeys {
    private String size;
    private String clothes;
    private int amount;

    public Monkeys(String size, String clothes, int amount) {
        this.size = size;
        this.clothes = clothes;
        this.amount = amount;
    }

    public String sits (String sit) {
        return sit;
    }

    public static String play (String melody){
        return melody;
    }
}

class Floor {
    private String property;

    public Floor(String property) {
        this.property = property;
    }
}

class Forest {
    private String property;

    public Forest(String property) {
        this.property = property;
    }
}

class Fragrance {
    public String blowing (String flavors){
        return flavors;
    }
}