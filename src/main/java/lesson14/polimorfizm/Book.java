package lesson14.polimorfizm;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String plot() {
        return "Plot of the book";
    }

    public String getTitle() {
        return title;
    }
}

class HarryPotter extends Book {
    public HarryPotter() {
        super("HarryPotter");
    }

    @Override
    public String plot() {
        return "This is book about Wizards";
    }

    public void specificMethodForPotter() {
        System.out.println("Method for Potter");
    }
}

class LordOfTheRings extends Book {
    public LordOfTheRings() {
        super("LordOfTheRings");
    }

    @Override
    public String plot() {
        return "This is book about the ring";
    }

    public void specificMethodForLOTR() {
        System.out.println("Method for LordOfTheRings");
    }
}

class CookingBook extends Book {
    public CookingBook() {
        super("CookingBook");
    }

    @Override
    public String plot() {
        return "This is book about Cooking";
    }

    public void methodForCookingBook() {
        System.out.println("Method for CookingBook");
    }
}

class Main {
    public static void main(String[] args) {

        Book book = new Book("tes");
        HarryPotter hp = new HarryPotter();
        LordOfTheRings lord = new LordOfTheRings();
        CookingBook cp = new CookingBook();

        //or
//        Book hp = new HarryPotter();
//        Book lord = new LordOfTheRings();
//        Book cp = new CookingBook();
        //or
        // Object hp = new HarryPotter();

        hp.plot();
        System.out.println(hp.plot());

        ((HarryPotter) hp).specificMethodForPotter();
//
//        ArrayList<Book> books = new ArrayList<>();
//        books.add(hp);
//        books.add(lord);
//        books.add(cp);
        //or
        List<Book> books = new ArrayList<>();

        books.add(hp);
        books.add(lord);
        books.add(cp);
    }
}
