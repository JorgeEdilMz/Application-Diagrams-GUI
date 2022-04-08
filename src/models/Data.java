package models;

public class Data {
    String[] headers = {"","2018","2019","2020","2021"};
    Object[][] data = {
            {"Enero",200,150,180,220},
            {"Febrero",150,160,170,180},
            {"Marzo",300,300,310,300},
            {"Abril",180,200,180,700}
    };

    public String[] getHeaders() {
        return headers;
    }


    public Object[][] getData() {
        return data;
    }

    public int sumColumn(int number){
        int result = 0;
            for (int i = 0,j = number; i < data.length ; i++) {
                result += (int)data[i][j];
            }
        return  result;
    }
    public int[] sumColumns(){
        int[] result = new int[headers.length-1];
        int temp = 0;
        for (int k = 1,j = 0; k <= headers.length-1; k++,j++) {
            for (int i = 0; i < data.length ; i++) {
                temp += (int)data[i][k];
            }
            result[j] = temp;
            temp=0;
        }
        return result;
    }

    public int sumTotalColumns(){
        int sumTotal = 0;
        for (int i = 1; i <= 4; i++) {
            sumTotal += sumColumn(i);
        }
        return sumTotal;
    }

    public int maxValor() {
        int max = sumColumn(1);
        for (int i = 2; i <= 4; i++) {
            if (max < sumColumn(i)) {
                max = sumColumn(i);
            }
        }
        return max;
    }

    public int size(){
        return headers.length;
    }
}
