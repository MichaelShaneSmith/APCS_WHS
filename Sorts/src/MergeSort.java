
public class MergeSort 
{
	Comparable [] a;
	
	public MergeSort(Comparable [] array)
	{
		a = array;
	}
	
	public void sort()
	{
		if(a.length <= 1) return;
		
		Comparable [] Alpha = new Comparable[a.length/2];
		Comparable [] Beta = new Comparable[a.length-Alpha.length];
		System.arraycopy(a, 0, Alpha, 0, Alpha.length);
		System.arraycopy(a, Alpha.length, Beta, 0, Beta.length);
		
		MergeSort AlphaSort = new MergeSort(Alpha);
		MergeSort BetaSort = new MergeSort(Beta);
		
		AlphaSort.sort();
		BetaSort.sort();
		
		merge(Alpha, Beta);
		
	}
	
	private void merge(Comparable[] fir, Comparable [] sec)
	{
		int f=0, s=0, i=0;
		
		while(f<fir.length && s<sec.length)
		{
			if(fir[f].compareTo(sec[s]) < 0)
			{
				a[i] = fir[f];
				f++;
			}
			else
			{
				a[i] = sec[s];
				s++;
			}
			
			i++;
		}
		
		System.arraycopy(fir, f, a, i, fir.length-f);
		System.arraycopy(sec, s, a, i, sec.length-s);
		
	}
	
}
