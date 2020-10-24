import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Instructions implements Iterator<Instruction> {

    private int curr = 0;
    private final List<Instruction> instructionList;

    Instructions(String instructions) {
        instructionList = new ArrayList<>();

        for (int i = 0, sz = instructions.length(); i < sz; i++) {
            instructionList.add(
                    Instruction.valueOf(
                            String.valueOf(
                                    instructions.charAt(i)
                            )
                    )
            );
        }
    }

    @Override
    public boolean hasNext() {
        return curr < instructionList.size();
    }

    @Override
    public Instruction next() {
        return instructionList.get(curr++);
    }
}

enum Instruction {
    L {
        @Override
        public void execute(Rover rover) {
            rover.rotateLeft();
        }
    },

    M {
        @Override
        public void execute(Rover rover) {
            rover.move();
        }
    },

    R {
        @Override
        public void execute(Rover rover) {
            rover.rotateRight();
        }
    };

    public abstract void execute(Rover rover);
}
