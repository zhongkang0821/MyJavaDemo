package com.example;

/**
 * 1.
 * 2.仲康
 * 3.2016/11/23
 */
public class TwopointsClass {

    public static void main(String[] args) {
        //有序排列数组
        int[] array = {1,2,3,4,5,6,7,8,9,10};

        System.out.println(searchRecursive(array,0,array.length-1,9));
    }

    public static int searchRecursive(int[] array,int start,int end,int findValue){

        if(array==null){
            return -1;
        }
        if(start<=end){
            //中间位置
            int middle = (start + end)/1;
            //中值
            int middleValue = array[middle];

            if(findValue == middleValue){
                //与中值相等就直接返回
                return middle;
            }else if(findValue < middleValue){
                //目标值小于中值，在中值前面找
                return searchRecursive(array,start,middle - 1,findValue);
            }else {
                //目标值大于中值，在中值后面找
                return searchRecursive(array,middle + 1,end,findValue);
            }

        }else{
            //返回-1，查找失败
            return -1;
        }
    }
}
