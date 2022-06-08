
// Main logic of Java Comparable


class Pair implements Comparable<Pair>
{
    int p, c, m;
    
    Pair(int p, int c, int m)
    {
        this.p = p;
        this.c = c;
        this.m = m;
    }
    
    
    public int compareTo(Pair x)
    {
        if(p!=x.p)
        {
            return p-x.p;
        }
        else
        {
            if(c!=x.c)
            {
                return x.c-c;
            }
            else
            {
                return m-x.m;
            }
        }
    }
    
}

class Solution
{
    
    public void customSort (int phy[], int chem[], int math[], int N)
    {
        
        Pair pair[] = new Pair[N];
        
        for(int i=0; i<N; i++)
        {
            pair[i] = new Pair(phy[i], chem[i], math[i]);
        }
        
        Arrays.sort(pair);
        
        for(int i=0; i<N; i++)
        {
            phy[i] = pair[i].p;
            chem[i] = pair[i].c;
            math[i] = pair[i].m;
        }
        
    }
}