public class WolfTest {

    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.sex = "male";
        wolf.alias = "White fang";
        wolf.weight = 45.3f;
        wolf.age = 7;
        wolf.woolColour = "white";
        System.out.println("The name of the wolf is " + wolf.alias + ", he is " + wolf.sex +
                ", his weight is " + wolf.weight + ", he is " + wolf.age +
                " years old, his wool colour is " + wolf.woolColour + ".");
        wolf.move();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}