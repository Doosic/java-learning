package class1;

public class ClassStart4 {

  public static void main(String[] args) {
    Student student1 = new Student(); // 00x1
    student1.name = "학생1";
    student1.age = 15;
    student1.grade = 90;

    Student student2 = new Student(); // 00x2
    student2.name = "학생2";
    student2.age = 16;
    student2.grade = 80;

   /*
      - stack memory 에 참조값, heap memory 에 실제 객체값. 참조값이 없을경우 null로 초기화된다.
      - 00x1(참조값), 00x2(참조값)을 가진 공간에 student1, student2의 참조값을 복사해서 저장한다.
      - 자바에서의 대입은 항상 변수에 들어 있는 값을 복사한다. (깊은복사-실제값, 얕은복사-참조값)
    */
    Student[] students = new Student[] {student1, student2}; // fixed size의 특성을 가진 array 자료구조!

    // 변수명 그대로 사용하기
    for (int i = 0; i < students.length; i++){
      System.out.println("이름: " + students[i].name + " 나이:" + students[i].age + " 성적:" + students[i].grade);
    }

    /*
		   - forEach문을 사용하여 변수를 하나씩 꺼내 사용하기
       뭔가 수정하고 추가 할 때 사용하기 참 좋다.
       예를 들어 이미지의 기본경로를 설정할 때
       로컬, 테스트, 운영 환경에 따라 imageRootPath가 변할 수 있어 설정하기 좋다.
       ex) properties.getImageRootPath() + s.getFileName();
    */
    for (Student s : students){
      System.out.println("이름: " + s.name + " 나이:" + s.age + " 성적:" + s.grade);
      // ex) s.setImageThumbImageUrl(properties.getImageRootPath() + s.getFileName());
    }
  }
}
