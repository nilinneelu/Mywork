package org.example;

public class Main {
    public static void main(String[] args) {

        String var="Nilin";
        char v;
        String rev="";

                for(int i= var.length()-1;i>=0;i--)
                {
                    v=var.charAt(i);
                    rev=rev+v;
                }
                System.out.println("The string reverse is "+rev);

        }
    }
