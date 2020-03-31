import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

//        Testing the book and author class
        Author a1 = new Author();
        a1.setName("Maria");
        a1.setGender('F');
        a1.setEmail("maria@gmail.com");
        System.out.println(a1.toString());
        Author a2 = new Author("John", "j@gmail.com", 'M');
        ArrayList<Author> authors = new ArrayList<Author>(Arrays.asList(a1, a2));


        Book b1 = new Book("Kamasutra", authors, 50000);
        System.out.println(b1.toString());
        System.out.println(b1.getAuthorsName());

//        Testing MyPoint class
        MyPoint p1 = new MyPoint(3, 4);
        MyPoint p2 = new MyPoint(1, 2);
        System.out.println(p1.distance(p2));
        System.out.println(p1.distance());

        MyPoint [] points = new MyPoint[10];

//        initialize the MyPoints array
        for(int i = 0 ; i<points.length;i++)
        {
            points[i]= new MyPoint(i,i);
        }
//        printing myPoints array
        for (MyPoint point:points)
        {
            System.out.print(Arrays.toString(point.getPoint()));
        }
        System.out.println();

//        Testing myCircle
        MyCircle c1 = new MyCircle(2,5,10);
        System.out.println(c1.getArea());
        System.out.println(c1.getCircumference());

//        Testing Circles distances
        MyCircle c2 = new MyCircle(1,3,5);
        System.out.println(c1.distance(c2));

//        Testing Triangle
        MyTriangle t1 = new MyTriangle(4,2,3,4,5,6);
        System.out.println(t1.getPerimeter());
        System.out.println(t1.getType());

    }
}
