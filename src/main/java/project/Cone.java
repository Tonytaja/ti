package project;


    public class Cone extends Volume{
        private double baseRadius;
        private double height;
        private final double PI=3.14;
        public Cone(double baseRadius, double height){
            this.baseRadius=baseRadius;
            this.height=height;
        }
        @Override
        public double calculateTheVolume() {
            return PI*Math.pow(baseRadius,2)*(height/3);
        }
    }

