package argon.code.ch04.guess.entity;

import javafx.scene.control.Label;

import java.io.*;
import java.util.Random;

public class guessRule {
    private int totalCount;
    private int winCount;
    private String puzzlecontent;
    private StringBuffer puzzle;//存题目
    private int puzzleNum;
    private String sourcePath="D:\\Java\\code\\course\\ch04\\src\\argon\\code\\ch04\\guess\\puzzleSource.txt";
    public guessRule(){
        puzzle=new StringBuffer();
        puzzleNum=0;
        readFile();
        totalCount=0;
        winCount=0;
        selcetPuzzle();
    }

    /**
     * 将文件中的内容读入StringBuffer里
     */
    public void readFile(){
        BufferedReader br=null;
        try {
            br=new BufferedReader(new FileReader(sourcePath));
            String str;
            while ((str=br.readLine())!=null){
                puzzle.append(str);
                puzzle.append("\n");
                puzzleNum++;//统计一共有几题
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("ReadError");
        } catch (IOException e) {
            System.out.println("IOError");
        }
    }

    /**
     * 根据每个 \n 来分割字符串 并将其存入set字符串数组中
     * @return
     */
    public String[] puzzleSet(){
        String[] set=new String[puzzleNum];
        int start=0,i=0;
        while (start<puzzle.lastIndexOf("\n")) {
            set[i++]=puzzle.substring(start, puzzle.indexOf("\n", start));
            start = puzzle.indexOf("\n",start)+1;
        }
        return set;
    }

    /**
     * 选出一个作为题目
     * @return
     */
    public void selcetPuzzle(){
        var rand=new Random();
        puzzlecontent=puzzleSet()[rand.nextInt(puzzleNum)];
    }
    public String winRate(){//胜率
        return "总共答题次数："+totalCount+"\n\n"+"正确次数："+winCount
                +"\n\n"+String.format("正确率是：%.2f",(double)winCount/totalCount*100)+"%";
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getWinCount() {
        return winCount;
    }

    public void setWinCount(int winCount) {
        this.winCount = winCount;
    }
    public String showPuzzle(){
        var array =puzzlecontent.toCharArray();
        var random=new Random();
        for (int i=0;i<array.length-3;i++){
            array[random.nextInt(array.length)]='*';
        }
        return String.valueOf(array);
    }

    public String getPuzzlecontent() {
        return puzzlecontent;
    }
}
