package Streams;

import java.time.Clock;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Reflection","Collection","Stream");
        Stream<String> result = names.stream().filter(s->s.startsWith("S"));
        List<String> resultList = result.collect(Collectors.toList());


        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //1. Find below a list of integers. Iterate over it and print the square of each number.

        //```java
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Stream<Integer> st =  numbers.stream();
        st.map(ele->ele*ele).forEach((ele)->System.out.println(ele));

        // Enter your code here
        // sol:
        Stream<Integer> s =  numbers.stream();
        s.map((ele)->ele*ele).forEach(System.out::println);
//		```
//
////		2. Find below a list of integers. Iterate over it and print every even number.
////
////		```java
        List<Integer> numbers1 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // Enter your code here
        // sol:
        Stream<Integer> s1 =  numbers1.stream();
        s1.filter((ele)-> ele%2==0).forEach((ele)->System.out.println(ele));
////		```
////
////		3. For the list of integers, find all the even numbers. Then, iterate over the even numbers and print each number.
////
////		```java
        List<Integer> numbers3 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // Enter your code here
        Stream<Integer> s3 =  numbers3.stream();
        s3.filter((ele)->{return ele%2==0;}).forEach(System.out::println);
////		```
////
////		4. For a list of integers, return a list of the squares of each number.
////
////		```java
        List<Integer> numbers4 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // Enter your code here
        Stream<Integer> s4 = numbers4.stream();
        List<Integer> squares = s4.map((ele)->ele*ele).collect(Collectors.toList());
        System.out.println(squares);
//
//		//```
//
////		5. For a list of strings, return a list of the length of each string.
////
////		```java
        List<String> names5 = List.of("Tantia Tope", "Rani Lakshmibai", "Mangal Pandey", "Nana Sahib");
        // Enter your code here
        Stream<String> s5 = names5.stream();
        List<Integer> len = s5.map((ele)->ele.length()).collect(Collectors.toList());
        System.out.println(len);
////		```
////
////		6. For a list of strings, filter out the strings which do not start with the letter `T` and then uppercase the remaining strings.
////
//		```java
		List<String> names6 = List.of("Tantia Tope", "Rani Lakshmibai", "Mangal Pandey", "Nana Sahib");
//		// Enter your code here
		Stream<String> s6 = names6.stream();
        List<String> res = s6.filter((name)-> !(name.startsWith("T"))).map((ele)->ele.toUpperCase()).toList();
        System.out.println(res);

//		List<String> result = s.filter((ele)->{ return ele.charAt(0)!='T';}).map((ele)->ele.toUppercase()).collect(Collectors.toList());
////		```
////
////		7. For a list of strings, filter out the strings which do not start with the letter `T`, then uppercase the remaining strings and then sort them.
////
////		```java
		List<String> names7 = List.of("Tantia Tope", "Rani Lakshmibai", "Mangal Pandey", "Nana Sahib");
		// Enter your code here
		Stream<String> s7 = names7.stream();
        List<String> res1 = s7.filter(name->!(name.startsWith("T"))).map(ele->ele.toUpperCase()).sorted().toList();
        System.out.println("s7  "+res1 );
//		List<String> result = s.filter((ele)->{ return ele.startsWith("T");}).map((ele)->ele.toUpperCase()).sorted().collect(Collectors.toList());
////		```
////
////		8. For a list of integers, find the sum of all the numbers.
////
////		```java
		List<Integer> numbers8 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		// Enter your code here

        Stream<Integer> s8 = numbers8.stream();
        int sum = s8.reduce(0,(ele1,ele2)->ele1+ele2);
        System.out.println("s8  "+sum);

////		```
////
////		9. For a list of integers, find the sum of the squares of all the numbers.
////
////		```java
		List<Integer> numbers9 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		// Enter your code here
        Stream<Integer> s9 = numbers9.stream();
        int sum2 = s9.map(ele->ele*ele).reduce(0,(ele1,ele2)->ele1+ele2);
        System.out.println("s9  "+ sum2);
////		```
////
////		10. For a list of integers, find the sum of the squares of all the even numbers.
////
////		```java
		List<Integer> numbers10 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		// Enter your code here
        Stream<Integer> s10 = numbers10.stream();
        int sum3 = s10.filter(ele->ele%2 ==0).map(ele->ele*ele).reduce(0,(ele1,ele2)->ele1+ele2);
        System.out.println("s10  "+sum3);
////		```
////
////		11.  Given a list of numbers, find the maximum number in the list.
////
////
////		```java
		List<Integer> numbers11 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		// Enter your code here
        Stream<Integer> s11 = numbers11.stream();
        int max = s11.max((ele1,ele2)->ele1-ele2).get();
        System.out.println("s11  "+max);
////		```
////
////		12. Given a list of numbers with duplicates, find the distinct numbers in the list.
////
////		```java
		List<Integer> numbers12 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5);

		// Enter your code here
        Stream<Integer> s12 = numbers12.stream();
        List<Integer> dis = s12.distinct().toList();
        System.out.println("s12  "+dis);
////		```
////
////		13.  Given a list of numbers, find the average of all the numbers.
////		```java
		List<Integer> numbers13 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		// Enter your code here
        Stream<Integer> s13 = numbers13.stream();
        double avg = s13.mapToInt(s14 -> s14.intValue()).average().getAsDouble();
        System.out.println("s13  "+avg);
//        Stream<Integer> s131 = numbers13.stream();
//        int count = (int) s131.count();
//        int sum13 = s13.reduce(0,(ele1,ele2)->ele1+ele2);
//        System.out.println("s13  "+(double)sum13/count);
////		```
////
////		14. Give a list of strings, find the average length of all the strings.
////
////		```java
		List<String> names14 = List.of("Tantia Tope", "Rani Lakshmibai", "Mangal Pandey", "Nana Sahib");
		// Enter your code here
        Stream<String> s14 = names14.stream();
        double avg1 = s14.mapToInt(n->n.length()).average().getAsDouble();
        System.out.println("s14 "+avg1);

////		```
////
////		15.  Given a list of strings, find the first string that is longer than 10 characters.
////
////		```java
		List<String> names15 = List.of("Tantia Tope", "Rani Lakshmibai", "Mangal Pandey", "Nana Sahib");
//		// Enter your code here
        Stream<String> s15 = names15.stream();
        String str = s15.filter(ele->ele.length()>10).findFirst().orElse("");
        System.out.println("s15   "+ str);
////		```

    }
}
