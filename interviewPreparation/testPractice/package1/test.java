package package1;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import Streams.Foreach_method;
import Streams.stream_method;

import java.util.Arrays;

public class test{
    public static void main(String[] args) {
        int i,j, number,count;

        for(number =1; number<=100; number++) {
            count =0;

            for (j = 2; j <= number / 2; j++) {
                if(number%j == 0){
                    count++;
                 ;
                 break;
                }

            }

            if(count==0 && number!=1){
                System.out.println(" "+ number);
            }
        }
    }
}