import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Дабро пажаловат в площады и периметри Ашота");
        boolean pravda = true;
        while(pravda) {
            System.out.println("Выберите действие\n1.Круг\n2. Квадрат\n3. Треугольник\n4. Пятиугольник\n5. Трапеция\n6. прямоугольник\n7. Параллелограмм\n" +
                    "8. Параллелипипед\n9. Цилиндр\n10. Сфера\n11. Ромб\n12. Конус\n13. Выход");
            int deistvie = sc.nextInt();
            switch (deistvie) {
                case (1):
                    System.out.println("Введите радиус круга: ");
                    double radius = sc.nextDouble();
                    Krug krug = new Krug(radius);
                    krug.Ploshad();
                    krug.Perimetr();
                    break;
                case (2):
                    System.out.println("Введите сторону квадрата: ");
                    double storona = sc.nextDouble();
                    Kvadrat kvadrat = new Kvadrat(storona);
                    kvadrat.Ploshad();
                    kvadrat.Perimetr();
                    break;
                case (3):
                    System.out.println("Введите сторону треугольника: ");
                    double Storona = sc.nextDouble();
                    System.out.println("Введите высоту треугольника: ");
                    double vysota = sc.nextDouble();
                    Treugolnik treugolnik = new Treugolnik(Storona, vysota);
                    treugolnik.Ploshad();
                    treugolnik.Perimetr();
                    break;
                case (4):
                    System.out.println("Введите сторону пятиугольника: ");
                    double storonap = sc.nextDouble();
                    Pyat pyat = new Pyat(storonap);
                    pyat.Ploshad();
                    pyat.Perimetr();
                    break;
                case (5):
                    System.out.println("Введите первую сторону трапеции: ");
                    double storona1 = sc.nextDouble();
                    System.out.println("Введите вторую сторону трапеции: ");
                    double storona2 = sc.nextDouble();
                    System.out.println("Введите третью сторону трапеции: ");
                    double storona3 = sc.nextDouble();
                    System.out.println("Введите четвертую сторону трапеции: ");
                    double storona4 = sc.nextDouble();
                    System.out.println("Введите высоту трапеции: ");
                    double vysotat = sc.nextDouble();
                    Trapets trapets = new Trapets(storona1,storona2,storona3,storona4,vysotat);
                    trapets.Ploshad();
                    trapets.Perimetr();
                    break;
                case (6):
                    System.out.println("Введите длину прямоугольника: ");
                    double dlina = sc.nextDouble();
                    System.out.println("Введите ширину прямоугольника: ");
                    double shirina = sc.nextDouble();
                    if(dlina > shirina)
                    {
                        Pryam pryam = new Pryam(shirina, dlina);
                        pryam.Ploshad();
                        pryam.Perimetr();
                    }
                    else
                    {
                        System.out.println("Длина должна быть больше ширины");
                    }
                    break;
                case (7):
                    System.out.println("Введите сторону параллелограмма: ");
                    double storonapl1 = sc.nextDouble();
                    System.out.println("Введите сторону параллелограмма: ");
                    double storonapl2 = sc.nextDouble();
                    System.out.println("Введите высоту параллелограмма: ");
                    double vysotap = sc.nextDouble();
                    Paral paral = new Paral(storonapl1, storonapl2, vysotap);
                    paral.Ploshad();
                    paral.Perimetr();
                    break;
                case (8):
                    System.out.println("Введите длину параллелипипеда: ");
                    double dlinapa = sc.nextDouble();
                    System.out.println("Введите ширину параллелипипеда: ");
                    double shirinapa = sc.nextDouble();
                    System.out.println("Введите высоту параллелипипеда: ");
                    double vysotapa = sc.nextDouble();
                    Parallel parallel = new Parallel(dlinapa, shirinapa,vysotapa);
                    parallel.Ploshad();
                    parallel.Perimetr();
                    break;
                case (9):
                    System.out.println("Введите радиус цилиндра: ");
                    double radiuss = sc.nextDouble();
                    System.out.println("Введите высоту цилиндра: ");
                    double vysotac = sc.nextDouble();
                    Cilindr cilindr = new Cilindr(radiuss, vysotac);
                    cilindr.Ploshad();
                    cilindr.Perimetr();
                    break;
                case (10):
                    System.out.println("Введите радиус сферы: ");
                    double radiussf = sc.nextDouble();
                    Sfera sfera = new Sfera(radiussf);
                    sfera.Ploshad();
                    sfera.Perimetr();
                    break;
                case (11):
                    System.out.println("Введите длину ромба: ");
                    double dlinar = sc.nextDouble();
                    System.out.println("Введите высоту ромба: ");
                    double vysotar = sc.nextDouble();
                    Romb romb = new Romb(vysotar, dlinar);
                    romb.Ploshad();
                    romb.Perimetr();
                    break;
                case (12):
                    System.out.println("Введите радиус конуса: ");
                    double radiusk = sc.nextDouble();
                    System.out.println("Введите высоту конуса: ");
                    double vysotak = sc.nextDouble();
                    System.out.println("Введите образующую конуса");
                    double obraz = sc.nextDouble();
                    Konus konus = new Konus(radiusk,vysotak,obraz);
                    konus.Ploshad();
                    konus.Perimetr();
                    break;
                case (13):
                    pravda = false;
            }
        }
    }
}

