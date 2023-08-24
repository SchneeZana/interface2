public interface Fly {
    void takeOff ();
    int ascend(int meter);
    int descend (int meters);
    void land ();
    default void  glide() {
        System.out.println("Glides in the air.");
    }
}
