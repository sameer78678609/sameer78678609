
class Student{
	String name;
	String id;
	int rollno,age;
	
	
    public void print(){
	System.out.println(name);
	System.out.println(id);
	System.out.println(rollno);
	System.out.println(age);

}
}

class Classschedule{
	String days;
	String timing;
	int roomno;

    public void print(){
	System.out.println(days);
	System.out.println(timing);
	System.out.println(roomno);

}
}

class Adminblock{
	String employeenames;
	int blockid;
	
    public void print(){
	System.out.println(employeenames);
	System.out.println(blockid);

}
}

class Academicblock{
	String department,headname;
	int floor;
	String labs;
    public void print(){
	System.out.println(department);
    System.out.println(headname);
	System.out.println(floor);
	System.out.println(labs);

}
}

class Course{
	String courseid;
	int classes;
	char grade;
    public void print(){
	System.out.println(courseid);
	System.out.println(classes);
	System.out.println(grade);

}
}

class Teacher{
	String teacherid,teachername;
	int experience;
	String department;
    public void print(){
	System.out.println(teacherid);
	System.out.println(teachername);
	System.out.println(experience);
	System.out.println(department);

}
}

class Lab{
	String labname;
	int computerno;
	int blockid;
    public void print(){
	System.out.println(labname);
	System.out.println(computerno);
	System.out.println(blockid);
	

}
}

class Commonroom{
    String roomtype;
    float capacity;
    public void print(){
        System.out.println(roomtype);
        System.out.println(capacity);
    }
}

class Ground{
    String gametype;
    int size;
    public void print(){
        System.out.println(gametype);
        System.out.println(size);
    }
}

class Parking{
    String groundid;
    String nearby;
    int capacity;

    public void print(){
        System.out.println(groundid);
        System.out.println(nearby);
        System.out.println(capacity);
    }
}

class Canteen{
    String canteenid, name;
    int timing;
    public void print(){
        System.out.println(canteenid);
        System.out.println(name);
        System.out.println(timing);
    }
}

class Classroom{
    String roomid;
    String blockid;
    int capacity, floor;
    public void print(){
        System.out.println(roomid);
        System.out.println(blockid);
        System.out.println(capacity);
        System.out.println(floor);
    } 
}

class Library{
    String librarianname;
    int noOfBooks;
    public void print(){
        System.out.println(librarianname);
        System.out.println(noOfBooks);
    }
}

class Program{
    int totalsemester;
    int duration;
    String degreename;
    public void print(){
        System.out.println(totalsemester);
        System.out.println(duration);
        System.out.println(degreename);
    }
}

class Admissionform{
    String studentname;
    int id,cnic;
    String department;
    public void print(){
        System.out.println(studentname);
        System.out.println(id);
        System.out.println(cnic);
        System.out.println(department);
    }
}

class Washroom{
    String washroomid;
    int blockid;
    
    public void print(){
        System.out.println(washroomid);
        System.out.println(blockid);
        
    }
}

class Hostel{
    String name;
    int hostelid;
    int floor;
    public void print(){
        System.out.println(name);
        System.out.println(hostelid);
        System.out.println(floor);
    }
}
class Section{
    String sectionid, sectionname;
    String batchofyear;
    int noOfstudent;

    public void print(){
        System.out.println(sectionid);
        System.out.println(sectionname);
        System.out.println(batchofyear);
        System.out.println(noOfstudent);
    }
}
public class hitms1{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name ="Sameer";
        s1.id = "24BSSW066";
        s1.age = 18;
        s1.rollno =232323;

        s1.print();
        System.out.println();

        Classschedule sh1= new Classschedule();
        sh1.days= "Monday to Friday";
        sh1.timing = "9 to 2";
        sh1.roomno= 16;

        sh1.print();


    }
}