abstract class Figura{
    abstract void Ploshad();
    abstract void Perimetr();
}

class Krug extends Figura{
    double radius;
    Krug(double radius){
        this.radius = radius;
    }
    void Ploshad(){
        double Ploshad = 3.14 * radius * radius;
        System.out.println("Площадь круга: "+Ploshad);
    }
    void Perimetr(){
        double Perimetr = 2 * 3.14 * radius;
        System.out.println("Периметр круга: "+Perimetr);
    }
}

class Kvadrat extends Figura{
    double storona;
    Kvadrat(double storona){
        this.storona = storona;
    }
    void Ploshad(){
        double Ploshad = storona * storona;
        System.out.println("Площадь квадрата: "+ Ploshad);
    }
    void Perimetr(){
        double Perimetr = storona * 4;
        System.out.println("Периметр квадрата: "+ Perimetr);
    }
}

class Treugolnik extends Figura{
    double storona;
    double vysota;
    Treugolnik(double Storona, double vysota){
        this.storona = Storona;
        this.vysota = vysota;
    }
    void Ploshad(){
        double Ploshad = (storona * vysota)/2;
        System.out.println("Площадь треугольника: "+ Ploshad);
    }
    void Perimetr(){
        double Perimetr = (storona * 3);
        System.out.println("Периметр треугольника: "+ Perimetr);
    }
}

class Pyat extends Figura{
    double storona;
    Pyat(double storonap){
        this.storona = storonap;
    }
    void Ploshad(){
        double Ploshad = 0.25 * 5 * storona * storona / Math.tan(3.14 / 5);
        System.out.println("Площадь пятиугольника: " + Ploshad);
    }
    void Perimetr(){
        double Perimter = storona * 5;
        System.out.println("периметр пятиугольника: " + Perimter);
    }
}

class Trapets extends Figura{
    double storona1;
    double storona2;
    double storona3;
    double storona4;
    double vysota;
    Trapets(double storona1, double storona2, double storona3, double storona4, double vysotat){
        this.storona1 = storona1;
        this.storona2 = storona2;
        this.storona3 = storona3;
        this.storona4 = storona4;
        this.vysota = vysotat;
    }
    void Ploshad(){
        double Ploshad = (storona1 + storona2)/2 * vysota;
        System.out.println("Площадь трапеции: " + Ploshad);
    }
    void Perimetr(){
        double Perimetr = storona1 + storona2 + storona3 + storona4;
        System.out.println("Периметр трапеции: " + Perimetr);
    }
}

