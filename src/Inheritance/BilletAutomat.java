package Inheritance;
//default
public class BilletAutomat {
    private int pris;
    private int saldo;
    private int total;
//Constructor
    public BilletAutomat(int billetpris){
        this.pris = billetpris;
        this.saldo = 0;
        this.total = 0;
    }

    //Getters
    public int getPris(){
        return this.pris;
    }
    public int getSaldo(){
        return this.saldo;
    }

    //Setters og metoder
    public void indbetal(int kroner){
        this.saldo = kroner;
    }
    public void printBillet(){
        if (this.saldo >= this.pris) {
            System.out.println("***************************");
            System.out.println("*");
            System.out.println("*");
            System.out.println("*");
            System.out.println("*");
            System.out.println("Billet: " + pris + " Kr.");
            System.out.println("***************************");
            this.total += this.saldo;
            this.saldo = 0;
        } else {
            System.out.println("***************************");
            System.out.println("*");
            System.out.println("*");
            System.out.println("*");
            System.out.println("*");
            System.out.println("Du mangler " + (this.pris - this.saldo) + " Kr.");
            System.out.println("***************************");
        }

    }



}
