package ru.netology.sqr;
public class SQRService {
    public int countSqrtInRange(int startRange, int endRange){
        int count = 0;

        for (int i = 10; i <= 99; i++ ){
            if ((startRange <= i * i) & (i * i <= endRange)){
                count = count + 1;
            }
        }

        return  count;

    }
}
