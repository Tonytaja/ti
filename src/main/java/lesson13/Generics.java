package lesson13;

public class Generics {

    public  void main(String[] args) {

        var vase= new Vase<Rose>();
        var vaseTulip= new Vase<Tulip>();
        var rose= new Rose();
        var tulip=new Tulip();
        vase.setFlower(rose);
        vaseTulip.setFlower(tulip);
    }
    class Vase<T>{
        T flower;

        public void setFlower(T flower){
            this.flower=flower;
        }

    }

    class Tulip extends Flower{

    }
    class Rose extends Flower{

    }
    class  Flower{

    }

}
