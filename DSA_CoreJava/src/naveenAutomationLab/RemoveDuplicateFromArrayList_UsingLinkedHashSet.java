package naveenAutomationLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateFromArrayList_UsingLinkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//https://www.youtube.com/watch?v=HLHPgbgqqu8
		Integer arr[] ={2,5,2,3,4,5,6,7,80,2,8,80, 9};
		
		ArrayList<Integer>  al= new ArrayList<Integer>(Arrays.asList(arr));
		
		
		System.out.println(al);
		
		LinkedHashSet<Integer> linkhset = new LinkedHashSet<Integer>(al);
		
		System.out.println(linkhset);
		
		//Convert HashSet to List
		
		ArrayList<Integer> numWithOutDup= new ArrayList<Integer>(linkhset)  ;
		System.out.println(numWithOutDup);
		//Using Java8 Stream// 
		
		Integer marks[] ={2,5,2,3,4,5,6,7,80,2,8,80, 9};
		ArrayList<Integer> alMarks = new ArrayList<Integer>(Arrays.asList(marks));
		
		List<Integer> marksUnique= alMarks.stream().distinct().collect(Collectors.toList());
		System.out.println(marksUnique);
		
		
		
		

	}

}
