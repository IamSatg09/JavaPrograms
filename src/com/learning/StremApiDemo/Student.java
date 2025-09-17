package com.learning.StremApiDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Student {

	private int id;
	private String name;
	private int marks;
	private String grade;
	
	
	public Student() {
		super();
	}


	public Student(int id, String name, int marks, String grade) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.grade = grade;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}


	public String getGrade() {
		return grade;
	}


	public void setGrade(String grade) {
		this.grade = grade;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", grade=" + grade +"]";
	}
	
	@Override
	public int hashCode() {
        return Objects.hash(id,name,marks,grade);
	}

	@Override
	public boolean equals(Object obj) {
		if(this==obj) return true;
		if(!(obj instanceof Student)) return false;
		Student s=(Student) obj;
		
		return id==s.id  && marks==s.marks && Objects.equals(name, s.name) && Objects.equals(grade, s.grade);
		
	}


	public static void main(String args[])
	{
		List<Student> list=Arrays.asList(
				new Student(1,"sathish",95,"A"),
				new Student(1,"sathish",95,"A"),
				new Student(2,"santhosh",90,"A"),
				new Student(3,"shan",80,"B"),
				new Student(4,"shankar",70,"C")
				);
		
		
		System.out.println("All students Data");
		list.stream().forEach(System.out::println); //foreach termination operations
		
		System.out.println("\nstudens list marks greater than 80");
		list.stream().filter(n->n.getMarks()>80).forEach(System.out::println);
		
		System.out.println("\n Name of Students");
		list.stream().map(Student::getName).forEach(System.out::println);
		
		System.out.println("\nDistinct list of students");
		list.stream().distinct().forEach(System.out::println);
		
		List<Integer>list2=Arrays.asList(1,2,3,4,5,5,6,8,7);
		
		list2.stream().distinct().forEach(System.out::println);
		
		
		System.out.println("sorted lists");
		list2.stream().distinct().sorted().forEach(System.out::println);

		list.stream().distinct().skip(2).limit(1).forEach(System.out::print); //skip and set limit of values output
		
		list.stream().peek(s->System.out.println("\npeek before filter"+s)).filter(n->n.getMarks()>80).peek(s->System.out.println("\npeek after filter"+s)).forEach(System.out::println);
		
		int total=list.stream().map(Student::getMarks).reduce(0,Integer::sum);
		System.out.println(total);
		
		System.out.println("Example for findfirst");
		
		Student student=list.stream().findFirst().get();  //use when order matters
		System.out.println(student);
		
		System.out.println(list.parallelStream().findAny().get()); //use when order doesn't matter useful in parallel streams
		
		System.out.println("checking if anyone has grade A");
		
		System.out.println(list.stream().anyMatch(n-> n.getGrade()=="A"));
		System.out.println(list.stream().anyMatch(n-> n.getName().equals("sathish")));
		System.out.println(list.stream().noneMatch(n-> n.getMarks()<40));
		System.out.println(list.stream().allMatch(n->n.getMarks()>60));
		
		String joined=list.stream().map(Student::getName).collect(Collectors.joining(", "));
		System.out.println(joined);
		
		Map<String,List<Student>> groupingGrade=list.stream().collect(Collectors.groupingBy((Student::getGrade)));
		System.out.println(groupingGrade);
		
		Map<Boolean,List<Student>>partition=list.stream().collect(Collectors.partitioningBy(n-> n.getMarks()>80));
		System.out.println(partition);
		
		
        System.out.println("Sort by multiple fields using compartor in sorted()");
        list.stream().sorted(Comparator.comparing(Student::getId).thenComparing(Student::getName).reversed()).forEach(System.out::println);
        
        System.out.println("Sort by multiple fields using lambda in sorted()");

        list.stream().sorted(Comparator.comparing(Student::getGrade)).forEach(System.out::println);
        
        System.out.println("minimum mark scored student data:");
        System.out.println(list.stream().min(Comparator.comparing(Student::getMarks)).get());
        System.out.println("Maximum mark scored student data:");
        
        System.out.println(list2.stream().max(Comparator.naturalOrder()).get());
        System.out.println(list2.stream().max(Comparator.reverseOrder()).get());
        
       
        List<String> str=Arrays.asList("hello","java","welcome","python","aaaaaaaaaa");
        System.out.println(str.stream().map(n->n.length()).max(Comparator.naturalOrder()).get());

        str.stream().map(String::length).max(Comparator.naturalOrder()).get();
        
        System.out.println(str.stream().max(Comparator.comparingInt(String::length)).get());
        
        
        
        Map<String,Integer>combined=list.stream().collect(Collectors.groupingBy(Student::getGrade,Collectors.summingInt(Student::getMarks)));
        System.out.println(combined);
        
        List<Integer> list3=Arrays.asList(9,20,11,null,12,7,null,8);
       
//        list.stream();
//		Stream<Integer> combinedList =Stream.concat(list2.stream(), list3.stream()).sorted();
//        List<Integer> combinedList2=Stream.concat(list2.stream(), list3.stream()).sorted().distinct().collect(Collectors.toList());
//        
//        System.out.println("Stream list\n"+combinedList);
//        System.out.println( "list\n"+combinedList2);
//        
//        Map<Integer,Long> fre=list2.stream().sorted().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//        System.out.println(fre);
//        		
//        Collections.sort(list3);
        
        list3.sort(Comparator.nullsFirst((Comparator.naturalOrder())));
        System.out.println(list3);

        

	}
	
}
