package LinkedList02WithInnerClassConcpetAlongTemplateClass;

public class main {
    public static void main(String[] args) {
        Operations<Integer> s = new Operations<>();

Operations<Integer>.Inner s2 = s.new Inner();

//Operations<String>.Inner s3 = s.new Inner();

s2.accessMethodInner();



    }
}