class Pryam extends Figura{
    double dlina;
    double shirina;
    Pryam(double dlina, double shirina){
        this.dlina = dlina;
        this.shirina = shirina;
    }
    void Ploshad(){
        double Ploshad = shirina * dlina;
        System.out.println("Площадь прямоугольника: " + Ploshad);
    }
    void Perimetr(){
        double Perimetr = (shirina+dlina)*2;
        System.out.println("Периметр прямоугольника: " + Perimetr);
    }
}

class Paral extends Figura{
    double storona1;
    double vysota;
    double storona2;
    Paral(double storonapl1, double storonapl2, double vysotap){
        this.storona1 = storonapl1;
        this.storona2 = storonapl2;
        this.vysota = vysotap;
    }
    void Ploshad(){
        double Ploshad = storona1 * vysota;
        System.out.println("Площадь параллелограмма: " + Ploshad);
    }
    void Perimetr(){
        double Perimetr = (storona1+storona2)*2;
        System.out.println("Периметр параллелограмма: " + Perimetr);
    }
}

class Parallel extends Figura{
    double dlina;
    double vysota;
    double shirina;
    Parallel(double storonapa, double shirinapa, double vysotapa){
        this.dlina = storonapa;
        this.shirina = shirinapa;
        this.vysota = vysotapa;
    }
    void Ploshad(){
        double Ploshad = 2*(dlina*shirina+dlina*vysota+shirina*vysota);
        System.out.println("Площадь параллелипипеда: " + Ploshad);
    }
    void Perimetr(){
        double Perimetr = dlina*shirina*vysota;
        System.out.println("Объем параллелипипеда: " + Perimetr);
    }
}
class Cilindr extends Figura{
    double radius;
    double vysota;
    Cilindr(double radiuss, double vysotac){
        this.radius = radiuss;
        this.vysota = vysotac;
    }
    void Ploshad(){
        double Ploshad1 = 2* 3.14 * radius * vysota;
        double Ploshad2 = 2 * 3.14 + radius * (radius+vysota);
        System.out.println("Площадь боковой поверхности цилиндра: " + Ploshad1);
        System.out.println("Площадь полной поверхности цилиндра: " + Ploshad2);
    }
    void Perimetr(){
        double Perimetr = 3.14*radius*radius*vysota;
        System.out.println("Объем цилиндра: " + Perimetr);
    }
}

class Sfera extends Figura{
    double radius;
    Sfera(double radiussf){
        this.radius = radiussf;
    }
    void Ploshad(){
        double Ploshad = 4* 3.14 * radius * radius;
        System.out.println("Площадь сферы: " + Ploshad);
    }
    void Perimetr(){
        double Perimetr = 4*(radius*radius*radius*3.14)/3;
        System.out.println("Объем сферы: " + Perimetr);
    }
}

class Romb extends Figura{
    double dlina;
    double vysota;
    Romb(double dlinar, double vysotar){
        this.dlina = dlinar;
        this.vysota = vysotar;
    }
    void Ploshad(){
        double Ploshad = dlina * vysota;
        System.out.println("Площадь ромба: " + Ploshad);
    }
    void Perimetr(){
        double Perimetr = dlina * 4;
        System.out.println("Периметр ромба: " + Perimetr);
    }
}

class Konus extends Figura{
    double radius;
    double vysota;
    double obraz;
    Konus(double radiusk, double vysotak, double obraz){
        this.radius = radiusk;
        this.vysota = vysotak;
        this.obraz = obraz;
    }
    void Ploshad(){
        double Ploshad1 = 3.14 * radius * radius;
        double Ploshad2 = 3.14 * radius * obraz;
        System.out.println("Площадь основания конуса: " + Ploshad1);
        System.out.println("Площадь боковой поверхности конуса: " + Ploshad2);
    }
    void Perimetr(){
        double Perimetr = (3.14*radius*radius*vysota)/3;
        System.out.println("Периметр ромба: " + Perimetr);
    }
}