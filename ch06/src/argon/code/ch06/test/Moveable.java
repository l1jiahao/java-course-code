package argon.code.ch06.test;

public interface Moveable {
    default void move(String direction){

        System.out.println(direction);

    }
}
