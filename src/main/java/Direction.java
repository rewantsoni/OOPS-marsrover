public enum Direction {
    N {
        @Override
        public Direction rotate(boolean right) {
            return right ? Direction.E : Direction.W;
        }

        @Override
        public Coordinate move(Coordinate currentCoordinate) {
            return currentCoordinate.getOneUp();
        }
    },

    S {
        @Override
        public Direction rotate(boolean right) {
            return right ? Direction.W : Direction.E;
        }

        @Override
        public Coordinate move(Coordinate currentCoordinate) {
            return currentCoordinate.getOneDown();
        }
    },

    E {
        @Override
        public Direction rotate(boolean right) {
            return right ? Direction.S : Direction.N;
        }

        @Override
        public Coordinate move(Coordinate currentCoordinate) {
            return currentCoordinate.getOneLeft();
        }
    },

    W {
        @Override
        public Direction rotate(boolean right) {
            return right ? Direction.N : Direction.S;
        }

        @Override
        public Coordinate move(Coordinate currentCoordinate) {
            return currentCoordinate.getOneRight();
        }
    };

    public abstract Direction rotate(boolean right);

    public abstract Coordinate move(Coordinate currentCoordinate);

}
