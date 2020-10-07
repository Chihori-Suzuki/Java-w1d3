import java.util.Scanner;

public class ComputePerimeterTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int edge1 = input.nextInt();
        int edge2 = input.nextInt();
        int edge3 = input.nextInt();

        int perimeter = edge1 + edge2 + edge3;
        if((edge1 < edge2 + edge3) && (edge2 < edge1 + edge3) && (edge3 < edge1 + edge2)){
            System.out.println("perimeter is : " + perimeter);
        }else{
            System.out.println("that the input is invalid. ");
        }

    }
}
