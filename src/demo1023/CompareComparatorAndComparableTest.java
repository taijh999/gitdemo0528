package demo1023;
import java.util.*;
import java.lang.Comparable;

/**
 * @desc "Comparator"�͡�Comparable���ıȽϳ���
 *   (01) "Comparable"
 *   ����һ������ӿڣ�ֻ����һ������compareTo()��
 *   һ����ʵ����Comparable�ӿڣ�����ζ�š����౾��֧�����򡱣�������ֱ��ͨ��Arrays.sort() �� Collections.sort()��������
 *   (02) "Comparator"
 *   ����һ���Ƚ����ӿڣ���������������compare() �� equals()��
 *   һ����ʵ����Comparator�ӿڣ���ô������һ�����Ƚ��������������࣬���Ը��ݸñȽ���ȥ����
 *
 *   ����������Comparable���ڲ��Ƚ�������Comparator���ⲿ�Ƚ�����
 *   һ���౾��ʵ����Comparable�Ƚ���������ζ��������֧��������������ûʵ��Comparable��Ҳ����ͨ���ⲿ�Ƚ���Comparator��������
 */
public class CompareComparatorAndComparableTest{

    public static void main(String[] args) {
        // �½�ArrayList(��̬����)  ssss
        ArrayList<Person> list = new ArrayList<Person>();
        // ��Ӷ���ArrayList��
        list.add(new Person("ccc", 20));
        list.add(new Person("AAA", 30));
        list.add(new Person("bbb", 10));
        list.add(new Person("ddd", 40));

        // ��ӡlist��ԭʼ����
        System.out.printf("Original  sort, list:%s\n", list);

        // ��list��������
        // �������ݡ�Personʵ�ֵ�Comparable<String>�ӿڡ��������򣬼�����ݡ�name����������
        Collections.sort(list);
        System.out.printf("Name      sort, list:%s\n", list);

        // ͨ�����Ƚ���(AscAgeComparator)������list��������
        // AscAgeComparator������ʽ�ǣ����ݡ�age������������
        Collections.sort(list, new AscAgeComparator());
        System.out.printf("Asc(age)  sort, list:%s\n", list);

        // ͨ�����Ƚ���(DescAgeComparator)������list��������
        // DescAgeComparator������ʽ�ǣ����ݡ�age���Ľ�������
        Collections.sort(list, new DescAgeComparator());
        System.out.printf("Desc(age) sort, list:%s\n", list);

        // �ж�����person�Ƿ����
        testEquals();
    }

    /**
     * @desc ��������Person�Ƚ��Ƿ���ȡ�
     *   ����Personʵ����equals()����������person��age��name����ȣ�����Ϊ������person��ȡ�
     *   ���ԣ������p1��p2��ȡ�
     *
     *   TODO����ȥ��Person�е�equals()��������p1������p2
     */
    private static void testEquals() {
        Person p1 = new Person("eee", 100);
        Person p2 = new Person("eee", 100);
        if (p1.equals(p2)) {
            System.out.printf("%s EQUAL %s\n", p1, p2);
        } else {
            System.out.printf("%s NOT EQUAL %s\n", p1, p2);
        }
    }

    /**
     * @desc Person�ࡣ
     *       Personʵ����Comparable�ӿڣ�����ζ��Person����֧������
     */
    private static class Person implements Comparable<Person>{
        int age;
        String name;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String toString() {
            return name + " - " +age;
        }

        /**
         * �Ƚ�����Person�Ƿ���ȣ������ǵ�name��age����ȣ�����Ϊ�������
         */
        boolean equals(Person person) {
            if (this.age == person.age && this.name == person.name)
                return true;
            return false;
        }

        /**
         * @desc ʵ�� ��Comparable<String>�� �Ľӿڣ�����дcompareTo<T t>������
         *  ������ͨ����person�����֡����бȽϵ�
         */
        @Override
        public int compareTo(Person person) {
            return name.compareTo(person.name);
            //return this.name - person.name;
        }
    }

    /**
     * @desc AscAgeComparator�Ƚ���
     *       ���ǡ�Person��age������Ƚ�����
     */
    private static class AscAgeComparator implements Comparator<Person> {
        
        @Override 
        public int compare(Person p1, Person p2) {
            return p1.getAge() - p2.getAge();
        }
    }

    /**
     * @desc DescAgeComparator�Ƚ���
     *       ���ǡ�Person��age������Ƚ�����
     */
    private static class DescAgeComparator implements Comparator<Person> {
        
        @Override 
        public int compare(Person p1, Person p2) {
            return p2.getAge() - p1.getAge();
        }
    }

}