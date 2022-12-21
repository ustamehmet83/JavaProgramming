package day40_FinalKeyword;


import day38_Inheritance.Shape.Circle;
import day38_Inheritance.Shape.Square;

public class EncapsulationReview {

        private Circle circle;
        private Square square;

        public Circle getCircle(){
                return circle;
        }
        public void setCircle(){
                if (circle.getRadius() < 5) {
                        return;
                }
                this.circle=circle;
        }

        public Square getSquare() {
                return square;
        }

        public void setSquare(Square square) {
                this.square = square;
        }
}
