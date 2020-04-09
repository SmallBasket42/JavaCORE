package Lesson_1;

public class Wall extends Barrier {

    private int height;

    public Wall(String name, int heigth) {
        super(name);

        this.height = heigth;
    }

    public int getHeigth() {
        return height;
    }

    @Override
    protected boolean moving(Actions actions) {
        System.out.println(super.getName() + " height: " + this.height);

        actions.jump();

        if (getHeigth() <= actions.getJumpHeight()) {
            System.out.println("jump success");

            return true;
        } else {
            System.out.println("jump unsuccessfully");

            return false;
        }
    }
}