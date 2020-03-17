public class MainClass
{
    public static void main(String[] args)
    {
        System.out.println(encryption("iffactsdontfittotheorychangethefacts"));
    }
    static String encryption(String s)
    {
        s=s.replaceAll("\\s+","");

        int rows= (int) Math.floor(Math.sqrt(s.length()));
        int column=(int)Math.ceil(Math.sqrt(s.length()));

        //ensuring that r*l >=l
        while(rows*column<=s.length())
        {
            rows+=1;

        }
        int control=0;
        boolean flag=true;
        char arr[][]=new  char[rows][column];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<column;j++)
            {
                if(control<s.length())
                {
                    arr[i][j]=s.charAt(control);
                    control++;
                }
                else
                {
                    flag=false;
                    break;
                }
            }
            if(flag==false)
            {
                break;
            }
        }

        String ans="";
        for(int i=0;i<column;i++)
        {
            for(int j=0;j<rows;j++)
            {
                if(arr[j][i]>='a'&&arr[j][i]<='z')
                {
                    ans+=arr[j][i];
                }

            }
            ans+=" ";
        }
        return ans;




    }
}
