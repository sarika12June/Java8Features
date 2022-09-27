# Java8Features

#Lambda Expression => expression through which we can represent the anonymous function

syntax : CustomFunctionInterfaceName cfin = ()->{}

we can call anonymous function only if exisists in functional interface

#Functional interface[SAM] :

  Interface which contains only one abstract method , can contains mutiple static and default methods
  
 example :
   runnable  =>run()
   callable  =>call()
   comparable=> compareTo()
   compartor => compare()
   
we have annoatation with @FunctionalInterface


add lombok jar as a dependence



# Consumer  Functional interface   : 
   when u have one  object as input parameter , need no return type (void)  and general it is used with forEach()
   method :accept(T t)
   example :
        Consumer consumer = t ->{
            System.out.println("consumer value is "+t);
        };
        consumer.accept(10);
		
		List<Integer>list =Arrays.asList(10,20,30,40);
        list.stream().forEach(t->{
            System.out.println("consumer values are "+t);
        });
  
   
# Predicate  Functional interface   : 
   normal it is used in conditional statement and have boolean has return type
   Generaly used with filter()
   method :test(T t)
   
 example :
        Predicate<Integer> predicate= t ->t%2 == 0;
        System.out.println(predicate.test(7));
		
		List<Integer> list= Arrays.asList(11,20,31,40);
        list.stream().filter(t->t%2 ==0).forEach(t-> System.out.println("after predicate values are "+t));
   
# Supplier Functional interface   :
    normal it is used return value which does not accept no input object
	 method :any return type get();
	 generally used to return some default value
	 
	 example :
	    Supplier<String> supplier =() -> "response from supplier ";
        System.out.println(supplier.get());

        List<String> list =Arrays.asList();// npo values in list
        System.out.println(list.stream().findAny().orElseGet(()->"no values"));


#StreamAPI 
      
	  Stream API is used to process the collection of objects
	  Stream ApI is a sequence of objects that supports various methods  which can be pipelinned to produce desired result
	  
	  it is not data structure , it takes  collection , array and io
	  it does not change under lying data structure
	  
#features of stream
	  we can achieve functional programming
	  code reduce
	  used in bulk operation
	  
# ForEach
	#list
	   List<String> list = new ArrayList<>();
			list.add("Sarika");
			list.add("Aadhya");
			list.add("Srikanth");
			list.add("Vijaya");

			list.stream().forEach(i-> System.out.println("For each consumer values are "+i));
	#map
	   Map<Integer,String> map=new HashMap<>();
			map.put(1,"Sarika");
			map.put(2,"Aadhya");
			map.put(3,"Srikanth");
			map.put(4,"Vijaya");

		map.entrySet().forEach(i-> System.out.println("for each map key is "+i.getKey()+" values is "+i.getValue
      

#filter 

	#list
	   List<String> list = new ArrayList<>();
			list.add("Sarika");
			list.add("Aadhya");
			list.add("Srikanth");
			list.add("Vijaya");
			list.stream().filter(i->i.contains("h")).forEach(i-> System.out.println("list  filter "+i));
	#map
			Map<Integer,String> map=new HashMap<>();
			map.put(1,"Sarika");
			map.put(2,"Aadhya");
			map.put(3,"Srikanth");
			map.put(4,"Vijaya");

		 map.entrySet().stream().filter(t->t.getValue().contains("V")).forEach(i-> System.out.println("map filter "+i.getValue()))	;
		
#Collect 
 #1  
    private  @Getter @Setter  int empId;
    private  @Getter @Setter  String empName;
    private  @Getter @Setter  String dept;
    private  @Getter @Setter String empAddress;
    private  @Getter @Setter  long salary;
	
#2
    public static List<Employee> getEmployees(){
        List<Employee> list =new ArrayList<>();
        list.add(new Employee(101,"Srikannth","IT","Hyderabad", 920000));
        list.add(new Employee(102,"Sarika","HR","Bangalore", 700000));
        list.add(new Employee(101,"Aadhya","Finance","Kerala", 600000));
        list.add(new Employee(101,"Vijaya","Admin","Chennai", 900000));
        return list;
    }

#3
     List<Employee> list=EmployeeSalary.getEmployees().stream().filter(emp->emp.getSalary() >= 900000).collect(Collectors.toList());
        list.stream().forEach(t-> System.out.println(t));
		


#Sorting list and map using stream and sorted with compartor

#List

#1
		@NoArgsConstructor
		@AllArgsConstructor
		@ToString
		public class Employee {

			private  @Getter @Setter  int empId;
			private  @Getter @Setter  String empName;
			private  @Getter @Setter  String dept;
			private  @Getter @Setter String empAddress;
			private  @Getter @Setter  long salary;
	    }
		
#2
     public static List<Employee> getEmployees(){
        List<Employee> list =new ArrayList<>();
        list.add(new Employee(101,"Srikannth","IT","Hyderabad", 920000));
        list.add(new Employee(102,"Sarika","HR","Bangalore", 700000));
        list.add(new Employee(103,"Aadhya","Finance","Kerala", 600000));
        list.add(new Employee(104,"Vijaya","Admin","Chennai", 900000));
        return list;
    }
	
#3
        List<Employee>list=EmployeeSalary.getEmployees();
        Collections.sort(list,(emp,emp1)-> (int) (emp1.getSalary() -emp.getSalary()));
       // System.out.println("general sorting with stream "+list);
        list.stream().sorted((emp,emp1)-> (int) (emp1.getSalary() -emp.getSalary())).forEach(t ->{
            //System.out.println("from stream "+t.getEmpName());
        });
        list.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(t->{
            System.out.println(" using functional reference "+t);
        });
		


#retirve map

        Map<Employee,Integer> map=new HashMap<>();
        map.put(new Employee(101,"Srikannth","IT","Hyderabad", 920000),10);
        map.put(new Employee(102,"Sarika","HR","Bangalore", 700000),20);
        map.put(new Employee(103,"Aadhya","Finance","Kerala", 600000),30);
        map.put(new Employee(104,"Vijaya","Admin","Chennai", 900000),40);
        map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary))).forEach(i-> System.out.println("map "+i));
		


