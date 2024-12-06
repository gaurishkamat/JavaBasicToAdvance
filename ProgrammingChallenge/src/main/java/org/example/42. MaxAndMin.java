package org.example;

class MaxAndMin {
    public static void main(String[] args) {
        int[] myArray = ArrayUtility.inputArray();

        int min = getMinimum(myArray);
        System.out.println("Minimum value is: "+ min);

        int max = getMaximum(myArray);
        System.out.println("Maximum value is: "+ max);

    }

    public static int getMinimum(int[] array){
        int min =array[0];

        for(int _item:array){
            if(min > _item){
                min = _item;
            }
        }

        return min;
    }

    public static int getMaximum(int[] array){
        int max =array[0];

        for(int _item:array){
            if(max < _item){
                max = _item;
            }
        }

        return max;
    }
}
