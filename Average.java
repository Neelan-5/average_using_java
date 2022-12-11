/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package average;

/**
 *
 * @author lenovo
 */
public class Average {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int i=97,j=93,k=95,l=97,m=77,avg;
            avg=(i+j+k+l+m)/5;
    System.out.println("Average="+avg);
    switch (avg){
        case 1:
            if(avg<50){
                System.out.println("Average="+avg+".fail");
                break;
            }
        case 2:
            if (avg>=50 && avg<60){
                System.out.println("Average="+avg+".grade:A");
                break;
            }
        case 3:
            if (avg>=60 && avg<80){
                System.out.println("Average="+avg+".grade:O");
            break;
            }
        default:
             System.out.println("Average="+avg+".grade:S");
    }
    }
}
