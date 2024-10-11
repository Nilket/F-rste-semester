package Arrays;
//Start med at skrive en klasse der hedder IterateThroughArray
//Lav en main-metode og et double-array med værdierne {4.5, 25.3, 12.1, 34.0, 15.5 }.
//I de næste del-opgaver skal du skrive for-loops der gør forskellige ting. Udkommenter koden fra den tidligere opgave før du går i gang med den næste. Lad være med at slette den, eller lave om i den løsning du allerede har fået til at virke – så har du løsningen til at kigge på en anden gang.
//Til næste opgave skal vi lige kigge i Javas dokumentation. Søg i din browser på ”java 17 docs”. Gå ind på linket til Oracle Help Center. Nu er du inde på den officielle Java-dokumentation. Søg på java.lang.math i søgefeltet øverst til højre. Nu er du inde på Math-klassens dokumentation. Scroll ned og se alle de metoder Math-klassen indeholder. Fordi Math-klassens metoder er statiske behøver du ikke at lave et nyt objekt med new. I stedet kaldes metoderne således, fx hvis man vil finde kvadratroden af tallet 4.3:




public class ArrayOpgave2 {

    public static void main(String[] args) {

        //Opg 1,2,3,4,5
        double[] f = {4.5,25.3,12.1,34.0,15.5};

        for(int i = 0; i < f.length; i++){

            System.out.println(Math.pow(f[i],2));
        }

        //Opg 6,7
        double smallest = f[0];
        double largest = f[0];

        for(int x = 0; x < f.length; x++){
            if (f[x] < smallest) smallest = f[x];
            if (f[x] > largest) largest = f[x];
        }

        System.out.println(smallest);
        System.out.println(largest);
        //Opg 8
        for(int p = 0; p < f.length; p++){
            System.out.println(f[p]);

            if (f[p] == 12.1) {
                System.out.println("Hurra!");
                System.out.println("Hurra vi fandt 12,1" + "Det stod på " + p);
            }


        }




    }



}
