package org.andestech.learning.rfb18.g2;

import java.util.Arrays;

/**
 * Сomparing arrays
 */
public class App 
{
    public static void main( String[] args )
    {
        int N = 10;
        int start = 0;
        String[] s1 = new String[N];
        for (int i = start; i < N; i++)
            s1[i] = "q" + i;
        System.out.println(Arrays.asList(s1));
        String[] s2 = new String[N];
        for (int i = start; i < N; i++)
            s2[i] = "q" + i*i;
        System.out.println(Arrays.asList(s2));

        for (int i=start; i < N; i++){
            for (int j=start; j<N; j++)
            {
                if (s1[i].equals(s2[j]))
                    System.out.println("Matched! - " + s1[i]);
            }
        }
    }
}
