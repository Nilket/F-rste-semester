package Inheritance;

public class Billet {
    protected int pris;
    protected int saldo;
    protected int total;

    public Billet() {


    }

    public int getPris() {
        return this.pris;
    }

    public int getSaldo() {
        return this.saldo;
    }

    public void indbetal(int kroner) {
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
