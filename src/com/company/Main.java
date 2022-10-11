package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int[] a = {4, 4, 6, 11, -2, 3};
        int[] b = {5, 11, 11, -3, 3, 5};

        int[] symDiffL = symetricDiff(a, b);
        int[] symDiffLast = symetricDiff(b, a);

        // print the symmetric difference
        System.out.print("symDiff:");
        for (int s : symDiffL)
            System.out.print(" " + s);
        for (int s : symDiffLast)
            System.out.print(" " + s);
    }

    static int[] symetricDiff (int[] a, int[] b)
    {
        int[] symDiff = new int[a.length + b.length];

        boolean noneSame;
        int counter = 0;

        for (int aa : a)
        {
            noneSame = true;
            for (int bb : b)
            {
                if (aa == bb)
                {
                    noneSame = false;
                }
            }
            if (noneSame)
            {
                symDiff[counter] = aa;
                counter++;
            }
        }

        // delete extra 0's
        int[] symDiffL = new int[counter];
        for (int i = 0; i < counter; i++)
            symDiffL[i] = symDiff[i];

        return symDiffL;
    }
}
