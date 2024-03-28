
package twitter;

import java.util.Scanner;


public class Twitter {

    
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

            int choice=0;
            while (choice<3) {
                System.out.println("");
                System.out.println("press one for a rectangle, tow for triangle & 3 to finish the program");
                choice = in.nextInt();
                switch (choice) {
                    case 1:
                        rectangle();
                        break;
                    case 2:
                        triangle();
                        break;

                }
                if (choice == 3) {
                    System.out.println("The program is over");
                    break;
                }
            }
        }
    
    public static void rectangle(){
    Scanner in = new Scanner(System.in);
    int length=0,  width=0,  hekef=0;
    System.out.println("Enter length and width");
    length=in.nextInt();
    width=in.nextInt();

    while (length<2){

        System.out.println("The length is less than two. It must be 2 or more!");
        length=in.nextInt();

    }
    while (width<=0){
        System.out.println("The width is less than zero. Please enter a positive number!");
        width=in.nextInt();
    }

    if(width==length||(Math.abs(length-width)>5))
        System.out.println("Area of the rectangle:"+length*width);
    else
        hekef=(length*2)+(width*2);
        System.out.println("The perimeter of the rectangle:"+ hekef);



}
public static void triangle() {
    Scanner in = new Scanner(System.in);
    int height=0, width=0;
    System.out.println("Enter height and width");

    height=in.nextInt();
    width=in.nextInt();

    while (height<2){

        System.out.println("The length  less than two. It must be 2 or more!");
        height=in.nextInt();

    }
    while (width<=0){
        System.out.println("The width is less than zero. Please enter a positive number!");
        width=in.nextInt();
    }

    System.out.println("press one, To calculate the perimeter of the triangle. & tow, To print the triangle");
    int choice=in.nextInt();
    switch (choice){
        case 1:
            int basic= width/2;
            int tzela=height*height+basic*basic;
            int hekef= (int) Math.sqrt(tzela)+(int) Math.sqrt(tzela)+width;
            System.out.println("The perimeter of the triangle:"+hekef );
            break;
        case 2:
            print(height,width);
            break;
    }
}
public static void print(int height,int width){
        int count=1; int mode=0; int numOfLine=0; int mid=0;
        mid = height-2;

        if(width%2==0||(width/2)>height)
            System.out.println("Not suitable for printing");
        else
        {
            for (int i=3;i<width;i++){
                if(i%2!=0)
                    count++;
            }

            mode=mid%count;
            numOfLine=mid/count;
            printStars(count,mode,numOfLine,width);

    }
}

    public static void printStars(int count, int mode, int numOfLine,int width)
    {
        int star=1;
        printSpace(width, star);
        System.out.println("*");
        
        for(int i=1;i<=count;i++){
            if (width > 3)
            star+=2;
            if(i==1){
                for(int j=0;j<mode+numOfLine;j++){
                    printSpace(width, star);
                    for(int k=0;k<star;k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }


            }
            else{
                for(int j=0;j<numOfLine;j++) {
                    printSpace(width, star);
                    for(int k=0;k<star;k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
        }
        for(int l=0;l<width;l++)
            System.out.print("*");
    }
    
    public static void printSpace(int rochav, int star){
        for(int i=0; i<(rochav-star)/2;i++){
            System.out.print(" ");
        }
    }

}

    
    
