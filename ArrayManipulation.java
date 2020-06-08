#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    long int N,K,p,q,sum,i,j,max=0,x=0;

    cin>>N>>K;
    long int *a=new long int[N+1]();

    for(i=0;i<K;i++)
    {
        cin>>p>>q>>sum;
        a[p]+=sum;
        if((q+1)<=N) a[q+1]-=sum;
    }
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the arrayManipulation function below.
   public static void main(String args[])
   {
       int n,k,sum,p,q;
       long max=0;

       Scanner sc=new Scanner(System.in);
       n=sc.nextInt();
        k=sc.nextInt();
       long a[]=new long[n];
       for(int j=0;j<k;j++)
       {
           p=sc.nextInt();
           q=sc.nextInt();
           sum=sc.nextInt();
           a[p-1]+=sum;
           if(q<n)
           a[q]-=sum;
       }
    long x=0;
        for(int i=0;i<n;i++)
    {
       x=x+a[i];
       if(max<x)
        max=x;
    }
    System.out.print(max);
   }
}
