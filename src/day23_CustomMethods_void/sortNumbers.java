package day23_CustomMethods_void;

class sortNumbers
{
    public static void main(String[] args)
    {
        int[] data={40,50,10,30,20,5};
        System.out.println("Unsorted List is :");
        display(data);
        sort(data);
        System.out.println("\nSorted List is :");
        display(data);
    }
    static void display(int num[])
    {
        for(int i=0; i<num.length;i++)
            System.out.print(num[i] + " ");
    }
    static void sort(int num[])
    {
        int i, j, temp;
        for(i=0; i<num.length-i;i++)
        {
            for(j=0; j<num.length-i-1;j++)
            {
                if(num[j]>num[j+1])
                {
                    temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }
        }
    }
}
