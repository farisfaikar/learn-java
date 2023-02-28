import java.util.ArrayList;

public class TestArray {
    public static void main(String[] args) {
        // test1();
        // test2();
        test3();
        test4();
    }

    static void test1() {
        int[][] myFuckingArray = { { 1, 2, 3 }, { 4, 5, 6 } };

        myFuckingArray[0][1] = 11;
        myFuckingArray[0][2] = 22;
        myFuckingArray[0][3] = 33;

        myFuckingArray[1][1] = 44;
        myFuckingArray[1][2] = 55;
        myFuckingArray[1][3] = 66;

        System.out.println(myFuckingArray[0][0]);
        System.out.println(myFuckingArray[1][0]);
    }

    static void test2() {
        int[] myShittyArray = new int[1000];

        for (int i = 0; i < myShittyArray.length; i++) {
            myShittyArray[i] = i + 1;
        }

        for (int i = 0; i < myShittyArray.length; i++) { // you can either do this...
            System.out.println(myShittyArray[i]);
        }

        for (int elem : myShittyArray) { // ...or you can do this instead
            System.out.println(elem);
        }
    }

    static void test3() {
        Kucing[] myAssholeCats = new Kucing[5];

        myAssholeCats[0] = new Kucing();
        myAssholeCats[1] = new Kucing("Maine Coon", "Void");
        myAssholeCats[2] = new Kucing("British Shorthair", "Henry");
        myAssholeCats[3] = new Kucing("Scottish Fold", "Frazier");
        Kucing raskal = new Kucing("Sphynx");
        myAssholeCats[4] = raskal;

        myAssholeCats[0].setRas("Abyssinian");

        for (Kucing k : myAssholeCats)
            System.out.println(k.getRas());
    }

    static void test4() {
        ArrayList<Integer> myCrappyList = new ArrayList<Integer>();

        myCrappyList.add(420);
        myCrappyList.add(6);
        myCrappyList.add(8);
        myCrappyList.add(10);
        myCrappyList.add(3);

        System.out.println(myCrappyList);

        ArrayList<String> myShoddyList = new ArrayList<String>();

        myShoddyList.add("Asshat");
        myShoddyList.add("Dickwad");
        myShoddyList.add("Twat");
        myShoddyList.add("FuckFace");
        myShoddyList.add("Shithead");

        System.out.println(myShoddyList);

        for (String nama : myShoddyList)
            System.out.println(nama);


        System.out.println("==== My Kochengs ====");
        ArrayList<Kucing> myKochengs = new ArrayList<Kucing>();
        myKochengs.add(new Kucing()); 
        myKochengs.add(new Kucing("American Shorthair", "Chimken")); 
        myKochengs.add(new Kucing("Abyssinian Mix", "Shinta")); 
        myKochengs.add(new Kucing("Siberian", "Husky")); 
        myKochengs.add(new Kucing()); 

        myKochengs.get(0).setRas("Ocicat");
        myKochengs.get(4).setRas("Smoke Persian");

        for(Kucing kocheng : myKochengs)
            System.out.println(kocheng.getRas());
    }
}
