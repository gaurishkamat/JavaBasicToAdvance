package org.example;

class VarArgs {
    public static void main(String[] args) {
        System.out.println(concatenate("Gaurish", "is", "learning", "Java", "Spring", "Boot"));
    }

    public static String concatenate(String ...args){
        StringBuilder str = new StringBuilder();
        for (String arg : args) {
            str.append(arg).append(" ");
        }
        return str.toString();
    }
}

