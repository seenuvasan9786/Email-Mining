import java.util.Scanner;

public class Find_Email
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // Scanner is used to get the string value.
        System.out.print("Enter The line of text:");
        String text=input.nextLine();
        // String text is used to store the input string value.
        System.out.println(text);
        StringBuilder t=new StringBuilder();
        // StringBuilder was Easy to modify.String is not allow the modify it only read.
        int temp;
        //int temp is used to store the '@' index_Position.
        for(int i=0;i<text.length();i++)
        {
            if(text.charAt(i)=='@')//It is usued to Find the index_position of the '@'
            {
                temp=i;//Store the '@' Position.
                for(int j=i;j>=0;j--)
                //First find the '@' position and Go in front on the '<Space(32)>'
                {
                    if(text.charAt(j)==' ')//This condition is used to find the Space in front of '@'
                    {
                        for(int d=j+1;d<=temp+9;d++)/*Finish to find space then Go Front with the condition of index_positon of @ the add 9 because @gmail.com is 10 character.*/   
                        {
                            t.append(text.charAt(d));
                        }
                        t.append(',');//To sperate the emails.
                        j=-1;// This is used to make the false to for loop.
                    }
                }
            }
        }
        System.out.println(t);
    }
}
