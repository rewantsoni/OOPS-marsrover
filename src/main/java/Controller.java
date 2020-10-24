public class Controller {

    private final Mars mars;
    private final Rover rover;

    public Controller(Mars mars, Rover rover) {
        this.mars = mars;
        this.rover = rover;
    }

    public void execute(Instructions instructions) {

        while (instructions.hasNext()) {
            Instruction instruction = instructions.next();
            instruction.execute(rover);

            if (!mars.isValidCoordinate(rover.getCoordinate())) {
                throw new UnsupportedOperationException("rover out of bound");
            }
        }

    }
}