# difference Map and Flat map
    both are intermediate methods which returns another stream object
	Map :it is used for transformation
	FlatMap : it is used for transformation and flaterring
	
	
Map : Stream<R> map(function <? Super T ,? extends R>mapper){return  Stream<R>}
it is mapper function produces single values for each input value,hence it is called one to one mapping

FlatMap :  it takes stream of stream as input  return stream as output
Stream<R> map(Stream<II>(Stream<I>) m){return  Stream<R>}
it is mapper function produces Mutiple  values for each input value,hence it is called one to many mapping


converting single stream as another Stream is map .['a','b']=>['A','B']
converting stream of stream as another single stream =>[[a,b],[c,d]]=>['a','b','c','d']




#1 
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Customer {
    private @Getter @Setter int id;
    private @Getter @Setter String name;
    private @Getter @Setter  String email;
    private @Getter @Setter List<String> phoneNumbers;
	
#2
   public static List<Customer> getCustomers(){
     return  Stream.of(
              new Customer(101, "john", "john@gmail.com", Arrays.asList("397937955", "21654725")),
              new Customer(102, "smith", "smith@gmail.com", Arrays.asList("89563865", "2487238947")),
              new Customer(103, "peter", "peter@gmail.com", Arrays.asList("38946328654", "3286487236")),
              new Customer(104, "kely", "kely@gmail.com", Arrays.asList("389246829364", "948609467"))
      ).collect(Collectors.toList());
    }
	
#3
  List<String> emails=CustomerDAO.getCustomers().stream().map(customer -> customer.getEmail()).collect(Collectors.toList());
        emails.stream().forEach(i ->{
            System.out.println("using map "+i);
        });
		
#4

	List<String> pheNumber=CustomerDAO.getCustomers().stream().flatMap(customer -> customer.getPhoneNumbers().stream()).collect(Collectors.toList());
	pheNumber.stream().forEach(i ->{
				System.out.println("using flat map "+i);
	 });


Differences between Java 8 Map() Vs flatMap() :

map() | flatMap() | 
--- | --- |  
It processes stream of values. | It processes stream of stream of values. 
It does only mapping. | It performs mapping as well as flattening.
It’s mapper function produces single value for each input value. | It’s mapper function produces multiple values for each input value. 
It is a One-To-One mapping. | It is a One-To-Many mapping. 
Data Transformation : From Stream<T> to Stream<R> | Data Transformation : From Stream<Stream<T> to Stream<R> 
Use this method when the mapper function is producing a single value for each input value. | Use this method when the mapper function is producing multiple values for each input value. 






		 
		
	
		
		


   

	
   
