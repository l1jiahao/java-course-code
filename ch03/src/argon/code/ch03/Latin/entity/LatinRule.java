package argon.code.ch03.Latin.entity;

import argon.code.ch03.Latin.LatinSqure;

public class LatinRule {
    private String[] Figure;
    private String[] Value;
    public LatinRule(){
        Figure=new String[]{"♥","♦","♣","♠"};
        Value=new  String[]{"A","2","3","4","5","6"};
    }
    public int[] generateFigure(){//在数列中存索引 如0 1 2 3 1 2 3 0等一系列数字 通过该索引取花色数组里访问相应值
        int[] figureSqure=new int[36];
        for (int i=0;i<Value.length;i++){
            for(int j=0;j<Value.length;j++){
                figureSqure[i*6+j]=(j+i)%4;
            }
        }
        return figureSqure;
    }
    public int[] generateValue(){//同上
        int[] valueSqure=new int[36];
        for (int i=0;i<Value.length;i++){
            for(int j=0;j<Value.length;j++){
                valueSqure[i*6+j]=(j+i)%6;
            }
        }
        System.out.println(valueSqure);
        return valueSqure;
    }

    public String[] getFigure() {
        return Figure;
    }

    public String[] getValue() {
        return Value;
    }
}
